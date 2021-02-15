public class ExecuteOperationNumberTwo {
    // occupation == true -> means it is occupied , occupation == false means not occupied
    public static void OperationNumberTwo(boolean occupation, int locker_number) {
        if (occupation == false) {
            Errors.UnoccupiedLocker();
            return;
        }
        Food_Menu.PrintFoodMenu();
    }

}
