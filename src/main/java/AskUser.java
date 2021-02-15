public class AskUser {

    public static void AskWhichLockerToUse() {
        System.out.println();
        System.out.println("사우나 라커 번호를 입력해주시요. (q를 입력하여 프로그램 종료 가능)");
    }

    public static void AskWhatToDo(int LockerNumber) {
        System.out.println();
        System.out.printf("%d번 라커에 어떤 것을 하시겠습니까?",LockerNumber);
        System.out.println();
        System.out.println("1. 손님 등록하기");
        System.out.println("2. 요리 금액 추가하기");
        System.out.println("3. 결제하고 퇴장하기");
        System.out.println("B. 뒤로가기");
    }



}
