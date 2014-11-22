package com.github.tempest200903.jaxb.example2;

import java.io.File;
import java.io.StringReader;
import java.util.List;

import javax.xml.bind.JAXB;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;

public class Hoge {

    private MyInterface any;

    private List<MyInterface> list;

    @XmlElements({
            @XmlElement(name = "fuga", type = Fuga.class),
            @XmlElement(name = "piyo", type = Piyo.class)
    })
    public MyInterface getAny() {
        return this.any;
    }

    @XmlElementWrapper(name = "list")
    @XmlElements({
            @XmlElement(name = "fuga", type = Fuga.class),
            @XmlElement(name = "piyo", type = Piyo.class)
    })
    public List<MyInterface> getList() {
        return this.list;
    }

    public void setAny(MyInterface any) {
        this.any = any;
    }

    public void setList(List<MyInterface> list) {
        this.list = list;
    }

    // １つのインターフェースフィールドに対して、複数の実装クラスをマッピングする
    public static void main(String[] args) {
        Hoge hoge = JAXB.unmarshal(new File("test.xml"), Hoge.class);
        System.out.println("hoge =: " + hoge);
        hoge.getAny().hello();
        System.out.println();
        for (MyInterface any : hoge.getList()) {
            any.hello();
        }
    }

}
