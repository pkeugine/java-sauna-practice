import java.util.Scanner;

public class SecondPhaseOperation{

  Scanner scanner = new Scanner(System.in);
  Validate validate = new Validate();
  ThirdPhaseOperation t = new ThirdPhaseOperation();
  Error error = new Error();
  LockerPrint lockerPrint = new LockerPrint();

  public void secondPhaseOperation(String lockerNumber, Player player, Locker locker) {
    Integer lockerNum = Integer.parseInt(lockerNumber);
    while (true) {
      player.askWhichOperationToExecute(lockerNum);
      String secondOperationNumber = scanner.nextLine();
      if ( validate.secondValidityCheck(secondOperationNumber) > 0) {
        t.thirdPhaseOperation(secondOperationNumber, lockerNum, locker, player);
        lockerPrint.printLockerData(locker);
      }
      if (validate.secondValidityCheck(secondOperationNumber) == -1) {
        error.printErrorOperationDoesNotExist();
      }
      if (validate.secondValidityCheck(secondOperationNumber)== 0)
        break;
   }
  }

}


