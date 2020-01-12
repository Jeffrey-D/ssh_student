package service;

import dao.UserDao;
import po.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;   //依赖注入，可以根据情况，在配置文件里面置不同的实例类型

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        if(userDao.queryByID(user.getUserid())==null){
            userDao.save(user);
        } else {
            System.out.println("信息已经存在");
        }
    }

    @Override
    public void deleteUser(String userid) {
        System.out.println("......."+userid);
        if (userDao.queryByID(userid) != null) {
            userDao.delete(userid);
        } else {
            System.out.println("查无此人");
        }
    }
    @Override
    public void updateUser(User user) {
        if(userDao.queryByID(user.getUserid())!=null){
            userDao.update(user);
        } else {
            System.out.println("查无此人");
        }
    }

    @Override
    public List queryAllUser() {
        return userDao.queryAll();
    }

    @Override
    public User queryUserByID(String userid) {
        return userDao.queryByID(userid);
    }
}
