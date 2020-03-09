/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.spring.javabean;

import javax.swing.*;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/11/25 16:58
 * @Version V1.0
 */
public class ChartBean extends JPanel {

    private int titlePosition = 1;
    private boolean inverse;

    public int getTitlePosition() {
        return titlePosition;
    }

    public void setTitlePosition(int titlePosition) {
        this.titlePosition = titlePosition;
    }

    public boolean isInverse() {
        return inverse;
    }

    public void setInverse(boolean inverse) {
        this.inverse = inverse;
    }
}
