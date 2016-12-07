package com.example.orderstyem;



import java.util.List;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SaveListener;
import android.R.integer;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
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
	public  Button account,exitbtn;
	public  Button user,ok,login1;
	public    String username,password,ww;
	public EditText t1,t2;
	public TextView textView;
	public int flag=1;
	public String checkname,checkpassword;
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
	textView=(TextView)findViewById(R.id.textView1);
		  ok=(Button)findViewById(R.id.login_btn);
		 ok.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View arg0) {
					username=t1.getText().toString();
					password=t2.getText().toString();
					if(username.equals("")==false && password.equals("")==false)
					{
						
						
						
				
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
						Toast.makeText(Login.this, "注册成功 ！", Toast.LENGTH_LONG).show();
				      
				}		
					else{		Toast.makeText(Login.this, "用户名或者密码不能为空！", Toast.LENGTH_LONG).show();}  
				}
				    
		     	});
			  
		 login1.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View arg0) {
					username=t1.getText().toString();
					password=t2.getText().toString();
					if(!username.equals("") && !password.equals(""))
					{
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
					       
								
					            
					          
					        
					            
					            	
					            else{ 	
					            	BmobQuery<Userdata> query1 = new BmobQuery<Userdata>();
								
									query1.addWhereEqualTo("password", t2.getText().toString());
									
									query1.setLimit(10);    	
					            	
									
									//返回10条数据，如果不加上这条语句，默认返回10条数据
									
									//执行查询方法
									query1.findObjects(new FindListener<Userdata>() {
									    @Override
									    public void done(List<Userdata> object, BmobException x) {
									        if(x==null){
									        	
									        	
									        	
									            for (Userdata d : object) {
									               //获得名字的信息
									              d.getpassword();
									               checkpassword=d.getpassword();
									               
									               //获得数据的objectId信息
									             d.getObjectId();
									               //获得createdAt数据创建时间（注意是：createdAt，不是createAt）
									           d.getCreatedAt();
									            }
									            if(password.equals(checkpassword)==false){
								            		
								            		 Toast.makeText(Login.this, "密码错误 ！", Toast.LENGTH_LONG).show();	
								            		flag=0;
								            		
								            		
								            		
								            		
								            	} 
									            
									            else{Intent intent = new Intent(Login.this,
														MainActivity.class);
												Bundle bundle = new Bundle();
												Log.i("test", "1111111");
												bundle.putString("userName", t1.getText().toString());
												bundle.putString("psw", t2.getText().toString());
												Log.i("test", "22222");
												intent.putExtras(bundle);
												
												
												
												
												startActivityForResult(intent, CODE);
												Toast.makeText(Login.this, "登录成功！", Toast.LENGTH_LONG).show();}
									            }
									            }
									        });
								
									 
					            	
					            }
					        }
					        
					        
					        else{
					            Log.i("bmob","请重新输入："+e.getMessage()+","+e.getErrorCode());
					        }
					       
					        
					        
					        
					    }
					});
					
					
					
					}else {Toast.makeText(Login.this, "用户名或者密码不能为空！", Toast.LENGTH_LONG).show();}
					
							}
				        });
		 exitbtn=(Button)findViewById(R.id.exit);
	        exitbtn.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 AlertDialog.Builder dialog = new AlertDialog.Builder(Login.this);
				 dialog.setTitle("Warning!");
			        dialog.setMessage("确定要退出吗?");
			        dialog.setCancelable(false);
			        dialog.setPositiveButton("确定",
			                new DialogInterface.OnClickListener() {
			                    @Override
			                    public void onClick(DialogInterface dialog, int which) {
			                        finish();  // 关闭App
			                    }
			                });

			        dialog.setNegativeButton("不不不不",
			                new DialogInterface.OnClickListener() {
			                    @Override
			                    public void onClick(DialogInterface dialog, int which) {
			                        // 这里什么也不写，也能达到关闭对话框的目的，不知道合不合适
			                    }
			                });
			        dialog.show();
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
