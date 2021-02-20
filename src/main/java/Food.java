import java.util.HashMap;

public class Food {

  private HashMap<Integer,FoodContainer> foodData = new HashMap<>();

  Food() {
    foodData.put(1,new FoodContainer("생수",1000));
    foodData.put(2,new FoodContainer("바나나 우유",2000));
    foodData.put(3,new FoodContainer("맥반선 계란 세트",4000));
    foodData.put(4,new FoodContainer("만두 라면",4500));
    foodData.put(5,new FoodContainer("인기가요 샌드위치",5000));
    foodData.put(6,new FoodContainer("냉동 피자",5800));
    foodData.put(7,new FoodContainer("칼국수",6900));
    foodData.put(8,new FoodContainer("과일 세트",7900));
    foodData.put(9,new FoodContainer("짜장면 세트",10000));
    foodData.put(10,new FoodContainer("수제 팥빙수",15000));
  }

  public String getFoodName(int food_number) {
    FoodContainer temp = foodData.get(food_number);
    return temp.getFoodName();
  }

  public Integer getFoodCost(int food_number) {
    FoodContainer temp = foodData.get(food_number);
    return temp.getFoodCost();
  }

}
