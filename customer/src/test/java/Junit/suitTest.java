package Junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({BeanFactoryTest.class,suiteTestClass1.class,suiteTestClass2.class})
public class suitTest {


    //该测试无法执行
    @Test
    public void test(){
        System.out.println("end");
    }
}
