public class Info {

  Food food = new Food();

  public void printInfoOccupationSuccessful(int lockerNumber){
    System.out.println();
    System.out.printf("[INFO] %d번 라커에 손님이 등록되었습니다.\n",lockerNumber);
    System.out.println();
  }

  public void printInfoFoodChoiceSuccessful(int lockerNumber, int foodNumber) {
    int foodCost = food.getFoodCost(foodNumber);
    String foodName = food.getFoodName(foodNumber);
    System.out.println();
    System.out.printf("[INFO] 러커 번호 %d번 %d원을 추가하고 %s를 드렸습니다.\n",lockerNumber,foodCost,foodName);
    System.out.println();
  }

  public void printInfoUserExit(int lockerNumber) {
    System.out.printf("[INFO] %d번 라커의 손님이 나가셨습니다.\n",lockerNumber);
    System.out.println();
  }

  public void printInfoUserPayment(int lockerNumber, int fee) {
    System.out.printf("%d번 라커의 손님이 결제하실 금액은 %d원 입니다.\n",lockerNumber,fee);
    System.out.println();
  }

}
