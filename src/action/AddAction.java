package action;


import com.opensymphony.xwork2.ActionSupport;
import po.User;
import service.UserService;

public class AddAction extends ActionSupport{
	private String userid;
	private String username;
	private String password;
	private String passwdck;

	public String getPasswdck() {
		return passwdck;
	}

	public void setPasswdck(String passwdck) {
		this.passwdck = passwdck;
	}

	private UserService us;

	public UserService getUs() {
		return us;
	}

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

	// 数据校验
	@Override
	public void validate() {
		System.out.println(us+"usususu++++++++++++++++++++++++++++");
		if(this.getUserid().length() != 11){
			this.addFieldError("userid","手机号必须为11位");
		} else if(us.queryUserByID(this.getUserid())!= null) {
			this.addFieldError("userid", "手机号已经注册");
		} else if(this.getUsername() == null || this.getUsername().equals("")){
			this.addFieldError("username","用户名不能为空");
		} else if(this.getPassword() == null || this.getPassword().equals("")){
			this.addFieldError("password","密码不能为空");
		} else if(!this.getPassword().equals(this.getPasswdck())){
			this.addFieldError("passwdck","两次密码不一致");
		}

	}

	public String execute() throws Exception {
		User user = new User();
		user.setUserid(userid);
		user.setUsername(username);
		user.setPassword(password);

		us.addUser(user);
		
		return SUCCESS;
	}
	
}
