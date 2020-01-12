package dao;

import po.User;

import java.util.List;

public interface UserDao {
    public void save(User user);
    public void delete(String userid);
    public void update(User user);
    public List queryAll();
    public User queryByID(String userid);
}
