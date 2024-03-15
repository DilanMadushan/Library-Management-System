package lk.ijse.bookworm.Dao.Custom;

import lk.ijse.bookworm.Config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;

public interface QueryDao {
    public List<Object[]> getTransaction(String user)throws Exception;

    public List<Object[]> getAllTimeOut();
}
