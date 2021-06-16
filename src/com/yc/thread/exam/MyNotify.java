package com.yc.thread.exam;

/**
 * @program: bigdata
 * @description:
 * @author: 作者
 * @create: 2021-01-23 13:25
 */
public class MyNotify implements NotifyListener {
    private boolean isFinish;
    //计时的子线程当时间到了，则调用这个方法，改变状态

    //考试端通过这个方法获取状态
    public boolean isFinish() {
        return isFinish;
    }

    @Override
    public void notifyfinish(boolean isFinish) {
        this.isFinish=isFinish;
    }
}
