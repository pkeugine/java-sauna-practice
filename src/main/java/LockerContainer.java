public class LockerContainer {

  LockerContainer() {
    this.occupation = false;
    this.fee = 0;
  }

  private boolean occupation;
  private Integer fee;

  public void setOccupation(boolean set) {
    this.occupation = set;
  }

  public void addFee(Integer fee) {
    this.fee += fee;
  }

  public void setFee(Integer fee) {
    this.fee = fee;
  }

  public boolean getOccupation() {
    return this.occupation;
  }

  public Integer getFee() {
    return this.fee;
  }
}
