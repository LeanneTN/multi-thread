import java.util.List;
import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable{
    private CountDownLatch latch = null;
    private String name;

    public MyThread(CountDownLatch latch ,String name){
        this.latch = latch;
        this.name = name;
    }

    public MyThread(){

    }

    @Override
    public void run() {
        System.out.println("thread running");
        // latch.countDown();
    }

}
