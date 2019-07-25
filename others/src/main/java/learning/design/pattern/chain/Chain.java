/*
 *
 */
package learning.design.pattern.chain;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 17:15
 * @Version V1.0
 */
public interface Chain {

    void setNextChain(Chain nextChain);

    String handle(String request);
}
