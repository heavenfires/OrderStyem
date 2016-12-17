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
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
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
	public    String username,password,ww,id;
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
		Toast.makeText(Login.this, "����û���˺ţ��������˺����벢���ע�ᰴť��", Toast.LENGTH_LONG).show();
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
				       s.setdesknumber(0);
				       s.save(new SaveListener<String>() {
							@Override
							public void done(String objectId, BmobException arg1) {
								// TODO Auto-generated method stub
					 Toast.makeText(Login.this, "ע��ɹ���", Toast.LENGTH_LONG).show();
							id=objectId;//��ȡ��ǰID�Ա��޸�
							
							}
				        });
				       SharedPreferences sp12=getSharedPreferences("mrosoft",MODE_PRIVATE);
						Editor editor=sp12.edit();
					
			            	editor.putString("un",username);
			            	editor.putString("pw",password);
			            	editor.putString("OID",id);
			            	editor.commit();
				       Intent intent = new Intent(Login.this,
								MainActivity.class);
					//	Bundle bundle = new Bundle();
						Log.i("test", "1111111");
						//bundle.putString("userName", t1.getText().toString());
					//	bundle.putString("psw", t2.getText().toString());
						Log.i("test", "22222");
					//	intent.putExtras(bundle);
				    	startActivityForResult(intent, CODE);
						Toast.makeText(Login.this, "ע��ɹ� ��", Toast.LENGTH_LONG).show();		      
				}		
				else{Toast.makeText(Login.this, "�û����������벻��Ϊ�գ�", Toast.LENGTH_LONG).show();}  
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
					//��ѯUSer���˺��Ƿ����
					query.addWhereEqualTo("username", t1.getText().toString());
					//����50�����ݣ����������������䣬Ĭ�Ϸ���10������
					query.setLimit(10);
					//ִ�в�ѯ����
					query.findObjects(new FindListener<Userdata>() {
					    @Override
					    public void done(List<Userdata> object, BmobException e) {
					        if(e==null){				        	
					            for (Userdata u : object) {
					               //������ֵ���Ϣ
					               u.getusername();
					               checkname=u.getusername();			               
					               //������ݵ�objectId��Ϣ
					              u.getObjectId();
					               //���createdAt���ݴ���ʱ�䣨ע���ǣ�createdAt������createAt��
					            u.getCreatedAt();              
					            }
					            if(checkname==null){
					      Toast.makeText(Login.this, "�û��������ڣ���ע�� ��", Toast.LENGTH_LONG).show();					             
					               }
					  					            	
					            else{ 	
					            	BmobQuery<Userdata> query1 = new BmobQuery<Userdata>();
									query1.addWhereEqualTo("password", t2.getText().toString());
									query1.setLimit(10);    					
									//����10�����ݣ����������������䣬Ĭ�Ϸ���10������							
									//ִ�в�ѯ����
									query1.findObjects(new FindListener<Userdata>() {
									    @Override
					             public void done(List<Userdata> object, BmobException x) {
									        if(x==null){      	
									            for (Userdata d : object) {
									               //������ֵ���Ϣ
									              d.getpassword();
									               checkpassword=d.getpassword(); 
									               //������ݵ�objectId��Ϣ
									         id=d.getObjectId();
									           //���createdAt���ݴ���ʱ�䣨ע���ǣ�createdAt������createAt��
									           d.getCreatedAt();
									            }
									            if(password.equals(checkpassword)==false){	
						 Toast.makeText(Login.this, "������� ��", Toast.LENGTH_LONG).show();	
								            		flag=0;   		
				            	} 
									            else{SharedPreferences sp10=getSharedPreferences("mrosoft",MODE_PRIVATE);
												Editor editor=sp10.edit();
									            	editor.putString("un",username);
									            	editor.putString("pw",password);
									            	editor.putString("OID",id);
									            	editor.commit();
									            	Intent intent = new Intent(Login.this,
														MainActivity.class);
											//	Bundle bundle = new Bundle();
												Log.i("test", "1111111");
									    //	bundle.putString("userName", t1.getText().toString());
										//		bundle.putString("psw", t2.getText().toString());
												Log.i("test", "22222");
										//		intent.putExtras(bundle);
												startActivityForResult(intent, CODE);
								Toast.makeText(Login.this, "��¼�ɹ���", Toast.LENGTH_LONG).show();}
									            }
									            }
									        });
					            }
					        }		        
					        else{
					            Log.i("bmob","���������룺"+e.getMessage()+","+e.getErrorCode());
					        }        
					    }
					});		
				}else {Toast.makeText(Login.this, "�û����������벻��Ϊ�գ�", Toast.LENGTH_LONG).show();}			
							}
				        });
		 
		    exitbtn=(Button)findViewById(R.id.exit);
	        exitbtn.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 AlertDialog.Builder dialog = new AlertDialog.Builder(Login.this);
				 dialog.setTitle("Warning!");
			        dialog.setMessage("ȷ���˳���ǰҳ����?");
			        dialog.setCancelable(false);
			        dialog.setPositiveButton("ȷ��",
			                new DialogInterface.OnClickListener() {
			                    @Override
			                    public void onClick(DialogInterface dialog, int which) {
			                        finish();  // �ر�App
			                    }
			                });

			                dialog.setNegativeButton("��,ȡ��",
			                new DialogInterface.OnClickListener() {
			                    @Override
			                    public void onClick(DialogInterface dialog, int which) {
			                        // ����ʲôҲ��д��Ҳ�ܴﵽ�رնԻ����Ŀ�ģ���֪���ϲ�����
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
