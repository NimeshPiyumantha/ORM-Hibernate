package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
@Entity(name = "Item")
public class Item {
    @Id
    private String itemCode;

    private String description;
    private String packSize;
    private double unitPrice;
    private int qtyOnHand;
    @OneToMany(mappedBy = "item")
    private List<OrderDetail> orderDetailList = new ArrayList<>();

    public Item() {
    }

    public Item(String itemCode, String description, String packSize, double unitPrice, int qtyOnHand, List<OrderDetail> orderDetailList) {
        this.itemCode = itemCode;
        this.description = description;
        this.packSize = packSize;
        this.unitPrice = unitPrice;
        this.qtyOnHand = qtyOnHand;
        this.orderDetailList = orderDetailList;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPackSize() {
        return packSize;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemCode='" + itemCode + '\'' +
                ", description='" + description + '\'' +
                ", packSize='" + packSize + '\'' +
                ", unitPrice=" + unitPrice +
                ", qtyOnHand=" + qtyOnHand +
                ", orderDetailList=" + orderDetailList +
                '}';
    }
}