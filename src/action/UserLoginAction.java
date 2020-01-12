package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import service.UserService;

import javax.servlet.http.HttpSession;
import java.awt.*;


public class UserLoginAction extends ActionSupport {
    private String usercode;
    private String userpasswd;
    private UserService us;
//    private AddAction addAction;


    public void setUs(UserService us) {
        this.us = us;
    }


    public UserService getUs() {
        return us;
    }


    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUserpasswd() {
        return userpasswd;
    }

    public void setUserpasswd(String userpasswd) {
        this.userpasswd = userpasswd;
    }

    @Override
    public void validate() {
        if (this.getUsercode().equals("") || this.getUsercode() == null) {
            this.addFieldError("usercode", "手机号不能为空");
        } else if (this.getUserpasswd().equals("") || this.getUserpasswd() == null) {
            this.addFieldError("userpasswd", "密码不能为空");
        }else if(us.queryUserByID(getUsercode())==null) {
            this.addFieldError("usercode","手机号未注册");
        } else if (!us.queryUserByID(this.getUsercode()).getPassword().equals(this.getUserpasswd())) {
            this.addFieldError("userpasswd", "密码错误");
        }
    }

    @Override
    public String execute() throws Exception {
        List info = new List();
        info.add(this.getUsercode());
        info.add(this.getUserpasswd());
        HttpSession session = ServletActionContext.getRequest().getSession();
        session.setAttribute("usercode",this.getUsercode());
        session.setAttribute("passwd",this.getUserpasswd());
        return SUCCESS;
    }

}