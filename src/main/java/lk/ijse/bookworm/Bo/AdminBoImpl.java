package lk.ijse.bookworm.Bo;

import lk.ijse.bookworm.Dao.AdminDaoImpl;
import lk.ijse.bookworm.Dto.AdminDto;
import lk.ijse.bookworm.Entity.Admin;
import lk.ijse.bookworm.Entity.Branch;

import java.util.ArrayList;
import java.util.List;

public class AdminBoImpl{

    AdminDaoImpl adminDao = new AdminDaoImpl();

    public boolean saveCustomer(AdminDto adminDto) {
        return adminDao.save(new Admin(adminDto.getId(),adminDto.getName(),adminDto.getPassword(),new ArrayList<Branch>()));
    }

    public boolean check(AdminDto adminDto) {
        return adminDao.check(new Admin(adminDto.getName(),adminDto.getPassword(),new ArrayList<Branch>()));
    }

    public List<AdminDto> getAllAdmin() {
        List<Admin> admins = adminDao.getAll();

        List<AdminDto> adminDtoList = new ArrayList<>();

        for(Admin admin :admins){
            adminDtoList.add(new AdminDto(admin.getId(),admin.getName(),admin.getPassword()));
        }
        return adminDtoList;
    }


    public String genarateNextAdminId() {
        return adminDao.generateNextId();
    }
}
