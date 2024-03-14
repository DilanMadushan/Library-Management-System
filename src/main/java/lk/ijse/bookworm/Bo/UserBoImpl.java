package lk.ijse.bookworm.Bo;

import lk.ijse.bookworm.Dao.UserDaoImpl;
import lk.ijse.bookworm.Dto.UserDto;
import lk.ijse.bookworm.Entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserBoImpl {

    UserDaoImpl userDao = new UserDaoImpl();
    public List<UserDto> getAllUser() {
        List<User> users = userDao.getAll();
        List<UserDto> userDto = new ArrayList<>();

        for(User user : users){
            userDto.add(new UserDto(
                    user.getId(),
                    user.getName(),
                    user.getAddress(),
                    user.getEmail(),
                    user.getPhone()
            ));
        }
        return userDto;
    }

    public String generateNextUserId() {
        return userDao.generateNextId();
    }

    public boolean saveUser(UserDto userDto) {
        return userDao.save(new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getAddress(),
                userDto.getEmail(),
                userDto.getPhone()
        ));
    }

    public boolean DeleteUser(UserDto userDto) {
        return userDao.delete(new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getAddress(),
                userDto.getEmail(),
                userDto.getPhone()
        ));
    }

    public boolean updateUser(UserDto userDto) {
        return userDao.update(new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getAddress(),
                userDto.getEmail(),
                userDto.getPhone()
        ));
    }

    public UserDto SearchUser(String id) throws Exception {
        User user = userDao.Search(id);

        return new UserDto(
                user.getId(),
                user.getName(),
                user.getAddress(),
                user.getEmail(),
                user.getPhone()
        );
    }
}
