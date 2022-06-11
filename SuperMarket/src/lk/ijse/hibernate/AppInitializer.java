package lk.ijse.hibernate;

import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        transaction.commit();
        session.close();
    }
}