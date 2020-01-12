package service;

public class AdminCheck {
    private String name;
    private String password;

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean logincheck(String name, String password){
        if(name.equals(this.name)&&password.equals(this.password)){
            return true;
        }
        return false;
    }
}
