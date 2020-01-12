package action;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import po.User;
import service.UserService;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

public class UpdateAction extends ActionSupport{
	private String userid;
	private String username;
	private String password;
	private UserService us;

	public void setUs(UserService us) {
		this.us = us;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void validate() {
		if(this.getUsername() == null || this.getUsername().equals("")){
			this.addFieldError("username","用户名不能为空");
		} else if(this.getPassword() == null || this.getPassword().equals("")){
			this.addFieldError("password","密码不能为空");
		}
	}

	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		User user = new User();
		user.setUserid(session.getAttribute("usercode").toString());
		user.setUsername(username);
		user.setPassword(password);
		us.updateUser(user);
		session.setAttribute("passwd",this.getPassword());
		return SUCCESS;
	}
	
}
