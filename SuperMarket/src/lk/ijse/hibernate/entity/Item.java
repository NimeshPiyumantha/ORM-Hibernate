package lk.ijse.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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

    @Column
    private String itemName;
    private double itemUnitPrice;
    private String packSize;
    private int itemQtyOnHand;
    private List<OrderDetails> orderDetails;


    public Item() {
    }

    public Item(String itemCode, String itemName, double itemUnitPrice, String packSize, int itemQtyOnHand, List<OrderDetails> orderDetails) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemUnitPrice = itemUnitPrice;
        this.packSize = packSize;
        this.itemQtyOnHand = itemQtyOnHand;
        this.orderDetails = orderDetails;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemUnitPrice() {
        return itemUnitPrice;
    }

    public void setItemUnitPrice(double itemUnitPrice) {
        this.itemUnitPrice = itemUnitPrice;
    }

    public String getPackSize() {
        return packSize;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    public int getItemQtyOnHand() {
        return itemQtyOnHand;
    }

    public void setItemQtyOnHand(int itemQtyOnHand) {
        this.itemQtyOnHand = itemQtyOnHand;
    }

    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemCode='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemUnitPrice=" + itemUnitPrice +
                ", packSize='" + packSize + '\'' +
                ", itemQtyOnHand=" + itemQtyOnHand +
                ", orderDetails=" + orderDetails +
                '}';
    }
}