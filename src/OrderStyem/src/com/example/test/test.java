package com.example.test;

import com.example.orderstyem.Vdata;   
import android.test.AndroidTestCase;  

public class test extends AndroidTestCase{
	private String Vname;
	private Integer Vprice; // ¼Û¸ñ
	
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
}
