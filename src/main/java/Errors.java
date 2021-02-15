public class Errors {

    public static void printError(Exception e) {
        System.out.println();
        System.out.println(e.getMessage());
    }

    public static void WrongLockerNumber() {
        System.out.println();
        System.out.println("[ ERROR ] 해당 라커 번호는 존재하지 않습니다.");
        System.out.println();
    }

    public static void WrongMenuNumber() {
        System.out.println();
        System.out.println("[ ERROR ] 유효하지 않은 메뉴입니다.");
        System.out.println();
    }

    public static void NeedToInputNumber() {
        System.out.println();
        System.out.println("[ ERROR ] 숫자를 입력해주세요.");
        System.out.println();
    }

    public static void WrongOperationSelected() {
        System.out.println();
        System.out.println("[ ERROR ] 올바르지 않은 명령.");
        System.out.println();
    }

    public static void UnoccupiedLocker() {
        System.out.println();
        System.out.println("[ ERROR ] 등록되어 있지 않은 라커입니다.");
        System.out.println();
    }

    public static void OccupiedLocker() {
        System.out.println();
        System.out.println("[ ERROR ] 이미 등록된 라커입니다.");
        System.out.println();
    }

    public static void OverBudget() {
        System.out.println();
        System.out.println("[ ERROR ] 10만원이 넘어갑니다.");
        System.out.println();
    }
}
