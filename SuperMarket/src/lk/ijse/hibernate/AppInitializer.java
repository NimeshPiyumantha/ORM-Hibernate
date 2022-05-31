package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.entity.Item;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {

        //---------------Customer--------------------//
        Customer c1 = new Customer();
        c1.setCusId("C001");
        c1.setCusName("Gihan");
        c1.setCusAddress("Panadura");
        c1.setCusSalary(3000);

        Customer c2 = new Customer();
        c2.setCusId("C002");
        c2.setCusName("Mahen");
        c2.setCusAddress("Galle");
        c2.setCusSalary(3000);

        Customer c3 = new Customer();
        c3.setCusId("C003");
        c3.setCusName("Pasan");
        c3.setCusAddress("Galle");
        c3.setCusSalary(3300);

        Customer c4 = new Customer();
        c4.setCusId("C004");
        c4.setCusName("MR");
        c4.setCusAddress("Mortuwa");
        c4.setCusSalary(3300);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //save customer
        session.save(c4);
        session.save(c3);
        session.save(c2);
        session.save(c1);



/*
        // for update
        Customer c1 = new Customer();

        c1.setCusId("C001");
        c1.setCusName("Nimesh");
        c1.setCusAddress("Galle");
        c1.setCusSalary(40000);
        session.update(c1);
*/


/*
        // for getting one customer
        Customer c2 = session.get(Customer.class, "C002");
        System.out.println(c2.getCusName() + " - " + c2.getCusAddress());
*/


/*
        // for deleting customer
        Customer c1 = new Customer();
        c1.setCusId("C001");
        session.delete(c1);
*/

/*
        //2nd way
        Customer c4 = session.get(Customer.class, "C004");
        session.delete(c4);
*/

        //-----------Item-------------------//
        Item t1 = new Item();
        t1.setItemCode("I001");
        t1.setItemName("Rice");
        t1.setItemUnitPrice(200);
        t1.setPackSize("1 kg");
        t1.setItemQtyOnHand(100);

        Item t2 = new Item();
        t2.setItemCode("I002");
        t2.setItemName("Bread");
        t2.setItemUnitPrice(150);
        t2.setPackSize("70 g");
        t2.setItemQtyOnHand(50);

        Item t3 = new Item();
        t3.setItemCode("I003");
        t3.setItemName("Milk Bottel");
        t3.setItemUnitPrice(250);
        t3.setPackSize("500 ml");
        t3.setItemQtyOnHand(150);

        session.save(t1);
        session.save(t2);
        session.save(t3);


/*
        // for update
         Item t3 = new Item();
       t3.setItemCode("I003");
        t3.setItemName("Milk Bottel");
        t3.setItemUnitPrice(300);
        t3.setPackSize("500 ml");
        t3.setItemQtyOnHand(150);
        session.update(t3);
*/


/*
        // for getting one customer
        Item t3 = session.get(Item.class, "I003");

        System.out.println(t3.getItemName() + " - " + t3.getItemUnitPrice());
*/


/*
        // for deleting customer
        Item t3 = new Item();
        t3.setItemCode("C003");
        session.delete(t3);
*/

/*
        //2nd way
        Item t3 = session.get(Item.class, "I003");
        session.delete(t3);
*/

        transaction.commit();
        session.close();


    }
}
