package com.onjava;

public class Test {

    private Test(){};
    private static Test test = new Test();

    private static Test access(){return  test;}
    private void f(){
        System.out.println("单例模式实例");
    }
    public static void main(String[] args) {
        Test.access().f();
    }
}
