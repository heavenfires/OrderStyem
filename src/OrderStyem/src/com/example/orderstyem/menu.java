package com.example.orderstyem;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class menu extends Activity {
	public  Button order;
	public  Button account;
	public  Button user;
	private ListView lv;

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		super.onCreate(savedInstanceState);
		lv = (ListView) findViewById(R.id.lv);
		ArrayList<HashMap<String, Object>> list=new ArrayList<HashMap<String, Object>>(); 
		HashMap<String, Object>map1= new HashMap<String, Object>();
		HashMap<String, Object>map2= new HashMap<String, Object>();
		HashMap<String, Object>map3= new HashMap<String, Object>();
		HashMap<String, Object>map4= new HashMap<String, Object>();
		HashMap<String, Object>map5= new HashMap<String, Object>();
		HashMap<String, Object>map6= new HashMap<String, Object>();
		HashMap<String, Object>map7= new HashMap<String, Object>();
		HashMap<String, Object>map8= new HashMap<String, Object>();
		HashMap<String, Object>map9= new HashMap<String, Object>();
		HashMap<String, Object>map10= new HashMap<String, Object>();
		map1.put("img", R.drawable.c1);
		map1.put("menu_id", "c1");
		map1.put("menu_name", "∫Ï…’”„");
		map1.put("menu_price", "£§88");
		map2.put("img", R.drawable.c2);
		map2.put("menu_id", "c2");
		map2.put("menu_name", "Œ˜∫Ï ¡≥¥µ∞");
		map2.put("menu_price", "£§25");
		map3.put("img", R.drawable.c3);
		map3.put("menu_id", "c3");
		map3.put("menu_name", "Ã«¥◊≈≈π«");
		map3.put("menu_price", "£§76");
		map4.put("img", R.drawable.c4);
		map4.put("menu_id", "c4");
		map4.put("menu_name", "¬È∆≈∂π∏Ø");
		map4.put("menu_price", "£§40");
		map5.put("img", R.drawable.c5);
		map5.put("menu_id", "c5");
		map5.put("menu_name", "œ„πΩÏ¿º¶");
		map5.put("menu_price", "£§58");
		map6.put("img", R.drawable.c6);
		map6.put("menu_id", "c6");
		map6.put("menu_name", "”„œ„»‚Àø");
		map6.put("menu_price", "£§65");
		map7.put("img", R.drawable.c7);
		map7.put("menu_id", "c7");
		map7.put("menu_name", "≥¥ø’–ƒ≤À");
		map7.put("menu_price", "£§15");
		map8.put("img", R.drawable.c8);
		map8.put("menu_id", "c8");
		map8.put("menu_name", "”„Õ∑∂π∏ØÃ¿");
		map8.put("menu_price", "£§68");
		map9.put("img", R.drawable.c9);
		map9.put("menu_id", "c9");
		map9.put("menu_name", "√◊∑π(“ªÕÎ)");
		map9.put("menu_price", "£§8");
		map10.put("img", R.drawable.c10);
		map10.put("menu_id", "c10");
		map10.put("menu_name", "ÃÏµÿ“ª∫≈");
		map10.put("menu_price", "£§6");
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);
		list.add(map6);
		list.add(map7);
		list.add(map8);
		list.add(map9);
		list.add(map10);
		SimpleAdapter listAdapter=new SimpleAdapter(this,list,R.layout.menulist,new String[]{"img","menu_id","menu_name","menu_price"},new int[]{R.id.img,R.id.menu_id,R.id.menu_name,R.id.menu_price});
		lv.setAdapter(listAdapter);//Œ™ListView∞Û∂®  ≈‰∆˜ 
		
		
		
		
		        order=(Button)findViewById(R.id.order);
		        order.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent=new Intent();
					intent.setClass(menu.this,order.class);
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
					intent.setClass(menu.this, account.class);
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
					intent.setClass(menu.this, user.class);
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