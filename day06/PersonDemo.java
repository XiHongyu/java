/**
	定义类：
		[修饰符] class 类名{
			//属性   成员变量
			数据类型  属性名;
			//行为   成员方法
			[修饰符] 返回值类型 方法名(参数列表){
				方法体
				}
		}
	创建对象 实例化类：
	类名 对象名=new 类名();
	//对象属性赋值
	对象名.属性=value;
	//获取属性值
	数据类型  变量名=对象名.属性；
	//执行对象行为
	对象名.方法名();
*/
public class PersonDemo{
	//入口方法
	public static void main(String[]args){
		//创建人类对象
		Person p1=new Person();
		//为属性赋值  通过对象名.属性=value;
		p1.name="张三";
		p1.age=23;
		p1.sex="男";
		//获取属性的值   对象名.属性;
		System.out.println(p1.name+"..."+p1.age+"..."+p1.sex);
		//调用方法    对象名.方法名();
		p1.eat();
		
	}
}
//定义一个Person类
class Person{
	//构造方法
	public  Person(){
		System.out.println("我是构造方法");
	}
	//属性
	String name;  //姓名
	
	int age;         //年龄
	String sex;    //性别
	
	//方法
	public void eat(){     //吃饭
		System.out.println("我在吃饭");
	}
	public void sleep(){
		System.out.println("我在睡觉");
	}
}