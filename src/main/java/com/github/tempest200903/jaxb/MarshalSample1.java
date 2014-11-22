package com.github.tempest200903.jaxb;

import javax.xml.bind.JAXB;

public class MarshalSample1 {

    public static void main(String[] args) {
        Hoge hoge = new Hoge();
        hoge.setId(10);
        hoge.setValue("hoge");
        JAXB.marshal(hoge, System.out);
    }

}
