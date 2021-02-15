

public class Food_Menu {

    public static final String[] food_names = new String[]{"생수", "바나나우유" , "맥반석 계란 세트", "만두 라면", "인기가요 샌드위치","냉동 피자", "칼국수", "과일 세트","짜장면 세트", "수제 팥빙수"};
    public static final Integer[] food_costs = new Integer[] {1000, 2000, 4000, 4500, 5000, 5800, 6900, 7900, 10000, 15000};

    public static void PrintFoodMenu() {
        for (int i=0 ; i < 10; i++) {
            System.out.printf("[MENU]  [%03d] %-12s : %5d 원", i+1, food_names[i], food_costs[i]);
            System.out.println();
        }
    }


}
