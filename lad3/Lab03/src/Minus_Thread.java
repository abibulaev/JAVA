public class Minus_Thread extends Thread {

    private Object object;

    public Minus_Thread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.minus();
    }

}
