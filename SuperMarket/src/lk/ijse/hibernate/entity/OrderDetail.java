package lk.ijse.hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
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

    public OrderDetail(String orderDetailsId, int orderQty, double discount, double total) {
        this.orderDetailsId = orderDetailsId;
        this.orderQty = orderQty;
        this.discount = discount;
        this.total = total;
    }

}
