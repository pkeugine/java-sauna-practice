public class Error {

  public void printErrorLockerNumberNotExist() {
    System.out.println("[ERROR] 해당 라커 번호는 존재하지 않습니다.");
    System.out.println();
  }

  public void printErrorLockerIsNotOccupied() {
    System.out.println("[ERROR] 등록되어 있지 않은 라커입니다.");
    System.out.println();
  }

  public void printErrorMenuNumberDoesNotExist() {
    System.out.println("[ERROR] 유효하지 않은 메뉴입니다");
    System.out.println();
  }

  public void printErrorOperationDoesNotExist() {
    System.out.println("[ERROR] 숫자를 입력해주세요.");
    System.out.println();
  }

  public void printErrorFeeOverThan100K() {
    System.out.println("[ERROR] 요금이 10만원을 넘어갑니다.");
    System.out.println();
  }
}
