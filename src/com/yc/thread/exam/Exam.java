package com.yc.thread.exam;

/**
 * @program: bigdata
 * @description:编写一个java cmd程序，模拟在线考试的计时效果
 * 正在做第i题
 * 考试时间到，强制交卷
 * @author: 作者
 * @create: 2021-01-23 13:22
 */
public class Exam {
    public static void main(String[] args) {
        NotifyListener nl=new MyNotify();//监听器
        //计时任务
        Thread t=new CountTime(nl,10);
        t.start();

        Student s=new Student(nl);
        s.setName("张三");
        Student s2=new Student(nl);
        s2.setName("李四");

        s.start();
        s2.start();
    }
}
