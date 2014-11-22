package com.github.tempest200903.jaxb;

import java.io.StringReader;

import javax.xml.bind.JAXB;

public class UnmarshalSample1 {

    public static void main(String[] args) {
        String xml = "<?xml version=\"1.0\"?>"
                + "<hoge>"
                + "  <id>20</id>"
                + "  <value>hogehoge</value>"
                + "</hoge>";
        Hoge hoge = JAXB.unmarshal(new StringReader(xml), Hoge.class);
        System.out.println("id=" + hoge.getId() + ", value=" + hoge.getValue());
    }

}
