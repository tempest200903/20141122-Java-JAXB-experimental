package com.github.tempest200903.jaxb;

import javax.xml.bind.annotation.XmlAttribute;

public class Hoge {

    private int id;

    private String value;

    // フィールドをタグの属性と紐付ける
    @XmlAttribute
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
