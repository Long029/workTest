import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

public class AboutSetTest<pub> {
    @Test
    public  void test(){
        Set<String> strings = new HashSet<String>();
        strings.add("abc");
        strings.add("123");
        strings.add("abc");
        Assert.assertEquals(2,strings.size());
    }
    @Test
    public  void test2(){
        List strings = new ArrayList();
        strings.add("abc");
        strings.add("123");
        strings.add("abc");
        Set<String> stringSet = new HashSet<String>(strings);
        Assert.assertEquals(2,stringSet.size());
        Iterator iterator = stringSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test3(){
        TreeSet<String> stringSet = new TreeSet();
        stringSet.add("aaa");
        stringSet.add("bbb");
        stringSet.add("ccc");
        stringSet.add("ddd");
        TreeSet<String> stringSet1 = (TreeSet<String>) stringSet.subSet("aaa","ddd");
        stringSet1.add("111");
        System.out.println(stringSet1);
    }

    @Test
    public  void test5(){
        List<String> strings = new ArrayList();
        strings.add("abc");
        strings.add("123");
        strings.add("abc");
        for (String s: strings){
        List list = strings.subList(0,2);
        list.add("111");
        }
        System.out.println(strings.size());
    }
    @Test
    public void testArray(){
        String[] strings = new String[3];
        strings[0] = "111";
        strings[1] = "222";
        strings[2] = "333";
        List<String> stringList = Arrays.asList(strings);
        System.out.println(stringList);
        stringList.add("444");
    }
    @Test
    public void testList(){
        List<String> stringList = new ArrayList<String>();
        stringList.add("111");
        stringList.add("222");
        stringList.add("333");
        String[] strings = stringList.toArray(new String[0]);
        for (int i = 0; i<strings.length;i++){
            System.out.println(strings[i]);
        }
    }
}
