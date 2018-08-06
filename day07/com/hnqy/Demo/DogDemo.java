package com.hnqy.Demo; //package关键字 创建包

public class DogDemo {
	/**
	*package关键字创建包  
	*格式：
	*	package 包名.子包名.子子包名;
	*注意：
	*   package语句必须是程序的第一条可执行的代码
	*   package语句在一个java文件中只能有一个
	*   如果没有package，默认表示无包名
	*带包的类编译和运行
	* a:javac编译的时候带上-d即可
		* javac -d . HelloWorld.java
	* b:通过java命令执行。
	* * 不同包下类之间的访问需要到导报
	*导包格式
	* import 包名;
	* 注意：
	* 这种方式导入是到类的名称。
	* 虽然可以最后写*，但是不建议。
	*/
	public String name;
	
	public void cry(){
		System.out.println("旺旺旺");
	}
	
	
}
