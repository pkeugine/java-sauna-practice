import java.util.Scanner;

public class ThirdPhaseOperation {

  Scanner scanner = new Scanner(System.in);
  Validate validate = new Validate();
  Error error = new Error();
  Food food = new Food();
  Info info = new Info();

  public void thirdPhaseOperation(String secOp, Integer lockerNumber, Locker l, Player p) {
    Integer secOpNum = Integer.parseInt(secOp);
    if (secOpNum == 1) {
      operationOne(lockerNumber,l);
      return;
    }
    if (secOpNum == 2) {
      operationTwo(lockerNumber,l,p);
      return;
    }
    if (secOpNum == 3) {
      operationThree(lockerNumber,l);
      return;
    }
  }

  public void operationOne(Integer inputLockerNumber, Locker locker) {
    if (locker.getLockerOccupation(inputLockerNumber)) {
      System.out.println();
      System.out.println("[INFO] 이미 등록된 라커 입니다.");
      System.out.println();
      return;
    }
    info.printInfoOccupationSuccessful(inputLockerNumber);
    locker.setLockerOccupation(inputLockerNumber, true);
    locker.setLockerFee9K(inputLockerNumber);
  }

  public void operationTwo(Integer lockerNumber, Locker locker, Player player) {
    if (!locker.getLockerOccupation(lockerNumber)) {
      error.printErrorLockerIsNotOccupied();
      return;
    }
    player.printFoodMenu();
    String input = scanner.nextLine();
    Integer menuNum = validate.foodMenuNumberValidtyCheck(input);

    if (menuNum == -1) {
      error.printErrorMenuNumberDoesNotExist();
      return ;
    }
    operationTwoSecondPhase(lockerNumber, locker, menuNum);
  }

  public void operationTwoSecondPhase(Integer lockerNumber, Locker locker, Integer menuNumber) {
    Integer currentFee = locker.getLockerFee(lockerNumber);
    Integer foodCost = food.getFoodCost(menuNumber);
    if (currentFee + foodCost > 100000) {
      error.printErrorFeeOverThan100K();
      return ;
    }
    locker.addFoodCost(lockerNumber,foodCost);
    info.printInfoFoodChoiceSuccessful(lockerNumber,menuNumber);
  }

  public void operationThree(Integer lockerNumber, Locker locker) {
    if (!locker.getLockerOccupation(lockerNumber)) {
      error.printErrorLockerIsNotOccupied();
      return;
    }
    Integer currentFee = locker.getLockerFee(lockerNumber);
    info.printInfoUserExit(lockerNumber);
    info.printInfoUserPayment(lockerNumber,currentFee);
    locker.checkoutLocker(lockerNumber);
  }

}