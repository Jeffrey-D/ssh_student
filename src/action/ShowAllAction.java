package action;

import java.util.List;


import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import service.LoginState;
import service.UserService;

public class ShowAllAction extends ActionSupport {
	private UserService us;
	private LoginState loginState;

	public void setLoginState(LoginState loginState) {
		this.loginState = loginState;
	}

	public void setUs(UserService us) {
		this.us = us;
	}

	public String execute() throws Exception {
		if(!loginState.checkSession("admin")){
			return ERROR;
		}
		List all = us.queryAllUser();
		ServletActionContext.getRequest().setAttribute("all", all);
		return SUCCESS;
	}

}
