public class Validate {

  public Integer firstValidityCheck(String input) {
    if (checkIfQ(input)) {
      return 0;
    }
    if (checkIfNumeric(input) && checkRange(input,1,50)) {
      return 1;
    }
    return -1;
  }

  public Integer secondValidityCheck(String input) {
    if (checkIfB(input)) {
      return 0;
    }
    if (!checkIfNumeric(input) || !checkRange(input,1,3)) {
      return -1;
    }
    return Integer.parseInt(input);
  }
  // return -1 if unvalid input, return proper menu number if valid input
  public Integer foodMenuNumberValidtyCheck(String input) {
    if (checkIfNumeric(input) && checkRange(input,1,10)) {
      return Integer.parseInt(input);
    }
    return -1;
  }

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

  public boolean checkIfQ(String input) {
    if (input.equalsIgnoreCase("Q")) {
      return true;
    }
    return false;
  }

  public boolean checkRange(String input, int first, int last) {
    Integer in = Integer.parseInt(input);
    if (in < first || in > last) {
      return false;
    }
    return true;
  }
}
