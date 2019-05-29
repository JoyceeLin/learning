/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.design.pattern.chain;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 17:16
 * @Version V1.0
 */
public class HTMLFilterChain implements Chain {

    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public String handle(String request) {
        if (request.contains("<html>") || request.contains("<body>")) {
            request = request.replace("<html>", "").replace("<body>", "");
        }
        if (nextChain != null) {
            return nextChain.handle(request);
        }
        return request;
    }
}
