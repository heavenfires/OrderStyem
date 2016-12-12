package com.example.test;

import com.example.orderstyem.Vdata;  
import com.example.orderstyem.Userdata;
import android.test.AndroidTestCase;  

public class test extends AndroidTestCase{
	private String Vname;
	private Integer Vprice; // ¼Û¸ñ
	private String username;  
    private String password; 
	
	public String testgetVname() throws Exception{  
		 Vdata vdata = new Vdata();  
		 return vdata.getVname();  
	    }  
	
	 public void testsetVname() throws Exception{  
		 Vdata vdata = new Vdata();  
		 vdata.setVname(Vname);  
	    }  	 

	 public Integer testgetVprice() throws Exception{  
		 Vdata vdata = new Vdata();  
		 return vdata.getVprice();  
	    }  
	 
	 public void testsetVprice() throws Exception{  
		 Vdata vdata = new Vdata();  
		 vdata.setVprice( Vprice);  
	    }  	
	 
	 public boolean testgetusername() throws Exception{  
		 if("root".equals(username)){
			 return true;
		 }
		return false;
	    }  	
	 
	 public void testsetVusername() throws Exception{  
		 Userdata userdata = new Userdata();  
		 userdata.setVusername(username);  
	    }  	
	 
	 public boolean testgetpassword() throws Exception{  
		 if("admin".equals(password)){
			 return true;
		 }
		return false;
	    }  	
	 
	 public void testsetVpassword() throws Exception{  
		 Userdata userdata = new Userdata();  
		 userdata.setVpassword( password);  
	    }  	
	 
}
