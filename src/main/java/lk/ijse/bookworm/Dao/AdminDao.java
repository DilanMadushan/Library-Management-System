package lk.ijse.bookworm.Dao;

import lk.ijse.bookworm.Config.FactoryConfiguration;
import lk.ijse.bookworm.Dto.AdminDto;
import lk.ijse.bookworm.Entity.Admin;
import lk.ijse.bookworm.Entity.Branch;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class AdminDao {

    public void save(AdminDto adminDto) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Admin admin = new Admin(adminDto.getName(),adminDto.getPassword(),new ArrayList<Branch>());
        session.save(admin);

        transaction.commit();
        session.close();
    }

    public Admin getAll(AdminDto adminDto) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

//        AdminDto admin = session.
//        System.out.println(adminDto.getName());

        transaction.commit();
        session.close();

        return null;
    }
}
