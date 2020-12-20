import java.util.List;
import java.util.Scanner;

public class View {

    public static final String LOCKER_TOP = "┌ ────── ┐";
    public static final String LOCKER_ID = "| %c   %02d |";
    public static final String LOCKER_BOTTOM = "└ ────── ┘";
    public static final String LOCKER_TOTAL_PRICE = "└ ₩%05d ┘";

    private static final Scanner scanner = new Scanner(System.in);
    public static final String INFO_LABEL = "[INFO] ";
    public static final String MENU_LABEL = "[MENU] ";

    public static String getLockerID() {
        System.out.println();
        System.out.println("사우나 라커 번호를 입력해주세요. (q를 입력하여 프로그램 종료를 할 수 있습니다.)");
        return scanner.nextLine();
    }

    public static String getActionType(String lockerID) {
        System.out.println();
        System.out.println(lockerID + "번 라커에 어떤 것을 하시겠습니까?");
        System.out.println("1. 손님 등록하기");
        System.out.println("2. 요리 금액 추가하기");
        System.out.println("3. 결제하고 퇴장하기");
        System.out.println("B. 뒤로가기");
        return scanner.nextLine();
    }

    public static String getMealSelection() {
        System.out.println();
        System.out.println("메뉴 번호를 골라주세요.");
        return scanner.nextLine();
    }

    public static void customerRegistered(String lockerID) {
        System.out.println();
        System.out.println(INFO_LABEL + lockerID + "번 라커에 손님이 등록되었습니다.");
    }

    public static void customerExited(String lockerID) {
        System.out.println();
        System.out.println(INFO_LABEL + lockerID + "번 라커의 손님이 나가셨습니다.");
    }

    public static void customerPay(CustomerContainer container) {
        System.out.println();
        System.out.println(
                container.getContainerID() + "번 라커의 손님이 결제하실 금액은 "
                        + container.getTotalPrice() + "원 입니다.");
    }

    public static void printError(Exception e) {
        System.out.println();
        System.out.println(e.getMessage());
    }

    public static void showMenu(List<Meal<Integer, Integer>> meals) {
        System.out.println();
        meals.forEach(x -> System.out.printf("%s [%03d] %-10s : %6d 원\n",
                MENU_LABEL, x.getMealKey(), x.getName(), x.getMealPrice()));
    }

    public static void showSaunaStatus() {
        System.out.println();
        printLockersFromTo(1, 10);
        printLockersFromTo(11, 20);
        printLockersFromTo(21, 30);
        printLockersFromTo(31, 40);
        printLockersFromTo(41, 50);
    }

    private static void printLockersFromTo(int start, int end) {
        for (int i = start; i <= end; ++i) {
            System.out.print(LOCKER_TOP);
        }
        System.out.println();
        for (int i = start; i <= end; ++i) {
            char availability = (Sauna.lockerTaken(i)) ? 'X' : 'O';
            System.out.printf(LOCKER_ID, availability, i);
        }
        System.out.println();
        for (int i = start; i <= end; ++i) {
            if (Sauna.lockerTaken(i)) {
                String lockerID = Integer.toString(i);
                int lockerPrice = Sauna.getLockers().stream()
                        .filter(x -> x.getContainerID().equals(lockerID))
                        .map(CustomerContainer::getTotalPrice)
                        .findFirst()
                        .orElseThrow(() -> new IllegalArgumentException("해당 라커는 사용되고 있지 않습니다"));
                System.out.printf(LOCKER_TOTAL_PRICE, lockerPrice);
            } else {
                System.out.print(LOCKER_BOTTOM);
            }
        }
        System.out.println();
    }

    public static void printLockerWithOrder(String lockerID, Meal<Integer, Integer> meal) {
        System.out.println();
        System.out.println(INFO_LABEL + "라커 번호 " + lockerID + "번에 "
                + meal.getMealPrice() + "원을 추가하고 " + meal.getName() + " 메뉴를 드렸습니다.");
    }
}
