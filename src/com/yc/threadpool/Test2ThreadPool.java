package com.yc.threadpool;

import java.io.*;
import java.util.Random;
import java.util.Vector;

/**
 * @program: bigdata
 * @description:
 * @author: 作者
 * @create: 2021-01-20 18:33
 */
public class Test2ThreadPool {
    public static void main(String[] args) throws InterruptedException, IOException {
        ThreadPoolManager tpm=new ThreadPoolManager();
        InputStream iis=System.in;
        BufferedReader br=new BufferedReader(new InputStreamReader(iis));
        String s= null;
        while((s=br.readLine())!=null){
            tpm.Process(new MyTask(s));
        }
        Thread.sleep(1000000);
    }
}
class MyTask implements Taskable{
    private String content;
    public MyTask(String content){
        this.content=content;
    }
    @Override
    public void doTask(){
        //假设这个任务很耗时。。。
        System.out.println(Thread.currentThread().getName()+"执行了任务"+content);
        try {
            Thread.sleep(new Random().nextInt(3000));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
