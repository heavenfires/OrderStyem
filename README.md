#OrderStyem项目的说明
###OrderStyem项目：
* 主要是用户查看完菜单后可以根据个人喜好和菜单进行点餐，然后根据用户点餐可以进行结算，跟传统的做法相比减少了人力等资源。<br>
  
###OrderStyem项目主要完成的功能：
* 首次使用的用户需要注册，然后登陆；<br>
* 进入主界面，可以预览菜单；<br>
* 然后根据个人喜好和菜单进行点餐；<br>
* 最后根据用户点餐可以进行结算；<br>
* 可以退出OrderStyem系统。<br>
  
#OrderStyem项目的部署
##开发环境
* JDK1.7+<br>
* Java ADT<br>
* Android Stuido<br>
* bmob后端sdk<br>

##安装
* JDK1.7+<br>
* Java ADT<br>
* Android Stuido<br>

##安装与配置教程
###JDK安装配置教程：详情请参考
  http://jingyan.baidu.com/article/bea41d435bc695b4c41be648.html<br>

###Java ADT安装配置
* 首先到Eclipse官方网站下载最新的Eclipse IDE for Java EE Developers<br>
* 下载好Eclipse的Zip压缩文件，该程序无需安装或配置，解压就可以使用了<br>
 
###Android Stuido安装配置教程：详情请参考
 http://www.2cto.com/kf/201604/500642.html<br>

###在线数据库的构建
* 因为我们的订餐系统是由一个共享的、对外开放的软件，所以我们需要为APP订造一个在线的服务器环境或者云端环境。<br>
* 在这里我们介绍我们小组的在线云端数据库的构建。<br>
* 用远程云端BMOB来代替建立远程服务器的方法。<br>

####首先注册云端账号
* 最重要的是！！在进入账号的界面中新建一个系统APP工程，并获取ID<br><br>
![image](https://github.com/heavenfires/OrderStyem/raw/master/docs/yyimage/qq.png)<br>

####其次要在BMOB云端网址下载SDK包
#####选择安卓版本 
![image](https://github.com/heavenfires/OrderStyem/raw/master/docs/yyimage/rr.png)<br>

#####导入SDK包
* 首先将下载的SDK包拖入LIB目录下，然后再项目工程中右键Properties，选择ADD jARS. <br><br>
 ![image](https://github.com/heavenfires/OrderStyem/raw/master/docs/yyimage/ss.png)<br>
 
* 将工程中的BMOB的JARS导入进去即可，在这里我们的远程云端构建完毕。<br><br>
![image](https://github.com/heavenfires/OrderStyem/raw/master/docs/yyimage/tt.png)<br>

##以Java ADT为例部署项目
###建立模拟器

* 点击->Window->Android Virtual Device Manager<br><br>
 ![image](https://github.com/heavenfires/OrderStyem/raw/master/docs/yyimage/aa.png)<br>
 
* 点击->Android Virtual Device Manager->Device Definitions->Create New Android Virtual Device（AVD）->OK<br><br>
 ![image](https://github.com/heavenfires/OrderStyem/raw/master/docs/yyimage/bb.png)<br>
 
* 点击->Android Virtual Device Manager->Android Virtual Device->Start->Launch<br><br>
 ![image](https://github.com/heavenfires/OrderStyem/raw/master/docs/yyimage/cc.png)<br>
 
####模拟器已建好
 ![image](https://github.com/heavenfires/OrderStyem/raw/master/docs/yyimage/dd.png)<br>
 
###导入项目
* 点击->File->Import<br><br>
 ![image](https://github.com/heavenfires/OrderStyem/raw/master/docs/yyimage/ee.png)<br>
 
* 点击->Existing Projects into Workspace->Next<br><br>
 ![image](https://github.com/heavenfires/OrderStyem/raw/master/docs/yyimage/ff.png)<br>
 
* 如果要把项目复制到工作空间则选中Copy projects into workspace<br>
* 点击->Browse->Finish（预览要导入的项目）<br><br>
 ![image](https://github.com/heavenfires/OrderStyem/raw/master/docs/yyimage/gg.png)<br>
 
###运行项目
* 选择App<br>
* 右键-> Run As->Android Application<br><br>
 ![image](https://github.com/heavenfires/OrderStyem/raw/master/docs/yyimage/hh.png)<br>
