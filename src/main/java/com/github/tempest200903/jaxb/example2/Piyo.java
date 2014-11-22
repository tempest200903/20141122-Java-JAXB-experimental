package com.github.tempest200903.jaxb.example2;

import javax.xml.bind.annotation.XmlAttribute;

public class Piyo implements MyInterface {

    private String value;

    @Override
    public void hello() {
        System.out.println("hoge : value = " + this.value);
    }

    @XmlAttribute
    public String getValue() {
        return this.value;
    }

}
