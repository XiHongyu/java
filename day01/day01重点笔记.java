1.HelloWorld程序
	/*
	HelloWorld案例.是今天的第一个程序.
	也是我们java的入口程序.
	要求把它写熟悉了.最好是默写下来.
	*/
	public class HelloWorld {
		public static void main(String[] args) {
			System.out.println("HelloWorld");
		}
	}
	
2.常量
	/*
		常量：在程序执行的过程中，其值不可以发生改变的量
		
		常量分类：
			A:字符串常量	"HelloWorld"
			B:整数常量		12,-23
			C:小数常量		12.34
			D:字符常量		'a','0'
			E:布尔常量		true,false
			F:空常量		null(后面讲解)
	*/
	
	6666练习 ******打印出不同类型的常量.*******
	
3.数据类型
	/*
		数据类型：Java是一种强类型语言，针对每一种数据都给出了明确的数据类型
		
		数据类型分类：
			A:基本数据类型
			B:引用数据类型(类,接口,数组)
			
		基本数据类型：4类8种
			A:整数		占用字节数
				byte	1
				short	2
				int	4
				long	8	
			B:浮点数
				float	4
				double	8
			C:字符
				char	2
			D:布尔
				boolean	1
				
		注意：
			A:整数默认是int类型,浮点数默认是double
			B:定义long类型数据的时候，要加L或者l，建议加L
			  定义float类型数据的时候，要加F或者f，建议加F
			C:字符
				Java中的字符采用的是unicode编码，每一个字符占用两个字节，就可以存储一个汉字
			D:boolean类型适用于逻辑运算,一般用于流程控制
	*/
	
	
	
4.变量:
	/*
		变量：在程序执行的过程中，其值是可以在一定范围内发生改变的.
		
		变量的定义格式：
			数据类型 变量名 = 初始化值;
			
		基本数据类型：
			byte,short,int,long,float,double,char,boolean
			
		注意：
			整数默认是int类型，定义long类型的数据时，要在数据后面加L。
			浮点数默认是double类型，定义float类型的数据时，要在数据后面加F。
	*/
	
	/*	
	变量定义注意事项：
		1:变量未赋值,不能直接使用
		2:变量只在它所属的范围内有效
			变量属于它所在的那对大括号
		3:一行上可以定义多个变量,但是不建议
	*/
	
	
	
5.标示符

	/*
		标识符：就是给包,类,方法,变量起名字的符号。
		
		组成规则：!!! 必须记住!!!
			A:unicode字符
				数字字符,英文大小写,汉字(不建议使用汉字)
			B:下划线_
			C:美元符$
			
		注意事项
			A:不能以数字开头
			B:不能是java中的关键字
			
		常见命名规则：(了解,知道就行,不用要求死记硬背)
			A:基本要求
				见名知意
			B:常见的命名
				a:包(其实就是文件夹,用于对类进行管理)
					全部小写,多级包用.隔开
					举例：com，com.itheima
				b:类
					一个单词首字母大写
						举例：Student,Car
					多个单词每个单词的首字母大写
						举例：HelloWorld
				c:方法和变量
					一个单词首字母小写
						举例：age,show()
					多个单词从第二个单词开始每个单词的首字母大写
						举例：maxAge,getAge()
	*/
	
6.关键字(了解,知道就行,不用要求死记硬背)
	/*
	关键字：被Java语言赋予特定含义的单词
	
	特点：
		A:组成关键字的字母全部小写
		B:常见的代码编辑器,针对关键字有特殊的颜色标记
	*/
	
7.注释
	
		#注释：用于解释说明程序的文字
		
		分类：
			单行   /**/
			多行   //
			
		作用：解释说明程序，提高程序的阅读性

8.类型转换
	/*
		+:是一个运算符，做加法运算的。
		我们在做运算的时候，一般要求参与运算的数据类型必须一致。
		
		类型转换：
			隐式转换
			强制转换
			
		隐式转换	
			byte,short,char -- int -- long -- float -- double
	*/
	
	//隐士转换:
		public class TypeCastDemo1 {
			public static void main(String[] args) {
				//定义一个byte类型,定义一个int类型
				byte bb = 2;
				int cc = 5;
				System.out.println(bb + cc);
			}
		}
	
	/*
	强制转换：
		目标类型 变量名 = (目标类型) (被转换的数据);
		不建议强制转换，因为会有精度的损失。
	*/
	public class TypeCastDemo2 {
		public static void main(String[] args) {
			int a = 3;
			byte b = 4;
			int c = a + b;
			//byte d = a + b;
			byte d = (byte) (a + b);
		}
	}
