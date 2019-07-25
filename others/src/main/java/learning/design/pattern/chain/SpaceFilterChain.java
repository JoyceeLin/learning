/*
 *
 */
package learning.design.pattern.chain;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 17:34
 * @Version V1.0
 */
public class SpaceFilterChain implements Chain {

    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public String handle(String request) {
        if(request.contains(" ")){
            request = request.replace(" ", "");
        }
        // 链式处理完
        if(nextChain != null) {
            request = nextChain.handle(request);
        }
        return request;
    }
}
