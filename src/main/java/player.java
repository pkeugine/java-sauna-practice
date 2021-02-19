public class player {

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

}
