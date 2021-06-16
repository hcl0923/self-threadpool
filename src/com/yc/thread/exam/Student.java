package com.yc.thread.exam;

import java.util.Random;

/**
 * @program: bigdata
 * @description:
 * @author: 作者
 * @create: 2021-01-23 13:27
 */
public class Student extends Thread{
    private NotifyListener listener;

    public Student(NotifyListener listener){
        this.listener=listener;
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("学生"+this.getName()+"正在做"+i+"题");
            try{
                Thread.sleep(new Random().nextInt(4000));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            //有一个电铃
            if(this.listener!=null&&this.listener instanceof MyNotify){
                if(((MyNotify)listener).isFinish()){
                    break;
                }
            }
        }
    }
}

