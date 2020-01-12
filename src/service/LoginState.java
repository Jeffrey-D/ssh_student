package service;


import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

public class LoginState {

    public boolean checkSession(String user) {
        HttpSession session = ServletActionContext.getRequest().getSession();
        if (user.equals("user")) {
            if (session.getAttribute("usercode") == null || session.getAttribute("usercode").equals("")) {
                return false;
            }
            return true;
        }
        if(user.equals("admin")){
            if(session.getAttribute("admin")==null){
                return false;
            }
            return true;
        }
        return false;
    }

}


//page---179 applicationcontext.xml配置文件的内容以及作用