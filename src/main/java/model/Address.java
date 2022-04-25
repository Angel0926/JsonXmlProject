package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;
@XmlRootElement(name = "addressXML")
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {
    @XmlElement
private String city;
    @XmlElement
private String country;
    @XmlElement
private String Street;
    @XmlElement
private int PostalCode;

    public Address() {
    }

    public Address(String city, String country, String street, int postalCode) {
        this.city = city;
        this.country = country;
        Street = street;
        PostalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public int getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(int postalCode) {
        PostalCode = postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return PostalCode == address.PostalCode && Objects.equals(city, address.city) && Objects.equals(country, address.country) && Objects.equals(Street, address.Street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, country, Street, PostalCode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", Street='" + Street + '\'' +
                ", PostalCode=" + PostalCode +
                '}';
    }
}
