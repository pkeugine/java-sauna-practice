import java.util.Vector;

public class Locker {

    public static final String LOCKER_TOP = "┌ ────── ┐";
    public static final String OCCUPATION_NUBMER = "| %c   %02d |";
    public static final String LOCKER_BOTTOM = "└ %06d ┘";
    public static final String ZERO_BOTTOM = "└ ────── ┘";

    Locker() {
        occupation = new Vector<Character>( );
        fee = new Vector<Integer>();
        for (int i=0; i < 50 ; i++) {
            occupation.add('X');
            fee.add(0);
        }
    }

    public static Vector<Character> occupation;
    public static Vector<Integer> fee;

    public static void PrintLockers() {
        PrintLockersFrom(0,9);
        PrintLockersFrom(10,19);
        PrintLockersFrom(20,29);
        PrintLockersFrom(30,39);
        PrintLockersFrom(40,49);
    }

    public static void ClearLockerNumer(int locker_number) {
        occupation.set(locker_number-1,'X');
        fee.set(locker_number-1,0);
    }

    public static void PrintLockersFrom(int start, int end) {
        for (int i=start; i <= end; i++) { System.out.print(LOCKER_TOP); }
        System.out.println();
        for (int i=start; i <= end; i++) { System.out.printf(OCCUPATION_NUBMER,occupation.get(i),i+1); }
        System.out.println();
        for (int i=start; i <= end; i++) {
            if (fee.get(i)==0) { System.out.print(ZERO_BOTTOM); }
            if (fee.get(i) > 0) { System.out.printf(LOCKER_BOTTOM,fee.get(i)); }
        }
        System.out.println();
    }
}
