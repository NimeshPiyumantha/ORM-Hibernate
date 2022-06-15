package lk.ijse.hibernate.entity;

import lk.ijse.hibernate.embeded.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

}

