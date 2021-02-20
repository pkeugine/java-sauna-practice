import java.util.HashMap;

public class Locker {

  private HashMap<Integer,LockerContainer> lockerData = new HashMap<>(50);

  Locker() {
    for (int i = 0; i < 50 ; i++) {
      LockerContainer c = new LockerContainer();
      lockerData.put(i,c);
    }
  }

  public boolean getLockerOccupation(int lockerNumber) {
    LockerContainer temp = lockerData.get(lockerNumber-1);
    return temp.getOccupation();
  }

  public Integer getLockerFee(int lockerNumber) {
    LockerContainer temp = lockerData.get(lockerNumber-1);
    return temp.getFee();
  }

  public void setLockerOccupation(int lockerNumber, boolean occupation) {
    LockerContainer temp = lockerData.get(lockerNumber-1);
    temp.setOccupation(occupation);
    lockerData.put(lockerNumber-1,temp);
  }

  public void setLockerFee9K(int lockerNumber) {
    LockerContainer temp = lockerData.get(lockerNumber-1);
    temp.setFee(9000);
    lockerData.put(lockerNumber-1,temp);
  }

  public void addFoodCost(int lockerNumber, int foodCost) {
    LockerContainer temp = lockerData.get(lockerNumber-1);
    temp.addFee(foodCost);
    lockerData.put(lockerNumber-1,temp);
  }

  public void checkoutLocker(int lockerNumber) {
    LockerContainer temp = lockerData.get(lockerNumber-1);
    temp.setFee(0);
    temp.setOccupation(false);
    lockerData.put(lockerNumber-1,temp);
  }

}
