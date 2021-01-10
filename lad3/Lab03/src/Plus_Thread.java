public class Plus_Thread extends Thread {
    private Object object;


    public Plus_Thread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.plus();
    }

}
