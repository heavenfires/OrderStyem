package com.example.orderstyem;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.BmobObject;

public class Userdata extends BmobObject{

	private String username;  
    private String password; 

    public String getusername() {
        return username;
    }
    
    public void setVusername(String username) {
        this.username = username;
    }

    public String getpassword() {
        return password;
    }

    public void setVpassword(String password) {
        this.password = password;
    }
}

