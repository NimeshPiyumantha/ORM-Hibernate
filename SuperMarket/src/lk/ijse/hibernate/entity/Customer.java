package lk.ijse.hibernate.entity;

import lk.ijse.hibernate.embeded.Name;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
@Entity
public class Customer {
    @OneToMany(mappedBy = "cusId")
    private final List<Orders> ordersList = new ArrayList<>();
    @Id
    private String cusId;
    private String cusTitle;
    private Name cusName;
    private String cusAddress;
    private String city;
    private String province;
    private String postalCode;

    public Customer() {
    }

    public Customer(String cusId, String cusTitle, Name cusName, String cusAddress, String city, String province, String postalCode) {
        this.cusId = cusId;
        this.cusTitle = cusTitle;
        this.cusName = cusName;
        this.cusAddress = cusAddress;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getCusTitle() {
        return cusTitle;
    }

    public void setCusTitle(String cusTitle) {
        this.cusTitle = cusTitle;
    }

    public Name getCusName() {
        return cusName;
    }

    public void setCusName(Name cusName) {
        this.cusName = cusName;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusId='" + cusId + '\'' +
                ", cusTitle='" + cusTitle + '\'' +
                ", cusName=" + cusName +
                ", cusAddress='" + cusAddress + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", ordersList=" + ordersList +
                '}';
    }
}

