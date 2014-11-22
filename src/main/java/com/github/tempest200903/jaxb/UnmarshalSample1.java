package com.github.tempest200903.jaxb;

import java.io.StringReader;

import javax.xml.bind.JAXB;

public class UnmarshalSample1 {

    public static void main(String[] args) {
        String xml1 = "<?xml version=\"1.0\"?>"
                + "<hoge>"
                + "  <id>20</id>"
                + "  <value>hogehoge</value>"
                + "</hoge>";
        // フィールドをタグの属性と紐付ける
        String xml2 = "<?xml version=\"1.0\"?>"
                + "<hoge id=\"10\">"
                + "  <value>hogehoge</value>"
                + "</hoge>";
        // タグと属性の名前を任意の値に変更する
        String xml3 = "<?xml version=\"1.0\"?>"
                + "<hoge hoge-id=\"10\">"
                + "<hoge-value>hoge</hoge-value>"
                + "</hoge>";
        // 要素の順序の決定
        String xml = "<?xml version=\"1.0\"?>"
                + "<hoge hoge-id=\"10\">"
                + "<hoge-value>hoge</hoge-value>"
                + "<one>1</one>"
                + "<two>2</two>"
                + "<three>3</three>"
                + "</hoge>";

        Hoge hoge = JAXB.unmarshal(new StringReader(xml), Hoge.class);
        System.out.println("hoge =: " + hoge);
    }

}
