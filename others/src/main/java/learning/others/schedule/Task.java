package learning.others.schedule;

/**
 * 任务调度的执行单元
 *
 * @author xumin
 * @version $Id:Task.java, v0.1 2017/12/19 20:11 xumin
 */
public interface Task {

    /**
     * 任务的执行逻辑
     *
     * @param taskParameter 执行参数
     */
    void execute(String taskParameter);

}
