package com.github.tempest200903.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Hoge {

    private int id;

    private String value;

    // フィールドをタグの属性と紐付ける
    // @XmlAttribute

    // タグと属性の名前を任意の値に変更する
    @XmlAttribute(name = "hoge-id")
    public int getId() {
        return id;
    }

    // タグと属性の名前を任意の値に変更する
    @XmlElement(name = "hoge-value")
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
