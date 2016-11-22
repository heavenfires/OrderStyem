#云端模拟服务器
##在这里介绍我们上传与我们云端模拟服务器通信的过程
* 上次我们已经说了关于环境的构建,而运行的时候会出现下面问题:<br>
![image](https://github.com/heavenfires/OrderStyem/raw/master/docs/yyimage/iii.png)<br>
* 这是因为没有把SDK的.so文件导入到项目LIB文件里<br>
* 我们需要将我们BMOB的SDK的so文件脱到我们项目的LIB<br>
* .so文件用来以适应支持的不同的处理器<br>

##我们接下来用上传数据的方法来检查是否我们可以与云端通讯
###首先建立一个类进行数据分装，在这里需要建一个bean类，来封装我们的对象属性
* 就像这样：<br>
![image](https://github.com/heavenfires/OrderStyem/raw/master/docs/yyimage/jjj.png)<br>

###用一个按钮监听来提交我们的数据，这个按钮最后将不会出现在主界面UI上，也不会上传到github，以防他人乱改我们的数据库，这只是供我们开发过程测
	data=(Button)findViewById(R.id.buttontext);<br>
	data.setOnClickListener(new OnClickListener(){<br>
	public void onClick(View arg0) {<br>
	Vdata p2 = new Vdata();<br>
	p2.setVname("");<br>
	p2.setVprice();<br>
	p2.save(new SaveListener<String>() {<br>

	@Override<br>
	public void done(String arg0, BmobException arg1) {<br>
	Toast.makeText(getApplicationContext(), "上传成功",Toast.LENGTH_SHORT).show();<br>
		}});<br>
	}<br>
});<br>

###运行程序，如果上传成功，便会有以下界面
![image](https://github.com/heavenfires/OrderStyem/raw/master/docs/yyimage/kkk.png)<br>

###通过云端查看,如下图：
![image](https://github.com/heavenfires/OrderStyem/raw/master/docs/yyimage/lll.png)<br>
* 通过对云端的查看，说明我们已经成功将数据上传到云端。



