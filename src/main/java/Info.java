public class Info {
    public static void RegisterInfo(int locker_number) {
        System.out.println();
        System.out.printf("[INFO] %d번 라커에 손님이 등록되었습니다.\n",locker_number);
        System.out.println();
    }

    public static void AddFoodInfo(int locker_number, int food_cost, String food_name) {
        System.out.println();
        System.out.printf("[INFO] 라커 번호 %d번에 %d원을 추가하고 %s를 드렸습니다.\n",locker_number,food_cost,food_name);
        System.out.println();
    }

    public static void UserExitInfo(int locker_number) {
        System.out.println();
        System.out.printf("[INFO] %d번 라커의 손님이 나가셨습니다.\n",locker_number);
        System.out.println();
        System.out.printf("%d번 라커의 손님이 결제하실 금액은 %d원입니다.\n",locker_number,Locker.fee.get(locker_number-1));
        System.out.println();
    }

}
