package lk.ijse.bookworm.Bo.Custom.impl;

import lk.ijse.bookworm.Bo.Custom.BorrowBo;
import lk.ijse.bookworm.Dao.BorrowDaOImpl;

public class BorrowBoImpl implements BorrowBo {


    BorrowDaOImpl borrowDaO = new BorrowDaOImpl();
    @Override
    public String generateNextOrderDetailId() throws Exception {
        return borrowDaO.generateNextValue2();
    }
    @Override
    public String genarateNextBorrowId() throws Exception {
        return borrowDaO.generateNextValue();
    }
}
