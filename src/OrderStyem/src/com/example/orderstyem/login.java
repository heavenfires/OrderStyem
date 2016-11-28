package com.example.orderstyem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class login extends Activity {
	public  Button login;

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		super.onCreate(savedInstanceState);
		
		    login=(Button)findViewById(R.id.login);
	        login.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(login.this,MainActivity.class);
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
