public class AboutRunnable implements Runnable{
    public void run() {
        int i;
        for( i=0 ; i<50000;i++){
            if(Thread.currentThread().isInterrupted()){
                System.out.println("被停止了, out");
                return;
            }
            System.out.println("线程"+ i+" : "+Thread.currentThread().getName() +" 计算结果: "+ (i+1));
        }
    }
}
