package lk.ijse.bookworm.Bo;

import lk.ijse.bookworm.Dao.BookDaoImpl;

public class BookBoImpl {

    BookDaoImpl bookDao = new BookDaoImpl();
    public String generateNextBookId() {
        return bookDao.generateNextId();
    }
}
