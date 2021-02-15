public class CheckNumber {

    public static Integer CheckGivenLockerNumber(String choice) {
        if (CheckIfItISQ(choice)==true) {
            return -1;
        }
        if (CheckNumeric(choice)==0 ) {
            Errors.NeedToInputNumber();
            return 0;
        }
        if ( CheckRange(choice,1,50) == 0 ) {
            Errors.WrongLockerNumber();
            return 0;
        }
        return Integer.parseInt(choice);
    }

    public static int CheckRange(String locker_num, int first, int last) {
        int locker = Integer.parseInt(locker_num);
        if (locker < first || locker > last) {
           return 0;
        }
        return 1;
    }
    //return 1 -> number / return 0 -> not number
    public static int CheckNumeric(String str) {
        if (str.matches("-?\\d+")) {
           return 1;
        }
        return 0;
    }

    public static boolean CheckIfItISQ(String input) {
        if (input.equalsIgnoreCase("Q")) {
            return true;
        }
        return false;
    }

    public static int CheckOperationRange(String input) {
        int locker = Integer.parseInt(input);
        if (locker < 1 || locker > 3) {
            Errors.WrongOperationSelected();
            return -1;
        }
        return locker;
    }

    public static int CheckIfItISB(String input) {
        if (input.equalsIgnoreCase("B")) {
            return 0;
        }
        Errors.WrongOperationSelected();
        return -1;
    }

    //return value : 1,2,3,0 ( 0 means 'B' )
    public static int CheckGivenOperationNumber(String input) {
        int check_numeric = CheckNumeric(input);
        if (check_numeric == 1) { // means input is a number
            return CheckOperationRange(input);
        }
        if (check_numeric == 0) {
            return CheckIfItISB(input);
        }
        return -1;
    }


    //Check if selected food number is valid. Return -1 if not valid, returns integer in range [1,10] if valid
    public static int CheckGivenFoodNumber(String food_number) {
        if ( CheckNumeric(food_number) == 0 || CheckRange(food_number,1,10) == 0 ) {
            return -1;
        }
        return Integer.parseInt(food_number);
    }

}