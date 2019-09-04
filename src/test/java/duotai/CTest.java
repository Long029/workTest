package duotai;

import org.junit.Test;

import static org.junit.Assert.*;

public class CTest {

    @Test
    public void m3() {
        C c = new C();
        A a = new C();
        a.m1();// 继承顺序是向下继承的, 即此时可以调用A中的m1, 也可以调用C的父类B的m1. 遵循向下继承的原则, 调用离new C()最近的B的方法
        c.m1();
        a.m3();
        c.m3();
    }
}