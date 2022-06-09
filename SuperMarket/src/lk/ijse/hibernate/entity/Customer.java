package lk.ijse.hibernate.entity;

import lk.ijse.hibernate.embeded.Name;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
@Entity
public class Customer {
    @Id
    private String cusId;
    private Name cusName;
    private double cusSalary;
    private String cusAddress;

    public Customer() {
    }

    public Customer(String cusId, Name cusName, double cusSalary, String cusAddress) {
        this.cusId = cusId;
        this.cusName = cusName;
        this.cusSalary = cusSalary;
        this.cusAddress = cusAddress;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public Name getCusName() {
        return cusName;
    }

    public void setCusName(Name cusName) {
        this.cusName = cusName;
    }

    public double getCusSalary() {
        return cusSalary;
    }

    public void setCusSalary(double cusSalary) {
        this.cusSalary = cusSalary;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusId='" + cusId + '\'' +
                ", cusName=" + cusName +
                ", cusSalary=" + cusSalary +
                ", cusAddress='" + cusAddress + '\'' +
                '}';
    }

}

