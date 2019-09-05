/*
 *
 */
package learning.others.design.pattern.chain;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 17:34
 * @Version V1.0
 */
public class Test {

    public static void main(String[] args) {
        Chain c1 = new HTMLFilterChain();
        Chain c2 = new SensitiveFilterChain();
        Chain c3 = new SpaceFilterChain();

        c1.setNextChain(c2);
        c2.setNextChain(c3);

        String request = "<html>爱祖国，爱人民，我很敏感<body>";
        request = c1.handle(request);
        System.out.println(request);
    }
}
