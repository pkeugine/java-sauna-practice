import java.util.Scanner;

public class Application {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String []args) {

        String input;
        Locker locker = new Locker();

        while (true) {
            locker.PrintLockers();
            AskUser.AskWhichLockerToUse();
            input = sc.nextLine();
            Integer locker_number = CheckNumber.CheckGivenLockerNumber(input);
            if (locker_number == -1) {
                return;
            }
            if (locker_number >= 1) {
                SecondPhase.SecondPhaseMethod(locker_number);
            }
        }

    }
}
