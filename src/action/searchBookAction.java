package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import po.Book;
import service.BookSearchFilter;
import service.LoginState;

import javax.servlet.http.HttpSession;
import java.util.List;

public class searchBookAction extends ActionSupport {
    private String search_book;
    private BookSearchFilter bookSearchFilter;
    private LoginState loginState;

    public void setLoginState(LoginState loginState) {
        this.loginState = loginState;
    }

    public void setBookSearchFilter(BookSearchFilter bookSearchFilter) {
        this.bookSearchFilter = bookSearchFilter;
    }

    public String getSearch_book() {
        return search_book;
    }

    public void setSearch_book(String search_book) {
        this.search_book = search_book;
    }

    @Override
    public String execute() throws Exception {
        if(!loginState.checkSession("user")){
            return ERROR;
        }
        List<Book> all = bookSearchFilter.getBook(this.getSearch_book());
        ServletActionContext.getRequest().setAttribute("result", all);
        return SUCCESS;
    }
}
