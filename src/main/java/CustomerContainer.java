public interface CustomerContainer {

    void orderMeal(Meal<Integer, Integer> meal);

    String getContainerID();

    int getTotalPrice();
}
