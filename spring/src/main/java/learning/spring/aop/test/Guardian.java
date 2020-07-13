
package learning.spring.aop.test;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.weaver.ast.Test;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/26 14:30
 * @Version V1.0
 */
//@Aspect
public class Guardian {

    @Pointcut("execution(* learning.spring.aop.test.Monkey.stealPeaches(..)) && @within(testAnno)")
    public void foundMonkey(TestAnno testAnno) {
    }

    @Before(value = "foundMonkey(testAnno)")
    public void foundBefore(TestAnno testAnno) {
        System.out.println("【守护者】发现猴子正在进入果园..." + testAnno.key());
    }

    @AfterReturning("foundMonkey(testAnno) && args(name,..)")
    public void foundAfter(String name, TestAnno testAnno) {
        System.out.println("【守护者】抓住了猴子,守护者审问出了猴子的名字叫“" + name + "”..." + testAnno.key());
    }

}
