
public class StaticDemo{
	public static void main(String[]args){
		/**
				static静态修饰符 用来修饰字段，方法，内部类
				static修饰的成员的特点：
					static修饰的成员属于类 随着类的加载而加载 优先于对象存在
					static修饰的成员不需要实例化对象，可以通过类名.调用
					static修饰的方法只能访问该类中static修饰的成员
					非静态的既可以访问静态的也可以访问非静态的
					static修饰的成员加载在内存的方法区，被该类的所有对象所共享
				static优缺点及使用场景：
					优点：节省内存空间不需要创建对象
					缺点：生命周期长
				如果类内某成员被共享时使用static修饰，及共性用静态，特性用非静态	
		*/
	
		
		//创建一个员工对象1     
			Staff s1=new Staff("产品经理");
			//s1.company="青云";
			s1.salary=8000;
			s1.name="张三";
			
		//创建一个员工对象2
			Staff s2=new Staff("部门经理");
			//s2.company="青云";
			s2.salary=6000;
			s2.name="李四";
			
		//所有员工属于同一个公司 公司名可用static修饰 用类名赋值
		Staff.company="青云";
		
		//查看员工信息
		s1.lookOver();
		s2.lookOver();
		s1.punchCard();  //静态方法可用对象名调用
		
		Staff.punchCard(); //也可以用类名调用 不需要创建对象
	}
}

//例：创建一个员工类
class Staff{
	//属性
	static String company;
	String duty;
	int salary;
	String name;
	//空参构造
	public Staff(){}
	//有参构造
	public Staff(String duty){
		this.duty=duty;
	}
	//非静态可以访问静态
	public void lookOver(){
		System.out.println(name +"..."+company+"..."+duty+"..."+salary);
	}
	
	public static void punchCard(){
		//System.out.println(name);  错误：无法从静态上下文引入非静态变量   静态不能访问非静态
		System.out.println("上班卡");
	}
	
	public void work(){
		System.out.println("敲代码");
	}
	
	
	
	
	
}