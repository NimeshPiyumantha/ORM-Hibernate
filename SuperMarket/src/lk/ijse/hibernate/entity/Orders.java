package lk.ijse.hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Orders {
    @Id
    private String orderId;
    private LocalDate orderDate;
    @ManyToOne
    private Customer cusId;
    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetailList = new ArrayList<>();

    public Orders(String orderId, LocalDate orderDate, Customer cusId) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.cusId = cusId;
    }
}
