public class ExecuteOperation {

    public static void ExecuteOperationNumber(int OperationNum, int input_number) {
        if ( OperationNum == 0 ) {
            return ;
        }
        if ( OperationNum == 1 ) { //check occupation and add a owner if it is empty
            boolean check_occupation = CheckOccupationAt(input_number);
            LockerOccupationOperator(input_number,check_occupation);
        }
        if ( OperationNum == 2) {
            boolean check_occupation = CheckOccupationAt(input_number);
            ExecuteOperationNumberTwo.OperationNumberTwo(check_occupation,input_number);
        }
    }
    //return true if occupied , return false if not occupied
    public static boolean CheckOccupationAt(int input_number) {
        if ( Locker.occupation.get(input_number -1) == 'O' ) {
            return true;
        }
        return false;
    }
    //occupation == false means locker at number 'locker_number' is not occupied
    public static void LockerOccupationOperator(int locker_number, boolean occupation) {
        if (occupation == false) {
            Locker.occupation.set(locker_number - 1,'O');
            Locker.fee.set(locker_number -1 , 9000);
            return;
        }
        Errors.OccupiedLocker();
        return;
    }


}
