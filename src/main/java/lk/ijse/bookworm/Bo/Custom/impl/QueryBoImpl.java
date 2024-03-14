package lk.ijse.bookworm.Bo.Custom.impl;

import javafx.collections.ObservableList;
import lk.ijse.bookworm.Dao.QueryDaoImpl;
import lk.ijse.bookworm.Dto.TimeOutDto;
import lk.ijse.bookworm.Dto.TransactionDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;


public class QueryBoImpl {

    QueryDaoImpl queryDao = new QueryDaoImpl();
    public List<TransactionDto> getTransactions(String user) throws Exception{
        List<Object[]> objects= queryDao.getTransaction(user);

        ArrayList<TransactionDto> trans = new ArrayList<>();


        for(Object[] ob : objects){
            trans.add(new TransactionDto(
                    (String) ob[0],
                    (String) ob[1],
                    (String) ob[2],
                    (Date) ob[3],
                    (Date) ob[4],
                    (String) ob[5]
            ));
        }
        return trans;

    }

    public List<TimeOutDto> setAllTimeOut() {
        List<Object[]> objects = queryDao.getAllTimeOut();

        ArrayList<TimeOutDto> trans = new ArrayList<>();


        for(Object[] ob : objects){
            trans.add(new TimeOutDto(
                    (String) ob[0],
                    (String) ob[1],
                    (String) ob[2],
                    (Date) ob[3],
                    (Date) ob[4]
            ));
        }
        return trans;

    }
}
