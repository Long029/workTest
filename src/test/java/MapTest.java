import org.junit.Test;

import java.util.*;

public class MapTest {
    @Test
    public void test(){
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        Map<String, String> map = new HashMap<String, String>();
        Map<String, String> map2 = new HashMap<String, String>();
        Map<String, String> map3 = new HashMap<String, String>();
        Map<String, String> map4 = new HashMap<String, String>();
        map.put("1", "1");
        map2.put("2", "2");
        map3.put("3", "3");
        map4.put("4", "4");
        list.add(map);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()){
            Map<String, String> a = (Map<String, String>) it.next();
            System.out.println(a);
            if(i == 2){
                it.remove();
            }
            i++;
        }
        System.out.println(list.size());
        System.out.println(list.get(0)+" "+list.get(1)+" "+list.get(2));
    }

    @Test
    public void test1(){
        List<String> list = new ArrayList<>();
        String test = "11111";
        list.add(test);
        System.out.println(list.get(0));
        test = "222";
        System.out.println(list.get(0));
        // TAg hahahah
    }
}
