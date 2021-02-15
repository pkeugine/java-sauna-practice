import java.util.Scanner;

public class Application {
    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);

        String input = new String();
        Integer OperationNumber = 0;
        Locker locker = new Locker();
        Food_Menu m = new Food_Menu();
        CheckNumber CN = new CheckNumber();
        Errors E = new Errors();
        ExecuteOperation EO = new ExecuteOperation();

        while (true) {
            locker.PrintLockers();
            AskUser.AskWhichLockerToUse();
            input = sc.nextLine();
            Integer locker_number = CN.CheckGivenLockerNumber(input);
            if (locker_number == -1) {
                return;
            }
            if (locker_number >= 1) {
                AskUser.AskWhatToDo(locker_number);
                input = sc.nextLine();
                OperationNumber = CN.CheckGivenOperationNumber(input);
                ExecuteOperation.ExecuteOperationNumber(OperationNumber,locker_number);
            }
        }

    }
}
