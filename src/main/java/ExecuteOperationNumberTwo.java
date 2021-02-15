public class ExecuteOperationNumberTwo {

    // occupation == true -> means it is occupied , occupation == false means not occupied
    public static void OperationNumberTwo(boolean occupation, int locker_number) {
        if (occupation == false) {
            Errors.UnoccupiedLocker();
            return;
        }
        int food_number = CheckValidtyOfGivenFoodNumber(AskFoodNumber());
        if ( food_number == -1 ) {
            return ;
        }
        if ( CheckFee(locker_number,food_number) == - 1) {
            Errors.OverBudget();
            return ;
        }
        AddFoodToLocker(locker_number,food_number);
    }

    public static String AskFoodNumber() {
        String food_string;
        Food_Menu.PrintFoodMenu();
        System.out.println("메뉴 번호를 골라주세요.");
        food_string=Application.sc.nextLine();
        return food_string;
    }

    public static int CheckValidtyOfGivenFoodNumber(String food_string) {
        int valid_food_number=CheckNumber.CheckGivenFoodNumber(food_string);
        if (valid_food_number == -1) {
            Errors.WrongMenuNumber();
            return -1;
        }
        return valid_food_number;
    }

    public static int CheckFee(int locker_number , int food_number) {
        if ( Locker.fee.get(locker_number-1) +  Food_Menu.food_costs[food_number - 1] > 100000 ) {
            return -1;
        }
        return 1;
    }

    public static void AddFoodToLocker(int locker_number, int food_number) {
        int locker_money = Locker.fee.get(locker_number-1);
        int food_cost = Food_Menu.food_costs[food_number-1];
        Locker.fee.set(locker_number-1,locker_money+food_cost);
        System.out.printf("[INFO] 라커 번호 %d번에 %d원을 추가하고 %s를 드렸습니다.",locker_number,food_cost,Food_Menu.food_names[food_number-1]);
        System.out.println();
        return ;
    }

}
