package com.yc.threadpool;

/**
 * @program: bigdata
 * @description:
 * @author: 作者
 * @create: 2021-01-20 17:16
 */
public class Test1 {
    public static void main(String[] args) {
        Runtime rt=Runtime.getRuntime();//运行时环境，一个程序与系统交互的一个接口，only one
        //唯一的一个接口  -》设计模式？单例
        //单例特点   构造方法私有化，即不能new
        //对外提供唯一的访问接口  static Runtime getRuntime()
        //懒汉实现，饿汉实现
        //native本地方法
        System.out.println(rt.availableProcessors());
    }
}
