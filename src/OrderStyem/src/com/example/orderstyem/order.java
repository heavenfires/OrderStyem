package com.example.orderstyem;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class order extends Activity {
	public  Button menu;
	public  Button account;
	public  Button user;
	public  Button clear;
	  


		
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.order);
		super.onCreate(savedInstanceState);	
		
		TextView c1 = (TextView) findViewById(R.id.C1);
	    SharedPreferences sp=getSharedPreferences("menulist1", 0);
	    String C1=sp.getString("C1", sp.getString("C1", ""));	
	    c1.setText(C1);
		
	    TextView c2 = (TextView) findViewById(R.id.C2);
		SharedPreferences sp1=getSharedPreferences("menulist2", 0);
	    String C2=sp1.getString("C2", sp1.getString("C2", ""));	
	    c2.setText(C2);
	    
	    TextView c3 = (TextView) findViewById(R.id.C3);
		SharedPreferences sp2=getSharedPreferences("menulist3", 0);
	    String C3=sp2.getString("C3", sp2.getString("C3", ""));	
	    c3.setText(C3);
	    
	    TextView c4 = (TextView) findViewById(R.id.C4);
		SharedPreferences sp3=getSharedPreferences("menulist4", 0);
	    String C4=sp3.getString("C4", sp3.getString("C4", ""));	
	    c4.setText(C4);
	    
	    TextView c5 = (TextView) findViewById(R.id.C5);
		SharedPreferences sp4=getSharedPreferences("menulist5", 0);
	    String C5=sp4.getString("C5", sp4.getString("C5", ""));	
	    c5.setText(C5);
	    
	    TextView c6 = (TextView) findViewById(R.id.C6);
		SharedPreferences sp5=getSharedPreferences("menulist6", 0);
	    String C6=sp5.getString("C6", sp5.getString("C6", ""));	
	    c6.setText(C6);
		
	    TextView c7 = (TextView) findViewById(R.id.C7);
		SharedPreferences sp6=getSharedPreferences("menulis7t", 0);
	    String C7=sp6.getString("C7", sp6.getString("C7", ""));	
	    c7.setText(C7);
	    
	    TextView c8 = (TextView) findViewById(R.id.C8);
		SharedPreferences sp7=getSharedPreferences("menulist8", 0);
	    String C8=sp7.getString("C8", sp7.getString("C8", ""));	
	    c8.setText(C8);
	    
	    TextView c9 = (TextView) findViewById(R.id.C9);
		SharedPreferences sp8=getSharedPreferences("menulist9", 0);
	    String C9=sp8.getString("C9", sp8.getString("C9", ""));	
	    c9.setText(C9);
	    
	    TextView c10 = (TextView) findViewById(R.id.C10);
		SharedPreferences sp9=getSharedPreferences("menulist10", 0);
	    String C10=sp9.getString("C10", sp9.getString("C10", ""));	
	    c10.setText(C10);
	    
	    clear=(Button)findViewById(R.id.clear);
	    clear.setOnClickListener(new OnClickListener(){
		@Override
		public void onClick(View arg0) {
			SharedPreferences sp = getSharedPreferences("menulist1", MODE_PRIVATE);
			Editor editor = sp.edit();  
			SharedPreferences sp1 = getSharedPreferences("menulist2", MODE_PRIVATE);
			Editor editor1 = sp1.edit();  
			SharedPreferences sp2 = getSharedPreferences("menulist3", MODE_PRIVATE);
			Editor editor2 = sp2.edit();  
			SharedPreferences sp3 = getSharedPreferences("menulist4", MODE_PRIVATE);
			Editor editor3 = sp3.edit();  
			SharedPreferences sp4 = getSharedPreferences("menulist5", MODE_PRIVATE);
			Editor editor4 = sp4.edit();  
			SharedPreferences sp5 = getSharedPreferences("menulist6", MODE_PRIVATE);
			Editor editor5 = sp5.edit();  
			SharedPreferences sp6 = getSharedPreferences("menulist7", MODE_PRIVATE);
			Editor editor6 = sp6.edit();  
			SharedPreferences sp7 = getSharedPreferences("menulist8", MODE_PRIVATE);
			Editor editor7 = sp7.edit();  
			SharedPreferences sp8 = getSharedPreferences("menulist9", MODE_PRIVATE);
			Editor editor8 = sp8.edit();  
			SharedPreferences sp9 = getSharedPreferences("menulist10", MODE_PRIVATE);
			Editor editor9 = sp9.edit();  
			editor.clear();  
			editor.commit();
			editor1.clear();  
			editor1.commit();
			editor2.clear();  
			editor2.commit();
			editor3.clear();  
			editor3.commit();
			editor4.clear();  
			editor4.commit();
			editor5.clear();  
			editor5.commit();
			editor6.clear();  
			editor6.commit();
			editor7.clear();  
			editor7.commit();
			editor8.clear();  
			editor8.commit();
			editor9.clear();  
			editor9.commit();
			Toast.makeText(order.this, "��ղ˵����ɹ���", Toast.LENGTH_SHORT).show();
			}
           });
		      
	   
		  
	    
		    menu=(Button)findViewById(R.id.menu);
	        menu.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(order.this,menu.class);
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
