public class CheckNumber {

    Errors errors = new Errors();

    public Integer CheckGivenLockerNumber(String choice) {
        if(CheckIfItISQ(choice)==true) {
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
        return 1;
    }

    public int CheckRange(String locker_num) {
        int locker = Integer.parseInt(locker_num);
        if (locker < 1 || locker > 50) {
           return 0;
        }
        return 1;
    }

    public int CheckNumeric(String str) {
        if (str == null) {
            return 0;
        }
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return 0;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return 0;
            }
        }
        return 1;
    }

    public boolean CheckIfItISQ(String input) {
        if ( input.equalsIgnoreCase("Q")) {
            return true;
        }
        return false;
    }
}