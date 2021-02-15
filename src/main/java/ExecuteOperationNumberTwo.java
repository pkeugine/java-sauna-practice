public class ExecuteOperationNumberTwo {

    // occupation == true -> means it is occupied , occupation == false means not occupied
    public static void OperationNumberTwo(boolean occupation, int locker_number) {
        if (occupation == false) {
            Errors.UnoccupiedLocker();
            return;
        }
        AskFoodNumber();
    }

    public static void AskFoodNumber() {
        String food_number;
        System.out.println("메뉴 번호를 골라주세요.");
        food_number=Application.sc.nextLine();
        int valid_food_number=CheckNumber.CheckGivenFoodNumber(food_number);
    }

}
