package lk.ijse.hibernate;

import lk.ijse.hibernate.embeded.Name;
import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.entity.Item;
import lk.ijse.hibernate.entity.OrderDetail;
import lk.ijse.hibernate.entity.Orders;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        /**  ------------------------------------------CRUD Customer------------------------------------------  */

        //for Embedded
        Name name1 = new Name("Nimesh", "Piyumantha", "Wijewickrama");
        Name name2 = new Name("Malinda", "Pasindu", "Wijewickrama");

        //for save
        session.save(new Customer("C-001", "Mr", name1, "Hapugala", "Galle", "Southern", "80000"));
        session.save(new Customer("C-002", "Mr", name2, "Hapugala", "Galle", "Southern", "80000"));

        //for update
//        session.update(new Customer("C-001","Mr",name1,"Palawatta","Galle","Southern","80000"));
//        session.update(new Customer("C-002","Mr",name2,"Palawatta","Galle","Southern","80000"));

        //for getting one customer
//        System.out.println(session.get(Customer.class,"C-001"));
//        System.out.println(session.get(Customer.class,"C-002"));

        //for delete
//        session.delete(session.get(Customer.class, "C-001"));
//        session.delete(session.get(Customer.class, "C-002"));

        /**  ------------------------------------------CRUD Item------------------------------------------  */

        //for save
        session.save(new Item("I-001", "Fish Bun", "medium", 70.00, 100));
        session.save(new Item("I-002", "Bread", "medium", 170.00, 130));

        //for update
//        session.update(new Item("I-001","Fish Bun","medium",80.00,100));
//        session.update(new Item("I-002","Bread","medium",180.00,130));

        //for getting one item
//        System.out.println(session.get(Item.class,"I-001"));
//        System.out.println(session.get(Item.class,"I-002"));

        //for delete
//        session.delete(session.get(Item.class, "I-001"));
//        session.delete(session.get(Item.class, "I-002"));

        /**   ------------------------------------------CRUD Orders------------------------------------------  */

        //for save
        session.save(new Orders("O-001", LocalDate.now(), session.get(Customer.class, "C-001")));
        session.save(new Orders("O-002", LocalDate.now(), session.get(Customer.class, "C-002")));

        //for getting one orders
//        System.out.println(session.get(Orders.class,"O-001"));
//        System.out.println(session.get(Orders.class,"O-002"));

        //for delete
//        session.delete(session.get(Orders.class,"O-001"));
//        session.delete(session.get(Orders.class,"O-002"));

        /**  ------------------------------------------CRUD OrderDetails------------------------------------------  */

        //for orderDetails 1
        Item item = session.get(Item.class, "I-001");
        Orders orders = session.get(Orders.class, "O-001");

        //for orderDetails 2
        Item item2 = session.get(Item.class, "I-002");
        Orders orders2 = session.get(Orders.class, "O-002");

        session.save(new OrderDetail(orders.getOrderId(), orders, item, 4, 2.00, item.getUnitPrice(), 274.00));
        session.save(new OrderDetail(orders2.getOrderId(), orders2, item2, 4, 2.00, item.getUnitPrice(), 274.00));

        //for getting one orderDetails
//        System.out.println(session.get(OrderDetail.class,"O-001"));
//        System.out.println(session.get(OrderDetail.class,"O-002"));

        //for delete
//        session.delete(session.get(OrderDetail.class,"O-001"));
//        session.delete(session.get(OrderDetail.class,"O-002"));

        transaction.commit();
        session.close();
    }
}