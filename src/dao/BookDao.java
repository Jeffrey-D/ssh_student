package dao;
import po.Book;

import java.util.*;

public interface BookDao {
    // 增加操作
    public void insert(Book book) throws Exception ;
    // 修改操作
    public void update(Book book) throws Exception ;
    // 删除操作
    public void delete(String bookid) throws Exception ;
    // 按ID查询操作
    public Book queryById(String bookid) throws Exception ;
    // 查询全部
    public List queryAll() throws Exception ;
}
//使用DAO完成以下功能：
// ①在数据库中建立表格T-Book（BookID，BookName，BookPrice），插入一些记录。
// ②编写一个模糊查询图书的界面，输入图书名称的模糊资料，显示查询的图书的ID、名称和价格。
// ③如果图书价格在30元以上，则以黄色字体显示其名称。
