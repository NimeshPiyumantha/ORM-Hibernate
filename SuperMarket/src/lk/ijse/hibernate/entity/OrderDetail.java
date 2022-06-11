package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
@Entity
public class OrderDetail {
    @Id
    private String orderId;
    @ManyToOne
    private Orders order;
    @ManyToOne
    private Item item;
    private int orderQty;
    private double discount;
    private double unitPrice;
    private double total;

    public OrderDetail() {
    }

    public OrderDetail(String orderId, Orders order, Item item, int orderQty, double discount, double unitPrice, double total) {
        this.orderId = orderId;
        this.order = order;
        this.item = item;
        this.orderQty = orderQty;
        this.discount = discount;
        this.unitPrice = unitPrice;
        this.total = total;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public Object setOrderQty(int orderQty) {
        this.orderQty = orderQty;
        return null;
    }

    public double getDiscount() {
        return discount;
    }

    public Object setDiscount(double discount) {
        this.discount = discount;
        return null;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderId='" + orderId + '\'' +
                ", order=" + order +
                ", item=" + item +
                ", orderQty=" + orderQty +
                ", discount=" + discount +
                ", unitPrice=" + unitPrice +
                ", total=" + total +
                '}';
    }
}
