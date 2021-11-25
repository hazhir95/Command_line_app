package com.libra.test;

public class Animal {
    void bark(){
        Main fun = new Main();
        System.out.println("woof-woof");
        fun.menu(); // Reload (recall) menu method from Main Class.
    }
}
