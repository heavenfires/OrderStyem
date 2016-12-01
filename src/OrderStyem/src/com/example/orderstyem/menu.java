package com.example.orderstyem;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class menu extends Activity{
	
	public  Button order;
	public  Button account;
	public  Button user;
	public  Button btnx1;
	public  Button view1;
	public  Button add1_1;
	public  Button add1_2;
	public  Button add1_3;
	public  Button add1_4;
	public  Button add1_5;
	SharedPreferences preferences;
    SharedPreferences.Editor editor;
    SharedPreferences preferences1;
    SharedPreferences.Editor editor1;
    SharedPreferences preferences2;
    SharedPreferences.Editor editor2;
    SharedPreferences preferences3;
    SharedPreferences.Editor editor3;
    SharedPreferences preferences4;
    SharedPreferences.Editor editor4;
    public TextView text1_1;
    public TextView text1_2;
    public TextView text1_3;
    public TextView text1_4;
    public TextView text1_5;
    
	 
		protected void onCreate(Bundle savedInstanceState){
			super.onCreate(savedInstanceState);
			setContentView(R.layout.menu);	
	 

			
			btnx1=(Button)findViewById(R.id.btnx1);
			btnx1.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent=new Intent();
					intent.setClass(menu.this,menulist.class);
					startActivity(intent);
					finish();
				        }
		           });
			view1=(Button)findViewById(R.id.view1);
			view1.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent=new Intent();
					intent.setClass(menu.this,order.class);
					startActivity(intent);
					finish();
				        }
		           });
			
			 text1_1=(TextView) findViewById (R.id.text1_1);
			add1_1=(Button)findViewById(R.id.add1_1);
		    preferences = getSharedPreferences("menulist", MODE_PRIVATE);
	        editor = preferences.edit();
			add1_1.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
			        editor.putString("C1",text1_1.getText().toString()) ;
	                //提交数据
	                editor.commit(); 
   				
					 Toast.makeText(menu.this, "加入点单购物车成功！", Toast.LENGTH_SHORT).show(); 
				        }
		           });
			
			    text1_2=(TextView) findViewById (R.id.text1_2);
				add1_2=(Button)findViewById(R.id.add1_2);
			    preferences1 = getSharedPreferences("menulist1", MODE_PRIVATE);
		        editor1 = preferences1.edit();
				add1_2.setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
				        editor1.putString("C2",text1_2.getText().toString()) ;
		                //提交数据
		                editor1.commit(); 
	   				
						 Toast.makeText(menu.this, "加入点单购物车成功！", Toast.LENGTH_SHORT).show(); 
					        }
			           });
				
				  text1_3=(TextView) findViewById (R.id.text1_3);
					add1_3=(Button)findViewById(R.id.add1_3);
				    preferences2 = getSharedPreferences("menulist2", MODE_PRIVATE);
			        editor2 = preferences2.edit();
					add1_3.setOnClickListener(new OnClickListener(){
						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
					        editor2.putString("C3",text1_3.getText().toString()) ;
			                //提交数据
			                editor2.commit(); 
		   				
							 Toast.makeText(menu.this, "加入点单购物车成功！", Toast.LENGTH_SHORT).show(); 
						        }
				           });
					
					 text1_4=(TextView) findViewById (R.id.text1_4);
						add1_4=(Button)findViewById(R.id.add1_4);
					    preferences3 = getSharedPreferences("menulist3", MODE_PRIVATE);
				        editor3 = preferences3.edit();
						add1_4.setOnClickListener(new OnClickListener(){
							@Override
							public void onClick(View arg0) {
								// TODO Auto-generated method stub
						        editor3.putString("C4",text1_4.getText().toString()) ;
				                //提交数据
				                editor3.commit(); 
			   				
								 Toast.makeText(menu.this, "加入点单购物车成功！", Toast.LENGTH_SHORT).show(); 
							        }
					           });
						
						 text1_5=(TextView) findViewById (R.id.text1_5);
							add1_5=(Button)findViewById(R.id.add1_5);
						    preferences4 = getSharedPreferences("menulist4", MODE_PRIVATE);
					        editor4 = preferences4.edit();
							add1_5.setOnClickListener(new OnClickListener(){
								@Override
								public void onClick(View arg0) {
									// TODO Auto-generated method stub
							        editor4.putString("C5",text1_5.getText().toString()) ;
					                //提交数据
					                editor4.commit(); 
				   				
									 Toast.makeText(menu.this, "加入点单购物车成功！", Toast.LENGTH_SHORT).show(); 
								        }
						           });	
			
			
	   order=(Button)findViewById(R.id.order);
       order.setOnClickListener(new OnClickListener(){
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			intent.setClass(menu.this,order.class);
			startActivity(intent);
			finish();
		        }
           });
       
       account=(Button)findViewById(R.id.account);
       account.setOnClickListener(new OnClickListener(){
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			intent.setClass(menu.this, account.class);
			startActivity(intent);
			finish();
	         	}
		        });
       
       user=(Button)findViewById(R.id.user);
       user.setOnClickListener(new OnClickListener(){
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			intent.setClass(menu.this, user.class);
			startActivity(intent);
			finish();
		        }
           });
  	}

@Override
public boolean onCreateOptionsMenu(Menu menu) {
	// TODO Auto-generated method stub
	getMenuInflater().inflate(R.menu.main, menu);
	return true;
}
}
				      

