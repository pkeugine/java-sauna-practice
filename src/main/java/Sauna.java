import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sauna {

    public static boolean IS_OPEN = true;
    public static final int ENTER_PRICE = 9000;
    public static final int MAX_LOCKER_NUMBER = 50;
    public static final int MIN_LOCKER_NUMBER = 1;
    public static final int MAX_ACTION_NUMBER = 3;
    public static final int MIN_ACTION_NUMBER = 1;
    public static final String REGISTER_CUSTOMER = "1";
    public static final String ORDER_MEAL = "2";
    public static final String EXIT_CUSTOMER = "3";

    // collections to keep locker information and meal menu
    private static final List<CustomerContainer> lockers = new ArrayList<>();
    private static final List<Meal<Integer, Integer>> meals = new ArrayList<>();

    static {
        meals.add(new Meal<>(1, 1000, "생수"));
        meals.add(new Meal<>(2, 2000, "바나나 우유"));
        meals.add(new Meal<>(3, 4000, "맥반선 계란 세트"));
        meals.add(new Meal<>(4, 4500, "만두 라면"));
        meals.add(new Meal<>(5, 5000, "인기가요 샌드위치"));
        meals.add(new Meal<>(6, 5800, "냉동 피자"));
        meals.add(new Meal<>(7, 6900, "칼국수"));
        meals.add(new Meal<>(8, 7900, "과일 세트"));
        meals.add(new Meal<>(9, 10000, "짜장면 세트"));
        meals.add(new Meal<>(10, 15000, "수제 팥빙수"));
    }

    public void run() {
        View.showSaunaStatus();
        chooseLockerID();
    }

    private void chooseLockerID() {
        try {
            String currentLockerID = View.getLockerID();
            // check if the user wants to close the program first
            if (currentLockerID.equalsIgnoreCase("Q")) {
                IS_OPEN = false;
                return;
            }
            Validate.validateLockerID(currentLockerID);
            chooseLockerAction(currentLockerID);
        } catch (IllegalArgumentException e) {
            View.printError(e);
            chooseLockerID();
        }
    }

    private void chooseLockerAction(String lockerID) {
        String actionType = View.getActionType(lockerID);
        try {
            if (actionType.equalsIgnoreCase("B")) {
                return;
            }
            Validate.validateActionType(actionType);
            tackAction(actionType, lockerID);
        } catch (IllegalArgumentException e) {
            View.printError(e);
            chooseLockerAction(lockerID);
        }
    }

    // change user layout depending on what user chose before
    private void tackAction(String actionType, String lockerID) {
        if (actionType == REGISTER_CUSTOMER) {
            registerCustomer(lockerID);
        }
        if (actionType == ORDER_MEAL) {
            orderMeal(lockerID);
        }
        if (actionType == EXIT_CUSTOMER) {
            exitCustomer(lockerID);
        }
    }

    // register customer if the locker ID isn't already taken
    private void registerCustomer(String lockerID) {
        // check if the locker ID is already taken
        Validate.validateNoDuplicate(lockerID);

        lockers.add(new Locker(lockerID, ENTER_PRICE));
        View.customerRegistered(lockerID);
    }

    // get locker, order the meal, and put it in the collection again
    // the total price can't go over 100000 won
    private void orderMeal(String lockerID) {
        // check if the locker is being used by customer
        Validate.validateYesDuplicate(lockerID);

        View.showMenu(meals);

        String mealSelection = View.getMealSelection();
        Validate.validateMealSelection(mealSelection);

        CustomerContainer orderingLocker = findLocker(lockerID);
        orderingLocker.orderMeal(getMeal(mealSelection));

        View.printLockerWithOrder(lockerID, getMeal(mealSelection));
    }

    private void exitCustomer(String lockerID) {
        // check if the locker is being used by customer
        Validate.validateYesDuplicate(lockerID);

        View.customerExited(lockerID);
        View.customerPay(findLocker(lockerID));

        lockers.remove(findLocker(lockerID));
    }

    private CustomerContainer findLocker(String lockerID) {
        return lockers.stream()
                .filter(x -> x.getContainerID().equals(lockerID))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 해당 라커는 사용되고 있지 않습니다."));
    }

    public static boolean lockerTaken(int number) {
        String targetLockerID = Integer.toString(number);
        return lockers.stream()
                .map(CustomerContainer::getContainerID)
                .anyMatch(x -> x.equals(targetLockerID));
    }

    public static List<CustomerContainer> getLockers() {
        return Collections.unmodifiableList(lockers);
    }

    public static List<Meal<Integer, Integer>> getMeals() {
        return Collections.unmodifiableList(meals);
    }

    private Meal<Integer, Integer> getMeal(String mealSelection) {
        int intMealSelection = Integer.parseInt(mealSelection);
        return meals.get(intMealSelection - 1);
    }
}
