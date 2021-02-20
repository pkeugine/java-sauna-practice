import java.util.Scanner;

public class FirstPhaseOperation {

  Scanner scanner = new Scanner(System.in);
  Validate validate = new Validate();
  SecondPhaseOperation secondPhaseOperation = new SecondPhaseOperation();
  LockerPrint lockerPrint = new LockerPrint();

  public int firstPhaseOperation(Locker locker, Player player) {
    lockerPrint.printLockerData(locker);
    player.askWhichLockerToUse();
    String lockerNumber = scanner.nextLine();
    int valid = validate.firstValidityCheck(lockerNumber);
    if (valid == 1) {
      secondPhaseOperation.secondPhaseOperation(lockerNumber, player, locker);
    }
    return valid;
  }

}
