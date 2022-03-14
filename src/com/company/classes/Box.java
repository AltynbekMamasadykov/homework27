package com.company.classes;

public class Box <T>{
    private T var;

    public Box() {

    }

    public Box(T var) {
        this.var = var;
    }

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return "Box{" +
                "var=" + var +
                '}';
    }

    public  static <T>Box<T> genericMethod() {
        return new Box<>();
    }
}
