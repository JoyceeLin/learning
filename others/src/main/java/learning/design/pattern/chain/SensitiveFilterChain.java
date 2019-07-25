/*
 *
 */
package learning.design.pattern.chain;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 17:30
 * @Version V1.0
 */
public class SensitiveFilterChain implements Chain {

    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public String handle(String request) {
        if (request.contains("敏感")) {
            request = request.replace("敏感", "");
        }
        if (nextChain != null) {
            return nextChain.handle(request);
        }
        return request;
    }
}
