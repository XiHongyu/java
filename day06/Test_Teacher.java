class Test_Teacher{
	public static void main(String[]args){
		MathTeacher mt=new MathTeacher("张三",25);
		mt.teach();
	}
}
//抽象一个老师类
abstract class Teacher {
	//属性
	private String name;
	private int age;
	//空参构造
	public Teacher(){}
	//有参构造
	public Teacher(String name,int age){
		this.name=name;
		this.age=age;
	}
	//设置姓名 年龄
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	//获取姓名 年龄
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	//老师都有的行为上课
	public abstract void teach();
	
}
//数学老师类
class MathTeacher extends Teacher{
	//空参构造
	public MathTeacher(){}
	//有参构造
	public MathTeacher(String name,int age){
		super(name,age);
	}
	public void teach(){
		System.out.println("我是数学老师，我叫"+this.getName()+"我的年龄"+this.getAge());
	}
}
//语文老师
class LanguageTeacher extends Teacher{
	//空参构造
	public MathTeacher(){}
	//有参构造
	public MathTeacher(String name,int age){
		super(name,age);
	}
	public void teach(){
		System.out.println("我是语文老师，我叫"+this.getName()+"我的年龄"+this.getAge());
	}
}