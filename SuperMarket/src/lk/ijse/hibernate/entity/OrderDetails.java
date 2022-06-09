package lk.ijse.hibernate.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Date;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
@Entity
public class OrderDetails {
    @Id
    private String orderId;
    @ManyToOne
    private Customer cusId;
    @ManyToOne
    private Item itemCode;
@CreationTimestamp
    private Date date;
    private int qty;
    private double discount;

    public OrderDetails() {
    }

    public OrderDetails(String orderId, Customer cusId, Item itemCode, Date date, int qty, double discount) {
        this.orderId = orderId;
        this.cusId = cusId;
        this.itemCode = itemCode;
        this.date = date;
        this.qty = qty;
        this.discount = discount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Customer getCusId() {
        return cusId;
    }

    public void setCusId(Customer cusId) {
        this.cusId = cusId;
    }

    public Item getItemCode() {
        return itemCode;
    }

    public void setItemCode(Item itemCode) {
        this.itemCode = itemCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderId='" + orderId + '\'' +
                ", cusId=" + cusId +
                ", itemCode=" + itemCode +
                ", date='" + date + '\'' +
                ", qty=" + qty +
                ", discount=" + discount +
                '}';
    }
}
