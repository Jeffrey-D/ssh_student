package dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import po.Book;
import po.User;

import java.util.List;

public class BookDaoImpl extends HibernateDaoSupport implements BookDao{
    @Override
    public void insert(Book book) throws Exception {
        this.getHibernateTemplate().save(book);
    }

    @Override
    public void update(Book book) throws Exception {
        this.getHibernateTemplate().saveOrUpdate(book);
    }

    @Override
    public void delete(String bookid) throws Exception {
        this.getHibernateTemplate().delete(this.getHibernateTemplate().get(Book.class,bookid));
    }

    @Override
    public Book queryById(String bookid) throws Exception {
        return (Book) this.getHibernateTemplate().get(Book.class,bookid);
    }

    @Override
    public List queryAll() throws Exception {
        return this.getHibernateTemplate().find("from Book");
    }
}
