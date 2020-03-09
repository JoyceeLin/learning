/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.spring.javabean;

import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/11/25 17:05
 * @Version V1.0
 */
public class ChartBeanBeanInfo extends SimpleBeanInfo {

    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor titlePositionDescriptor = new PropertyDescriptor("titlePosition", ChartBean.class);
            titlePositionDescriptor.setPropertyEditorClass(TitlePositionEditor.class);

            PropertyDescriptor inverseDescriptor = new PropertyDescriptor("inverse", ChartBean.class);
//            inverseDescriptor.setPropertyEditorClass(InverseEditor.class);
            return new PropertyDescriptor[]{titlePositionDescriptor, inverseDescriptor};
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
