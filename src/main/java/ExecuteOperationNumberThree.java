public class ExecuteOperationNumberThree {

    public static void ExecuteOperationNumberThreeMethod(int locker_number) {
        if ( ExecuteOperation.CheckOccupationAt(locker_number) == false ) {
            Errors.UnoccupiedLocker();
            return ;
        }
        Info.UserExitInfo(locker_number);
        Locker.ClearLockerNumer(locker_number);
        return ;
    }

}
