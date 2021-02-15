public class ExecuteOperationNumberThree {

    public static void ExecuteOperationNumberThreeMethod(int locker_number) {
        System.out.printf("[INFO] %d번 라커의 손님이 나가셨습니다.\n",locker_number);
        System.out.println();
        System.out.printf("%d번 라커의 손님이 결제하실 금액은 %d원입니다.\n",locker_number,Locker.fee.get(locker_number-1));
        System.out.println();
        Locker.ClearLockerNumer(locker_number);
        return ;
    }

}
