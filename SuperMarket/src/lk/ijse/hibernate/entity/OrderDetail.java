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
    private String orderDetailsId;
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

    public OrderDetail(String orderDetailsId, Orders order, Item item, int orderQty, double discount, double unitPrice, double total) {
        this.orderDetailsId = orderDetailsId;
        this.order = order;
        this.item = item;
        this.orderQty = orderQty;
        this.discount = discount;
        this.unitPrice = unitPrice;
        this.total = total;
    }

    public OrderDetail(String orderDetailsId, int orderQty, double discount, double total) {
        this.orderDetailsId = orderDetailsId;
        this.orderQty = orderQty;
        this.discount = discount;
        this.total = total;
    }

    public String getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(String orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
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

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
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
                "orderDetailsId='" + orderDetailsId + '\'' +
                ", order=" + order +
                ", item=" + item +
                ", orderQty=" + orderQty +
                ", discount=" + discount +
                ", unitPrice=" + unitPrice +
                ", total=" + total +
                '}';
    }
}
