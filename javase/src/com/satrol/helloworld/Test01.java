
package com.satrol.helloworld;
public class Test01 {
    public static void main(String[] args) {
        //当包名不再统一目录下
        com.satrol.helloworld.helloword h = new com.satrol.helloworld.helloword();
        System.out.println(h);
        //当包名在统一目录下
        helloword h1 = new helloword();
        System.out.println(h1);
    }
}
