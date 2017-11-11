package server.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class test {
    static Configuration config = null;
    static SessionFactory sessionFactory = null;
    static Session session = null;
    static Transaction tx = null;
    public static void main(String[] args){
        config = new Configuration().configure("/hibernate.cfg.xml");
        sessionFactory = config.buildSessionFactory();
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        BuyinEntity burning = new BuyinEntity();
        burning.setKeyno("1");
        BuyinEntity yyf = new BuyinEntity();
        yyf.setKeyno("8");
        BuyinEntity pis = new BuyinEntity();
        pis.setKeyno("9");
        session.save(burning);
        session.save(yyf);
        session.save(pis);
        tx.commit();
        session.close();
    }
}