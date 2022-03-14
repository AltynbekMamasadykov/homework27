package com.company;

import com.company.classes.Box;

public class Main {

    public static void main(String[] args) {

        Box<String> obj1 = new Box<>();
        System.out.println(obj1.genericMethod());
    }
}
