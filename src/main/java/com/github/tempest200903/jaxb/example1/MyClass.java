package com.github.tempest200903.jaxb.example1;

import javax.xml.bind.JAXB;

public class MyClass {

    private MyEnum fuga = MyEnum.FUGA;
    private MyEnum hoge = MyEnum.HOGE;
    private MyEnum piyo = MyEnum.PIYO;

    public MyEnum getFuga() {
        return fuga;
    }

    public MyEnum getHoge() {
        return hoge;
    }

    public MyEnum getPiyo() {
        return piyo;
    }

    public void setFuga(MyEnum fuga) {
        this.fuga = fuga;
    }

    public void setHoge(MyEnum hoge) {
        this.hoge = hoge;
    }

    public void setPiyo(MyEnum piyo) {
        this.piyo = piyo;
    }

    public static void main(String[] args) {
        JAXB.marshal(new MyClass(), System.out);
    }

}
