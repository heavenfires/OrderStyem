package com.example.orderstyem;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import cn.bmob.v3.Bmob;

public class MainActivity extends Activity {
	public  Button menu;
	public  Button order;
	public  Button account;
	public  Button user;
	public  Button data;
	private TextView tv,tv1;
	private int index=0;
	private Context mContext = this;
	
	private int [] imagePath=new int[]{
   		 R.drawable.aa,R.drawable.bb,R.drawable.cc,R.drawable.ee,R.drawable.ff,
    };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Log.i("test", "333333");
		tv=(TextView)findViewById(R.id.tv);
        tv.setText(Html.fromHtml("<font color=red>Welcome to</font><font color=blue> experience the</font><font color=green> OrderStyem APP.</font><font color=purple>亲，终于等到你，赶快来体验一下吧!</font>"));
        final Intent intent=getIntent();	//获取Intent对象
 		//Bundle bundle=intent.getExtras();	//获取传递的数据包
 		tv1=(TextView)findViewById(R.id.textView1);
 		SharedPreferences sp11=getSharedPreferences("mrosoft", MODE_PRIVATE);
 		String username=sp11.getString("un","fail");
 		tv1.setText("欢迎您用户:  "+username);
  
         LinearLayout layout=(LinearLayout)findViewById(R.id.layout);
         ImageView img=new ImageView(this);
         img.setImageResource(imagePath[index]);
         LayoutParams Params=new LayoutParams(400,200);
         img.setLayoutParams(Params);
         
         img.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(index<4){
					index++;
				           } 
				else{
					index=0;
				    }
				((ImageView)v).setImageResource(imagePath[index]);
				return;
			}
		});
          layout.addView(img);
         
		    menu=(Button)findViewById(R.id.menu);
	        menu.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(MainActivity.this, menu.class);
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
				intent.setClass(MainActivity.this, order.class);
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
				intent.setClass(MainActivity.this, account.class);
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
				intent.setClass(MainActivity.this, user.class);
				startActivity(intent);
				finish();
		        	}
	            });	      
        	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
