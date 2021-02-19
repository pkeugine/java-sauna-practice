public class LockerPrint {

  public final String LOCKER_TOP = "┌ ────── ┐";
  public final String OCCUPATION_NUBMER = "| %c   %02d |";
  public final String LOCKER_BOTTOM = "└ %06d ┘";
  public final String ZERO_BOTTOM = "└ ────── ┘";

  public void printLockerData(Locker locker) {
    int start = 1 , end = 10;
    for (int i =0 ; i < 5 ; i++) {
      printLockerDataFromTopBlock(start, end, locker);
      printLockerDataFromTopBlock(start, end, locker);
      start += 10;
      end += 10;
    }
  }

  public void printLockerDataFromTopBlock(int start, int end, Locker locker) {
    for (int i=start; i <= end; i++) { System.out.print(LOCKER_TOP); }
    System.out.println();
    for (int i=start; i <= end; i++) {
      Character occupation ='X';
      if (locker.checkLockerOccupation(i)) {
        occupation = 'O';
      }
      System.out.printf(OCCUPATION_NUBMER,occupation,i);
    }
    System.out.println();
  }

  public void printLockerDataFromBottomBlock(int start, int end, Locker locker) {
    for (int i=start; i <= end; i++) {
      Integer fee = locker.getLockerFee(i);
      if (fee == 0) {
        System.out.print(ZERO_BOTTOM);
      }
      if (fee > 0) {
        System.out.printf(LOCKER_BOTTOM,fee);
      }
    }
    System.out.println();
  }
}
