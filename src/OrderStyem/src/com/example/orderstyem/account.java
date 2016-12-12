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

public class account extends Activity {
	public  Button menu;
	public  Button order;
	public  Button user;
	public  Button clear1;
	SharedPreferences shared;
    SharedPreferences.Editor editor11;

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.account);
		super.onCreate(savedInstanceState);
		
		TextView view = (TextView) findViewById(R.id.tview);
		TextView kcp = (TextView) findViewById(R.id.cp);
	    SharedPreferences shared=getSharedPreferences("zjs",MODE_PRIVATE);
	    String cjs=shared.getString("cjs",shared.getString("cjs",""));	
	    int js=shared.getInt("js",shared.getInt("js", 0));	
	    String sr =  String.valueOf(js);  
	    view.setText(sr);  
	    kcp.setText(cjs);
	
	    clear1=(Button)findViewById(R.id.clear1);
	    clear1.setOnClickListener(new OnClickListener(){
		@Override
		public void onClick(View arg0) {
			  SharedPreferences shared=getSharedPreferences("zjs",MODE_PRIVATE);
			  editor11 = shared.edit();
			  editor11.clear();  
			  editor11.commit();
			 startActivity(new Intent(account.this, account.class));
			Toast.makeText(account.this, "Çå¿Õ³É¹¦£¡", Toast.LENGTH_SHORT).show();
			}
           });
	       
		    menu=(Button)findViewById(R.id.menu);
	        menu.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(account.this,menu.class);
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
				intent.setClass(account.this,order.class);
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
				intent.setClass(account.this, user.class);
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
