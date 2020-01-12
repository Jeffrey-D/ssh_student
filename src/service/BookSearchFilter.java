package service;

import dao.BookDao;
import po.Book;

import java.util.ArrayList;
import java.util.List;

public class BookSearchFilter {

    private BookDao bookDao;  //spring注入
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }


    public List<Book> getBook(String bookname) throws Exception {
        List<Book> result = new ArrayList<>();
        List<Book> list= bookDao.queryAll();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getName().trim().contains(bookname) && !bookname.equals("")){
                result.add(list.get(i));
            }
        }

        return result;
    }
}
