public class SecondPhase {

    public static void SecondPhaseMethod(int locker_number) {
        String input;
        Integer OperationNumber;
        while(true) {
            Locker.PrintLockers();
            AskUser.AskWhatToDo(locker_number);
            input = Application.sc.nextLine();
            OperationNumber = CheckNumber.CheckGivenOperationNumber(input);
            if ( ExecuteOperation.ExecuteOperationNumber(OperationNumber, locker_number) == 0 ) break;
        }
    }
}
