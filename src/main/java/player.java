public class player {

  Food f = new Food();

  public void askWhichLockerToUse() {
    System.out.println();
    System.out.println("사우나 라커 번호를 입력해주세요. (q)를 입력하여 프로그램을 종료할 수 있습니다.");
    System.out.println();
  }

  public void askWhichOperationToExecute(int lockerNumber) {
    System.out.println();
    System.out.printf("%d번 라커에 어떤 것을 하시겠습니까?",lockerNumber);
    System.out.println("1. 손님 등록하기");
    System.out.println("2. 요리 금액 추가하기");
    System.out.println("3. 결제하고 퇴장하기");
    System.out.println("B. 뒤로가기");
  }

  public void printFoodMenu() {
    System.out.println();
    for (int i=1; i <= 10; i++) {
      System.out.printf("[MENU]  [%02d] %10s :  %d 원\n",i,f.getFoodName(i),f.getFoodCost(i));
    }
    System.out.println();
    System.out.println("메뉴 번호를 골라주세요");
  }

  public void printInfoOccupationSuccessful(int lockerNumber){
    System.out.println();
    System.out.printf("[INFO] %d번 라커에 손님이 등록되었습니다.\n",lockerNumber);
    System.out.println();
  }

  public void printInfoFoodChoiceSuccessful(int lockerNumber, int foodNumber) {
    Integer foodCost = f.getFoodCost(foodNumber);
    String foodName = f.getFoodName(foodNumber);
    System.out.println();
    System.out.printf("[INFO] 러커 번호 %d번 %원을 추가하고 %s를 드렸습니다.\n",lockerNumber,foodCost,foodName);
    System.out.println();
  }


}
