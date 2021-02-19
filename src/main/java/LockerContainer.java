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

  public boolean getOccupation() {
    return this.occupation;
  }

  public void addFee(Integer fee) {
    this.fee += fee;
  }

  public void setFee(Integer fee) {
    this.fee = fee;
  }

  public Integer getFee() {
    return this.fee;
  }

  public void setLockerNumber(Integer lockerNumber) {
    this.lockerNumber = lockerNumber;
  }

  public Integer getLockerNumber() {
    return this.lockerNumber;
  }



}
