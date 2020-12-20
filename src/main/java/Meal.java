public class Meal<K, V extends Number> {
    private final K mealKey;
    private final V mealPrice;
    private final String name;

    public Meal(K mealKey, V mealPrice, String name) {
        this.mealKey = mealKey;
        this.mealPrice = mealPrice;
        this.name = name;
    }

    public K getMealKey() {
        return mealKey;
    }

    public V getMealPrice() {
        return mealPrice;
    }

    public String getName() {
        return name;
    }
}
