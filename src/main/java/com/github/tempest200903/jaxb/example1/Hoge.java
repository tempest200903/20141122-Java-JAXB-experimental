package com.github.tempest200903.jaxb.example1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "hoge-tag")
public class Hoge {

    private int id;

    private List<String> listValue = new ArrayList<String>();

    private String one = "1";

    private String three = "3";

    private String two = "2";

    private String value;

    Hoge() {
        super();
        listValue.add("aaa");
        listValue.add("bbb");
        listValue.add("ccc");
    }

    // タグと属性の名前を任意の値に変更する
    @XmlAttribute(name = "hoge-id")
    public int getId() {
        return id;
    }

    // Listの変換をいい感じにする
    @XmlElementWrapper(name = "list")
    @XmlElement(name = "element")
    public List<String> getListValue() {
        return listValue;
    }

    public String getOne() {
        return one;
    }

    public String getThree() {
        return three;
    }

    // 特定のフィールドを変換対象外にする
    @XmlTransient
    public String getTwo() {
        return two;
    }

    // タグと属性の名前を任意の値に変更する
    @XmlElement(name = "hoge-value")
    public String getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListValue(List<String> listValue) {
        this.listValue = listValue;
    }

    public void setOne(String one) {
        this.one = one;
    }

    // フィールドをタグの属性と紐付ける
    // @XmlAttribute

    public void setThree(String three) {
        this.three = three;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Hoge [id=");
        builder.append(id);
        builder.append(", listValue=");
        builder.append(listValue);
        builder.append(", one=");
        builder.append(one);
        builder.append(", three=");
        builder.append(three);
        builder.append(", two=");
        builder.append(two);
        builder.append(", value=");
        builder.append(value);
        builder.append("]");
        return builder.toString();
    }

}
