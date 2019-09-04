import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

public class IntegerPassValueTest {

    @Test
    public void passValue() {
        Assert.assertEquals(146,new IntegerPassValue().passValue());
    }

    @Test
    public void changeName() {
        Assert.assertEquals(13, new IntegerPassValue().changeName().getPrice());
    }

    @Test
    public void test5(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        Integer integer = new Integer(44);
        map.put("No1",integer);
        integer = integer.intValue() +1;
        Assert.assertEquals(44, (int)map.get("No1"));
    }

    @Test
    public void test6(){
        AtomicInteger atomicInteger = new AtomicInteger(30);
        Map<String, AtomicInteger> map = new HashMap<String, AtomicInteger>();
        map.put("No1", atomicInteger);
        change(atomicInteger);
        Assert.assertEquals(31, map.get("No1").intValue());
    }

    private void change(AtomicInteger atomicInteger) {
        atomicInteger.set(atomicInteger.intValue()+1);
    }
    @Test
    public void test7(){
        float fd = (float) 1.33;
        int intfd = (int)fd;
        System.out.println(intfd);
    }
}