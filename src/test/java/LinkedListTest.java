import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    @Test
    public void test(){
        //List的中间插入  使用LinkedList 而顺序插入使用Arraylist
        List<String> linkedList = new LinkedList<String>();
        linkedList.add(0,"aaa");
        List<String> arrayList = new ArrayList<String>();
        arrayList.add(4,"aaa");
    }
}
