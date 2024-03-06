package lk.ijse.bookworm.Config;


import lk.ijse.bookworm.Entity.Admin;
import lk.ijse.bookworm.Entity.Branch;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    public static FactoryConfiguration factoryConfiguration;

    private SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Configuration configuration = new Configuration().configure().
                addAnnotatedClass(Admin.class)
                .addAnnotatedClass(Branch.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration ==null) ? factoryConfiguration = new FactoryConfiguration() : factoryConfiguration;
    }

    public Session getSession(){
     return  sessionFactory.openSession();
    }

}
