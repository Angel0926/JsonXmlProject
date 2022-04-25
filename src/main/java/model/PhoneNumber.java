package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement(name = "phoneNumberXML")
@XmlAccessorType(XmlAccessType.FIELD)
public class PhoneNumber {
    @XmlElement
    private Type type;
    @XmlElement
    private String phone;

    public PhoneNumber() {
    }

    public PhoneNumber(Type type, String phone) {
        this.type = type;
        this.phone = phone;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return type == that.type && Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, phone);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "type=" + type +
                ", phone='" + phone + '\'' +
                '}';
    }
}

