package com.example.orderstyem;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.BmobObject;

public class Vdata extends BmobObject{

	private String Vname;  //²ËÃû
    private Integer Vprice; // ¼Û¸ñ

    public String getVname() {
        return Vname;
    }
    
    public void setVname(String Vname) {
        this.Vname = Vname;
    }

    public Integer getVprice() {
        return Vprice;
    }

    public void setVprice(Integer Vprice) {
        this.Vprice = Vprice;
    }
}



