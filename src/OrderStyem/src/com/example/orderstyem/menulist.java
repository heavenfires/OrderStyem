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

	public class menulist extends Activity{
		
		public  Button order;
		public  Button account;
		public  Button user;
		public  Button btns2;
		public  Button view2;
		public  Button add1_6;
		public  Button add1_7;
		public  Button add1_8;
		public  Button add1_9;
		public  Button add1_10;
		SharedPreferences preferences5;
	    SharedPreferences.Editor editor5;
	    SharedPreferences preferences6;
	    SharedPreferences.Editor editor6;
	    SharedPreferences preferences7;
	    SharedPreferences.Editor editor7;
	    SharedPreferences preferences8;
	    SharedPreferences.Editor editor8;
	    SharedPreferences preferences9;
	    SharedPreferences.Editor editor9;
	    public TextView text1_6;
	    public TextView text1_7;
	    public TextView text1_8;
	    public TextView text1_9;
	    public TextView text1_10;
	    public  Button delete6;
	    public  Button delete7;
	    public  Button delete8;
	    public  Button delete9;
	    public  Button delete10;
	    		 
			protected void onCreate(Bundle savedInstanceState){
				super.onCreate(savedInstanceState);
				setContentView(R.layout.menulist);
			
				btns2=(Button)findViewById(R.id.btns2);
				btns2.setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent intent=new Intent();
						intent.setClass(menulist.this,menu.class);
						startActivity(intent);
						finish();
					        }
			           });
				
				view2=(Button)findViewById(R.id.view2);
				view2.setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent intent=new Intent();
						intent.setClass(menulist.this,order.class);
						startActivity(intent);
						finish();
					        }
			           });
								
				    text1_6=(TextView) findViewById (R.id.text1_6);
					add1_6=(Button)findViewById(R.id.add1_6);
				    preferences5 = getSharedPreferences("menulist6", MODE_PRIVATE);
			        editor5 = preferences5.edit();
					add1_6.setOnClickListener(new OnClickListener(){
						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
					        editor5.putString("C6",text1_6.getText().toString()) ;
			                //提交数据
			                editor5.commit(); 		   				
					Toast.makeText(menulist.this, "加入菜单车成功！", Toast.LENGTH_SHORT).show(); 
						        }
				           });
					
					    text1_7=(TextView) findViewById (R.id.text1_7);
						add1_7=(Button)findViewById(R.id.add1_7);
					    preferences6 = getSharedPreferences("menulist7", MODE_PRIVATE);
				        editor6 = preferences6.edit();
						add1_7.setOnClickListener(new OnClickListener(){
							@Override
							public void onClick(View arg0) {
								// TODO Auto-generated method stub
						        editor6.putString("C7",text1_7.getText().toString()) ;
				                //提交数据
				                editor6.commit(); 			
					Toast.makeText(menulist.this, "加入菜单车成功！", Toast.LENGTH_SHORT).show(); 
							        }
					           });
						
						    text1_8=(TextView) findViewById (R.id.text1_8);
							add1_8=(Button)findViewById(R.id.add1_8);
						    preferences7 = getSharedPreferences("menulist8", MODE_PRIVATE);
					        editor7 = preferences7.edit();
							add1_8.setOnClickListener(new OnClickListener(){
								@Override
								public void onClick(View arg0) {
									// TODO Auto-generated method stub
							        editor7.putString("C8",text1_8.getText().toString()) ;
					                //提交数据
					                editor7.commit();  				
					 Toast.makeText(menulist.this, "加入菜单车成功！", Toast.LENGTH_SHORT).show(); 
								        }
						           });
							
							    text1_9=(TextView) findViewById (R.id.text1_9);
								add1_9=(Button)findViewById(R.id.add1_9);
							    preferences8 = getSharedPreferences("menulist9", MODE_PRIVATE);
						        editor8 = preferences8.edit();
								add1_9.setOnClickListener(new OnClickListener(){
									@Override
									public void onClick(View arg0) {
										// TODO Auto-generated method stub
								        editor8.putString("C9",text1_9.getText().toString()) ;
						                //提交数据
						                editor8.commit(); 		
				   	 Toast.makeText(menulist.this, "加入菜单车成功！", Toast.LENGTH_SHORT).show(); 
									        }
							           });
								
						      text1_10=(TextView) findViewById (R.id.text1_10);
							  add1_10=(Button)findViewById(R.id.add1_10);
							  preferences9 = getSharedPreferences("menulist10", MODE_PRIVATE);
							  editor9 = preferences9.edit();
							  add1_10.setOnClickListener(new OnClickListener(){
										@Override
										public void onClick(View arg0) {
											// TODO Auto-generated method stub
								 editor9.putString("C10",text1_10.getText().toString()) ;
							     //提交数据
							     editor9.commit(); 
                      Toast.makeText(menulist.this, "加入菜单车成功！", Toast.LENGTH_SHORT).show(); 
										        }
								           });			
			
	        delete6=(Button)findViewById(R.id.delete6);
		    delete6.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				SharedPreferences sp5 = getSharedPreferences("menulist6", MODE_PRIVATE);
				Editor editor5 = sp5.edit();  
				editor5.clear();  
				editor5.commit();
				Toast.makeText(menulist.this, "移出菜单车成功！", Toast.LENGTH_SHORT).show();
				}
	           });
		    
		    delete7=(Button)findViewById(R.id.delete7);
		    delete7.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				SharedPreferences sp6 = getSharedPreferences("menulist7", MODE_PRIVATE);
				Editor editor6 = sp6.edit();  
				editor6.clear();  
				editor6.commit();
				Toast.makeText(menulist.this, "移出菜单车成功！", Toast.LENGTH_SHORT).show();
				}
	           });
		
		    delete8=(Button)findViewById(R.id.delete8);
		    delete8.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				SharedPreferences sp7 = getSharedPreferences("menulist8", MODE_PRIVATE);
				Editor editor7 = sp7.edit();  
				editor7.clear();  
				editor7.commit();
				Toast.makeText(menulist.this, "移出菜单车成功！", Toast.LENGTH_SHORT).show();
				}
	           });
		
		    delete9=(Button)findViewById(R.id.delete9);
		    delete9.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				SharedPreferences sp8 = getSharedPreferences("menulist9", MODE_PRIVATE);
				Editor editor8 = sp8.edit();  
				editor8.clear();  
				editor8.commit();
				Toast.makeText(menulist.this, "移出菜单车成功！", Toast.LENGTH_SHORT).show();
				}
	           });
		
		    delete10=(Button)findViewById(R.id.delete10);
		    delete10.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				SharedPreferences sp9 = getSharedPreferences("menulist10", MODE_PRIVATE);
				Editor editor9 = sp9.edit();  
				editor9.clear();  
				editor9.commit();
				Toast.makeText(menulist.this, "移出菜单车成功！", Toast.LENGTH_SHORT).show();
				}
	           });
		    			
			   order=(Button)findViewById(R.id.order);
		       order.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent=new Intent();
					intent.setClass(menulist.this,order.class);
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
				intent.setClass(menulist.this, account.class);
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
				intent.setClass(menulist.this, user.class);
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
					      

