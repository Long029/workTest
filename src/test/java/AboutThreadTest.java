import org.junit.Test;

import static org.junit.Assert.*;

public class AboutThreadTest {

    @Test
    public void test(){
        AboutThread aboutThread = new AboutThread();
        aboutThread.start();
        System.out.println("结束");
    }

    @Test
    public void test1() throws InterruptedException {
        AboutRunnable aboutRunnable = new AboutRunnable();
        Thread thread3 = new Thread(aboutRunnable,"C");

        thread3.start();
        Thread.sleep(5);
        thread3.interrupt();
        System.out.println("结束了");
    }
}