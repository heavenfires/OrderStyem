package com.example.orderstyem;



import java.util.List;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SaveListener;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends Activity {
	public  Button menu;
	public  Button account;
	public  Button user,ok,login1;
	public    String username,password,ww;
	public EditText t1,t2;
	//public TextView textView;
	public String checkname;
	final public int CODE = 0x1717;
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		super.onCreate(savedInstanceState);
		Bmob.initialize(Login.this, "7655abf8dececf9692d74784929e6705");  
		Toast.makeText(Login.this, "若您没有账号，请输入账号密码并点击注册按钮！", Toast.LENGTH_LONG).show();
		t1=(EditText)findViewById(R.id.username);
t2=(EditText)findViewById(R.id.password);
		username=t1.getText().toString();
	password=t2.getText().toString();
	login1=(Button)findViewById(R.id.res);
	//textView=(TextView)findViewById(R.id.textView1);
		  ok=(Button)findViewById(R.id.login_btn);
		 ok.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View arg0) {
					username=t1.getText().toString();
					password=t2.getText().toString();
					Userdata s = new Userdata();
				       s.setVusername(username);
				       s.setVpassword(password);
				       s.save(new SaveListener<String>() {

							@Override
							public void done(String arg0, BmobException arg1) {
								// TODO Auto-generated method stub
								Toast.makeText(Login.this, "注册成功！", Toast.LENGTH_LONG).show();
							}
				        });
				       Intent intent = new Intent(Login.this,
								MainActivity.class);
						Bundle bundle = new Bundle();
						Log.i("test", "1111111");
						bundle.putString("userName", t1.getText().toString());
						bundle.putString("psw", t2.getText().toString());
						Log.i("test", "22222");
						intent.putExtras(bundle);
						
						
						
						
						startActivityForResult(intent, CODE);
				       
				      
				}		
				
		 
				       
		     	});
			  
		 login1.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View arg0) {
					username=t1.getText().toString();
					password=t2.getText().toString();
					BmobQuery<Userdata> query = new BmobQuery<Userdata>();
					//查询USer的账号是否存在
					query.addWhereEqualTo("username", t1.getText().toString());
					//返回50条数据，如果不加上这条语句，默认返回10条数据
					query.setLimit(10);
					//执行查询方法
					query.findObjects(new FindListener<Userdata>() {
					    @Override
					    public void done(List<Userdata> object, BmobException e) {
					        if(e==null){
					        	
					        	
					        	
					            for (Userdata u : object) {
					               //获得名字的信息
					               u.getusername();
					               checkname=u.getusername();
					               
					               //获得数据的objectId信息
					              u.getObjectId();
					               //获得createdAt数据创建时间（注意是：createdAt，不是createAt）
					            u.getCreatedAt();
					  
					               
					            }
					            if(checkname==null){
					            	   Toast.makeText(Login.this, "用户名不存在，请注册 ！", Toast.LENGTH_LONG).show();
					            	   
					               }
					            else{ Intent intent = new Intent(Login.this,
										MainActivity.class);
					    	 
								Bundle bundle = new Bundle();
								Log.i("test", "1111111");
								bundle.putString("userName", t1.getText().toString());
								bundle.putString("psw", t2.getText().toString());
								Log.i("test", "22222");
								intent.putExtras(bundle);
								
								
								
								
								startActivityForResult(intent, CODE);  	}
					        }else{
					            Log.i("bmob","请重新输入："+e.getMessage()+","+e.getErrorCode());
					        }
					       
					        
					        
					        
					    }
					});
					
					
					
			
					
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
