package com.example.orderstyem;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class user extends Activity {
	public  Button menu,change,insert;
	public  Button order;
	public  Button account;
     public Button re;//ע����¼
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.user);
		super.onCreate(savedInstanceState);
		change=(Button)findViewById(R.id.modifypassword);
		change.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					Intent intent=new Intent();
					intent.setClass(user.this,Moidify.class);
					startActivity(intent);
					finish();
				        }
		            });
	insert=(Button)findViewById(R.id.Desknumber);
		insert.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					Intent intent=new Intent();
					intent.setClass(user.this,Insertnum.class);
					startActivity(intent);
					finish();
				        }
		            });
		    menu=(Button)findViewById(R.id.menu);
	        menu.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(user.this,menu.class);
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
				intent.setClass(user.this,order.class);
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
				intent.setClass(user.this, account.class);
				startActivity(intent);
				finish();
			        }
       	        });
	        
	        
	        
	        
	        re=(Button)findViewById(R.id.buttonreturn);
	        re.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					 AlertDialog.Builder dialog = new AlertDialog.Builder(user.this);
					 dialog.setTitle("ϵͳ��ʾ");
				        dialog.setMessage("��ȷ��Ҫ�˳�ϵͳô?");
				        dialog.setCancelable(false);
				        dialog.setPositiveButton("ȷ��",
				                new DialogInterface.OnClickListener() {
				                    @Override
				                    public void onClick(DialogInterface dialog, int which) {
				                    	Intent intent=new Intent();
				        				intent.setClass(user.this, Login.class);
				        				startActivity(intent);
				        				finish();
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

