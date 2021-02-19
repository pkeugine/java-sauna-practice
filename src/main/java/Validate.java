public class Validate {

  public boolean checkIfNumeric(String input) {
    if (input.matches("-?\\d+")) {
      return true;
    }
    return false;
  }

  public boolean checkIfB(String input) {
    if (input.equalsIgnoreCase("B")) {
      return true;
    }
    return false;
  }
}
