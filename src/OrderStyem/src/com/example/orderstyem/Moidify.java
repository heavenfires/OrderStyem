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

public class Moidify extends Activity{
	TextView tv;
	EditText tv2;
	Button ok;
	String pass;
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.password);
		super.onCreate(savedInstanceState);
		Bmob.initialize(Moidify.this, "7655abf8dececf9692d74784929e6705");  
		tv=(TextView)findViewById(R.id.textView1);
		tv2=(EditText)findViewById(R.id.editTextmo);
 		SharedPreferences sp14=getSharedPreferences("mrosoft", MODE_PRIVATE);
 		String username=sp14.getString("un", "mr");
 		final String id=sp14.getString("OID", "..");
 		tv.setText("您的ID为 "+id);
 		ok=(Button)findViewById(R.id.ok2);
		ok.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				pass=tv2.getText().toString();
				Userdata udata = new Userdata();
				udata.setVpassword(pass);
			udata.update(id, new UpdateListener() {

				    @Override
				    public void done(BmobException e) {
				    	if(e==null){
				    		Toast.makeText(Moidify.this, "修改密码成功！", Toast.LENGTH_LONG).show();
				        }else{
				    		Toast.makeText(Moidify.this, "修改密码失败！", Toast.LENGTH_LONG).show();
				        }
				    }  
				    
				});
				
				
				
				Intent intent=new Intent();
				intent.setClass(Moidify.this,user.class);
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

