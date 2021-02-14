public class CheckNumber {

    Errors errors = new Errors();

    Integer CheckGivenLockerNumber(String choice) {

       Integer i = 0;

       try {
           i = Integer.parseInt(choice);
       }
       catch(IllegalArgumentException e){
           errors.WrongLockerNumber();
       }

        return i;
    }



    public boolean isNumeric(String s) {
        try{
            Double.parseDouble(s);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }

}