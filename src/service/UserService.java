package service;

import po.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);
    public void deleteUser(String userid);
    public void updateUser(User user);
    public List queryAllUser();
    public User queryUserByID(String userid);
}
