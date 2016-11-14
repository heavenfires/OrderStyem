package com.example.orderstyem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class order extends Activity {
	public  Button menu;
	public  Button order;
	public  Button account;
	public  Button user;

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.order);
			super.onCreate(savedInstanceState);
		 menu=(Button)findViewById(R.id.menu);
	        menu.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(order.this,MainActivity.class);
				startActivity(intent);
				finish();
			}
	    	   
	       });
	        
	        order=(Button)findViewById(R.id.order);
	        order.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(order.this,order.class);
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
				intent.setClass(order.this, account.class);
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
				intent.setClass(order.this, user.class);
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
