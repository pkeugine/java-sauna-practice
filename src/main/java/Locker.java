import java.util.Vector;

public class Locker {

    Locker() {
        occupation = new Vector<Integer>( );
        fee = new Vector<Integer>();

        for(int i=0; i < 50 ; i++) {
            occupation.add(0);
            fee.add(0);
        }
    }

    private Vector<Integer> occupation;
    private Vector<Integer> fee;

}
