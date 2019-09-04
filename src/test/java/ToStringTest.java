import org.junit.Test;

public class ToStringTest {
    @Test
    public void test(){
        Integer num = 50000;
        long startTime = System.currentTimeMillis();
        for(int i = 0; i<50000; i++){
            String numString = String.valueOf(num);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String.valueOf time is :" + (endTime - startTime));
    }
    @Test
    public void test2(){
        Integer num = 50000;
        long startTime = System.currentTimeMillis();
        for(int i = 0; i<50000; i++){
            String numString = num.toString();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("toString time is :" + (endTime - startTime));
    }
    @Test
    public void test3(){
        Integer num = 50000;
        long startTime = System.currentTimeMillis();
        for(int i = 0; i<50000; i++){
            String numString = ""+num;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("' '+ is :" + (endTime - startTime));
    }
}
