package com.github.tempest200903.jaxb;

import javax.xml.bind.annotation.XmlEnumValue;

public enum MyEnum {

    HOGE,

    // enum をマッピングする
    @XmlEnumValue("fuga")
    FUGA,

    @XmlEnumValue("Piyo")
    PIYO,

}
