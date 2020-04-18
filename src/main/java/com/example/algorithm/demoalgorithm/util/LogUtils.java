package com.example.algorithm.demoalgorithm.util;

/**
 * Description:
 * User: zhangll
 * Date: 2020-04-18
 * Time: 10:13
 */
public class LogUtils {

    public interface Task{
       void execute();
    }

    public static void putLog(String desp, Task task){
        if (task == null){
            return;
        }
        Long start = System.currentTimeMillis();
        System.out.println(desp + "开始时间:" + start);
        task.execute();
        Long end = System.currentTimeMillis();
        System.out.println(desp + "结束时间:" + end);
        System.out.println(desp + "耗时" + (end - start) + "毫秒");
    }


}
