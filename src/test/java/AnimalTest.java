import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    @org.junit.Test
    public void test1() {
        Animal a = new Wolf();
//        Wolf c =
        Animal b;
        try {
            b = Wolf.class.newInstance();
            System.out.println("Field:" +b.a);// 多态时基本数据类型不会被子类替代, 而方法会优先选取子类的
            System.out.println("Function:" +b.test());
            System.out.println("Name :" +b.name);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void test2() {
        Wolf a = new Wolf();
        System.out.println("Field:" +a.a);
        System.out.println("Function:" +a.test());
        System.out.println("Name :" +a.name);
    }
}