public class LockerContainer {

  LockerContainer(int lockerNum) {
    this.occupation = false;
    this.fee = 0;
    this.lockerNumber = lockerNum;
  }

  private boolean occupation;
  private Integer fee;
  private Integer lockerNumber;

  public void setOccupation(boolean set) {
    this.occupation = set;
  }

  public void addFee(Integer fee) {
    this.fee += fee;
  }

  public void setFee(Integer fee) {
    this.fee = fee;
  }

  public void setLockerNumber(Integer lockerNumber) {
    this.lockerNumber = lockerNumber;
  }

  public boolean getOccupation() {
    return this.occupation;
  }

  public Integer getFee() {
    return this.fee;
  }

  public Integer getLockerNumber() {
    return this.lockerNumber;
  }



}
