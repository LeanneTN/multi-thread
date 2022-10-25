import LeThread.LeThread;
import LeThread.impl.LeThreadImpl;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        LeThread leThread = new LeThreadImpl();
        Thread thread = new Thread(leThread);
        thread.start();
    }
}
