public class FoodContainer {

  FoodContainer( String foodName, Integer foodCost) {
    this.foodName = foodName;
    this.foodCost = foodCost;
  }

  private String foodName;
  private Integer foodCost;

  public Integer getFoodCost() {
    return foodCost;
  }

  public String getFoodName(){
    return foodName;
  }
}
