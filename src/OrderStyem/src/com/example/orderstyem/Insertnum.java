package com.example.orderstyem;
import java.util.List;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UpdateListener;
import android.R.integer;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Insertnum extends Activity{
	
	private EditText text;
	private TextView textView;
	private Integer desknumber;
	public  Button bt1;
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.desknumber);
		super.onCreate(savedInstanceState);
		Bmob.initialize(Insertnum.this, "7655abf8dececf9692d74784929e6705");  
		text=(EditText)findViewById(R.id.editText1);
		bt1=(Button)findViewById(R.id.button1);
		textView=(TextView)findViewById(R.id.tid);
		SharedPreferences sp16=getSharedPreferences("mrosoft", MODE_PRIVATE);
 		String username=sp16.getString("un", "mr");
 		final String id=sp16.getString("OID", "..");
 		textView.setText("您的ID为 "+id);
		bt1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				desknumber=Integer.parseInt(text.getText().toString());
				
				
				Userdata udata = new Userdata();
				udata.setdesknumber(desknumber);
			udata.update(id, new UpdateListener() {

				    @Override
				    public void done(BmobException e) {
				    	if(e==null){
				    		Toast.makeText(Insertnum.this, "添加桌号成功！", Toast.LENGTH_LONG).show();
				    		Toast.makeText(Insertnum.this, "您现在的桌号为"+desknumber, Toast.LENGTH_LONG).show();      
				    	
				    	}else{
				    		Toast.makeText(Insertnum.this, "修改失败！", Toast.LENGTH_LONG).show();
				        }
				    }  
				    
				});
				
				
				
				Intent intent=new Intent();
				intent.setClass(Insertnum.this,user.class);
				startActivity(intent);
				finish();
			        }
				
				
			        
	            });
		
		
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}


	