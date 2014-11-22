package com.github.tempest200903.jaxb.example2;

public class Fuga implements MyInterface {

    private int num;

    @Override
    public void hello() {
        System.out.println("fuga : num = " + this.num);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
