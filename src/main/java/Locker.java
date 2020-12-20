public class Locker implements CustomerContainer {

    String lockerID;
    int totalPrice;

    public Locker(String lockerID, int initialPrice) {
        this.lockerID = lockerID;
        this.totalPrice = initialPrice;
    }

    @Override
    public void orderMeal(Meal<Integer, Integer> meal) {
        if (totalPrice + meal.getMealPrice() > 100000) {
            throw new IllegalArgumentException("[ERROR] 총 금액은 10만원을 넘길 수 없습니다.");
        }
        totalPrice += meal.getMealPrice();
    }

    @Override
    public String getContainerID() {
        return lockerID;
    }

    @Override
    public int getTotalPrice() {
        return totalPrice;
    }
}
