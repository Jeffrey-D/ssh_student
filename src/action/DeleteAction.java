package action;


import com.opensymphony.xwork2.ActionSupport;
import service.UserService;

public class DeleteAction extends ActionSupport{
	private String userid;
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

	public String execute() throws Exception {
		us.deleteUser(getUserid());
		return SUCCESS;
	}
	
}
