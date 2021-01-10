import java.util.ArrayList;
import java.util.List;

public class applying {

    public static final int i = 100000;
    public static final int n = 100000;
    private static Object object;
    private static List<Minus_Thread> minusList;
    private static List<Plus_Thread> plusList;

    public static void main(String[] args) {

        long m1 = System.currentTimeMillis();

        object = new Object();
        minusList = new ArrayList<>();
        plusList = new ArrayList<>();

        for (int i = 0; i < applying.i; i++) {
            Plus_Thread threadInc = new Plus_Thread(object);
            plusList.add(threadInc);
            threadInc.start();
            try {
                threadInc.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int j = 0; j < n; j++) {
            Minus_Thread threadminus = new Minus_Thread(object);
            minusList.add(threadminus);
            minusList.add( new Minus_Thread(object) );
            threadminus.start();
            try {
                threadminus.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long m2 = System.currentTimeMillis();
        System.out.println(object.getCount());
        System.out.println(m2-m1);
    }

}
