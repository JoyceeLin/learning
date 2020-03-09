/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.spring.javabean;

import java.beans.PropertyEditorSupport;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/11/25 17:01
 * @Version V1.0
 */
public class TitlePositionEditor extends PropertyEditorSupport {
    private String[] options = {"Left", "Center", "Right"};

    public String[] getTags() {
        return options;
    }

    public String getJavaInitalizationString() {
        return "" + getValue();
    }

    public String getAsTest() {
        int value = (Integer) getValue();
        return options[value];
    }

    public void setAsTest(String s) {
        for (int i = 0; i < options.length; i++) {
            if (options[i].equals(s)) {
                setValue(i);
                return;
            }
        }
    }
}
