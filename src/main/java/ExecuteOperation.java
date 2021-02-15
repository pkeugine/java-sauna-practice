public class ExecuteOperation {

    public static int ExecuteOperationNumber(int OperationNum, int input_locker_number) {
        boolean check_occupation = CheckOccupationAt(input_locker_number);
        if ( OperationNum == 0 )  return 0;
        if ( OperationNum == 1 ) { LockerOccupationOperator(input_locker_number,check_occupation); return 1;}
        if ( OperationNum == 2 ) { ExecuteOperationNumberTwo.OperationNumberTwo(check_occupation,input_locker_number); return 1;}
        if ( OperationNum == 3 ) { ExecuteOperationNumberThree.ExecuteOperationNumberThreeMethod(input_locker_number); return 1;}
        return -1;
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
