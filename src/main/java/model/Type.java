package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "typeXML")
@XmlAccessorType(XmlAccessType.FIELD)
public enum Type {
    @XmlElement
    MOBILE,
    @XmlElement
    WORK,
    @XmlElement
    SCHOOL
}
