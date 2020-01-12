package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import service.AdminCheck;

import javax.servlet.http.HttpSession;

public class AdminAction extends ActionSupport {
    private String adminname;
    private String adminpassword;
    AdminCheck adminCheck;

    public void setAdminCheck(AdminCheck adminCheck) {
        this.adminCheck = adminCheck;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }

    @Override
    public void validate() {
        if (this.getAdminname().equals("") || this.getAdminname() == null) {
            this.addFieldError("adminname", "管理员账号不可为空");
        } else if (this.getAdminpassword().equals("") || this.getAdminpassword() == null) {
            this.addFieldError("adminpassword", "密码不能为空");
        }
    }

    @Override
    public String execute() throws Exception {
        if (adminCheck.logincheck(this.getAdminname(), this.getAdminpassword())) {
            HttpSession session = ServletActionContext.getRequest().getSession();
            session.setAttribute("admin",this.getAdminname());
            return SUCCESS;
        } else {
            this.addFieldError("adminname", "账户或密码错误");
        }
        return INPUT;

    }
}
