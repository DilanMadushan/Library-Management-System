package lk.ijse.bookworm.Bo;

import lk.ijse.bookworm.Dao.AdminDaoImpl;
import lk.ijse.bookworm.Dao.BranchDaoImpl;
import lk.ijse.bookworm.Dto.BranchDto;
import lk.ijse.bookworm.Entity.Admin;
import lk.ijse.bookworm.Entity.Book;
import lk.ijse.bookworm.Entity.Branch;

import java.util.ArrayList;
import java.util.List;

public class BranchBoImpl {
    BranchDaoImpl branchDao = new BranchDaoImpl();
    AdminDaoImpl adminDao = new AdminDaoImpl();
    public String generateNextId() throws Exception{
        return branchDao.genatareNextId();
    }

    public List<BranchDto> getAllBranch()throws Exception {
        List<Branch> branches = branchDao.getAll();
        List<BranchDto> branchDto = new ArrayList<>();

        for(Branch branch : branches){
            branchDto.add(new BranchDto(
                    branch.getId(),
                    branch.getName()
                    ,branch.getLocation()
                    ,branch.getAddress()
                    ,branch.getAdmin()
            ));
        }
        return branchDto;
    }

    public boolean save(BranchDto branchDto) throws Exception{

        return branchDao.save(new Branch(
                branchDto.getId(),
                branchDto.getName(),
                branchDto.getLocation(),
                branchDto.getAddress(),
                branchDto.getAdmin(),
                new ArrayList<Book>()
        ));
    }

    public boolean deleteBranch(BranchDto branchDto)throws Exception {
        return branchDao.delete(new Branch(
                branchDto.getId(),
                branchDto.getName(),
                branchDto.getLocation(),
                branchDto.getAddress(),
                branchDto.getAdmin(),
                new ArrayList<Book>()
        ));
    }

    public boolean updateBranch(BranchDto branchDto) throws Exception{
        return branchDao.update(new Branch(
                branchDto.getId(),
                branchDto.getName(),
                branchDto.getLocation(),
                branchDto.getAddress(),
                branchDto.getAdmin(),
                new ArrayList<Book>()
        ));
    }
}
