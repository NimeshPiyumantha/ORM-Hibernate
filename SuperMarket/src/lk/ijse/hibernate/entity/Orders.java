package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
@Entity
public class Orders {
    @Id
    private String orderId;
    private LocalDate orderDate;
    @ManyToOne
    private Customer cusId;
    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetailList = new ArrayList<>();

    public Orders() {
    }

    public Orders(String orderId, LocalDate orderDate, Customer cusId) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.cusId = cusId;
    }

    public Orders(String orderId, LocalDate orderDate, Customer cusId, List<OrderDetail> orderDetailList) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.cusId = cusId;
        this.orderDetailList = orderDetailList;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCusId() {
        return cusId;
    }

    public void setCusId(Customer cusId) {
        this.cusId = cusId;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId='" + orderId + '\'' +
                ", orderDate=" + orderDate +
                ", cusId=" + cusId +
                ", orderDetailList=" + orderDetailList +
                '}';
    }
}
