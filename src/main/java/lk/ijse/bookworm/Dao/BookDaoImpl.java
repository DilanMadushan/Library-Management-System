package lk.ijse.bookworm.Dao;

import lk.ijse.bookworm.Config.FactoryConfiguration;
import lk.ijse.bookworm.Entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class BookDaoImpl {

    public String generateNextId() {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        NativeQuery<String> nativeQuery = session.createNativeQuery("SELECT id FROM book ORDER BY id DESC LIMIT 1");
        String id = nativeQuery.uniqueResult();
        transaction.commit();
        session.close();

        if (id!=null) {
            return splitId(id);
        }else{
            return splitId(null);
        }
    }

    private String splitId(String currentId) {
        if(currentId != null) {
            String[] strings = currentId.split("B0");
            int id = Integer.parseInt(strings[1]);
            id++;
            String ID = String.valueOf(id);
            int length = ID.length();
            if (length < 2){
                return "B00"+id;
            }else {
                if (length < 3){
                    return "B0"+id;
                }else {
                    return "B"+id;
                }
            }
        }
        return "B001";
    }

    public List<Book> getAll() {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        NativeQuery nativeQuery = session.createNativeQuery("SELECT * FROM book ");
        nativeQuery.addEntity(Book.class);
        List<Book> books = nativeQuery.getResultList();

        transaction.commit();
        session.close();

        return books;

    }

    public boolean Save(Book book) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(book);

        transaction.commit();
        session.close();

        return true;
    }

    public boolean delete(Book book) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.remove(book);

        transaction.commit();
        session.close();

        return true;
    }

    public boolean update(Book book) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.update(book);

        transaction.commit();
        session.close();

        return true;
    }
}
