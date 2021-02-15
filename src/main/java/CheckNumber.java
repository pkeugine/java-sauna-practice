public class CheckNumber {

    Errors errors = new Errors();

    public Integer CheckGivenLockerNumber(String choice) {
        if (CheckIfItISQ(choice)==true) {
            return -1;
        }
        if (CheckNumeric(choice)==0) {
            errors.NeedToInputNumber();
            return 0;
        }
        if ( CheckRange(choice) == 0 ) {
            errors.WrongLockerNumber();
            return 0;
        }
        return Integer.parseInt(choice);
    }

    public int CheckRange(String locker_num) {
        int locker = Integer.parseInt(locker_num);
        if (locker < 1 || locker > 50) {
           return 0;
        }
        return 1;
    }

    public int CheckNumeric(String str) {
        if (str.matches("-?\\d+")) {
           return 1;
        }
        return 0;
    }

    public boolean CheckIfItISQ(String input) {
        if (input.equalsIgnoreCase("Q")) {
            return true;
        }
        return false;
    }

    public int CheckOperationRange(String input) {
        int locker = Integer.parseInt(input);
        if (locker < 1 || locker > 3) {
            errors.WrongOperationSelected();
            return -1;
        }
        return locker;
    }

    public int CheckIfItISB(String input) {
        if (input.equalsIgnoreCase("B")) {
            return 0;
        }
        errors.WrongOperationSelected();
        return -1;
    }

    //return value : 1,2,3,0 ( 0 means 'B' )
    public int CheckGivenOperationNumber(String input) {
        int check_numeric = CheckNumeric(input);
        if (check_numeric == 1) { // means input is a number
            return CheckOperationRange(input);
        }
        if (check_numeric == 0) {
            return CheckIfItISB(input);
        }
        return -1;
    }

}