package lk.ijse.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "customer")
public class Customer {
    @Id
    private String cusId;

    @Column(name = "Cus_name")
    private String cusName;
    private double cusSalary;
    private String cusAddress;

    public Customer() {
    }

    public Customer(String cusId, String cusName, String cusAddress, double cusSalary) {
        this.cusId = cusId;
        this.cusName = cusName;
        this.cusAddress = cusAddress;
        this.cusSalary = cusSalary;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public double getCusSalary() {
        return cusSalary;
    }

    public void setCusSalary(double cusSalary) {
        this.cusSalary = cusSalary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusId='" + cusId + '\'' +
                ", cusName='" + cusName + '\'' +
                ", cusAddress='" + cusAddress + '\'' +
                ", cusSalary=" + cusSalary +
                '}';
    }
}


