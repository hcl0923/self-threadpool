package com.yc.thread.exam;

/**
 * @program: bigdata
 * @description:
 * @author: 作者
 * @create: 2021-01-23 13:27
 */
public class CountTime extends Thread {
    private NotifyListener notifyListener;//监听器的对象
    private int elipsTime;//总时间
    private int count;//已用时间
    private boolean flag=true;//标识当前计时任务的状态

    public CountTime(NotifyListener notifyListener, int elipsTime) {
        this.notifyListener=notifyListener;
        this.elipsTime=elipsTime;
    }

    @Override
    public void run() {
        System.out.println("计时开始");
        while(flag){
            System.out.println("距离考试结束还有："+(elipsTime-count)+"秒");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            count++;
            if(count==elipsTime){
                flag=false;
                System.out.println("考试时间到，强制交卷");
                if(this.notifyListener!=null){
                    this.notifyListener.notifyfinish(true);
                }
            }
        }
    }
}
