package dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import po.User;

import java.util.List;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    @Override
    public void save(User user) {
        this.getHibernateTemplate().save(user);
    }

    @Override
    public void delete(String userid) {
        this.getHibernateTemplate().delete(
                this.getHibernateTemplate().get(User.class,userid)
        );
    }

    @Override
    public void update(User user) {
        this.getHibernateTemplate().saveOrUpdate(user);
    }

    @Override
    public List queryAll() {
       return this.getHibernateTemplate().find("from User");
    }

    @Override
    public User queryByID(String userid) {
        return (User)this.getHibernateTemplate().get(User.class,userid);

    }
}
