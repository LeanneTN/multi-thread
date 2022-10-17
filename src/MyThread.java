import java.util.List;
import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable{
    private CountDownLatch latch = null;
    private String name;

    public MyThread(CountDownLatch latch ,String name){
        this.latch = latch;
        this.name = name;
    }
    @Override
    public void run() {

        latch.countDown();
    }

}
