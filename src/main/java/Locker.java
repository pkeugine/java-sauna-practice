import java.util.Vector;

public class Locker {

    public static final String LOCKER_TOP = "┌ ────── ┐";
    public static final String OCCUPATION_NUBMER = "| %c   %02d |";
    public static final String LOCKER_BOTTOM = "└ ────── ┘";

    Locker() {
        occupation = new Vector<Character>( );
        fee = new Vector<Integer>();
        for(int i=0; i < 50 ; i++) {
            occupation.add('X');
            fee.add(0);
        }
    }

    private Vector<Character> occupation;
    private Vector<Integer> fee;

    public void PrintLockers() {
        PrintLockersFrom(0,9);
        PrintLockersFrom(10,19);
        PrintLockersFrom(20,29);
        PrintLockersFrom(30,39);
        PrintLockersFrom(40,49);
    }

    public void PrintLockersFrom(int start, int end) {
        for(int i=start; i <= end; i++) {
            System.out.print(LOCKER_TOP);
        }
        System.out.println();
        for(int i=start; i <= end; i++) {
            System.out.printf(OCCUPATION_NUBMER,occupation.get(i),i+1);
        }
        System.out.println();
        for(int i=start; i <= end; i++) {
            System.out.print(LOCKER_BOTTOM);
        }
        System.out.println();
    }

}
