import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingTest {
    @Test
    public void test() {
        long time = System.currentTimeMillis();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        System.out.println("AutoBoxing time is :" + (System.currentTimeMillis() - time));
    }

    @Test
    public void test2() {
        long time = System.currentTimeMillis();
        List<Integer> listTest2 = new ArrayList<Integer>();
        for (int j = 0; j < 10000000; j++) {
            listTest2.add(Integer.valueOf(j));
        }
        System.out.println("AutoBoxing time is :" + (System.currentTimeMillis() - time));
    }

    @Test
    public void test3() {
        long time = System.currentTimeMillis();
        List<Integer> listTest3 = new ArrayList<Integer>();
        listTest3.add(1);
        int num = listTest3.get(0);
        Assert.assertEquals(1, num);
    }

    @Test
    public void test4(){
        Float aFloat = new Float("14.44");
        int a = aFloat.intValue();
        System.out.println(a);
    }

    @Test
    public void test5(){
        long along = 32769;
        short ashort = (short) along;
        Assert.assertEquals(-32767, ashort);
    }
}
