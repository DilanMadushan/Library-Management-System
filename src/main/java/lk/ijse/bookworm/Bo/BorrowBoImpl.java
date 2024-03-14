package lk.ijse.bookworm.Bo;

import lk.ijse.bookworm.Dao.BorrowDaOImpl;

public class BorrowBoImpl {

    BorrowDaOImpl borrowDaO = new BorrowDaOImpl();
    public String generateNextOrderDetailId() {
        return borrowDaO.generateNextValue2();
    }

    public String genarateNextBorrowId() {
        return borrowDaO.generateNextValue();
    }
}
