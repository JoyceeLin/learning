
package learning.others.junit;

import org.junit.*;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/10 14:09
 * @Version V1.0
 */
public class JunitTest {

    @Test
    public void test() {
        System.out.println("test");
    }

    @Before
    public void before() {
        System.out.println("before");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass");
    }
}
