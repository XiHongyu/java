//测试类
public class ClassDemo{
	public static void main(String[]args){
		//创建一个猫对象
		Cat cat=new Cat();
		cat.colour="黄色";
		cat.var="加菲猫";
		System.out.println(cat.colour+"..."+cat.var);
		cat.cat();
		//创建个狗对象
		Dog dog=new Dog("雪碧","公狗");
		System.out.println(dog.name+"..."+dog.sex);
		dog.cry();
		
	}
}


//定义一个猫类
class Cat{
	//属性
	String colour;  //颜色
	String var;     //品种
	//方法
	public void cat(){
		System.out.println("爱吃鱼");
	}
	public void climb(){
		System.out.println("捉老鼠");
	}
}
//定义一个狗类
 class Dog{
	 //空参构造
	 public Dog(){ 
	 }
	 //有参构造
	 public Dog(String name,String sex){
		this.name=name;
		this.sex=sex;
	 }
	 //属性
	 String name;
	 String sex;
		//方法
 public void cat(){
		 System.out.println("啃骨头");
	 }
	 public void cry(){
		 System.out.println("汪汪汪");
	 }
}
//猪类
class Pig{
	//属性
	String var;
	String colour;
	//空参构造
	public Pig(){}
	//有参构造
	public Pig(String var,String colour){
		this.var=var;
		this.colour=colour;
	}
	
	//行为方法
	public void sleep(){
		System.out.println("一天睡20小时");
	}
}
//鱼类
class Fish{
	//属性
	String water;//生活水域
	int weight;//重量
	double price;//价格
	public void cook(){
		System.out.println("红烧了");
	}
	
}
//鸟类
class Bird{
	//属性
	String variety;//品种
	
	public void fly(){
		System.out.println("装飞机");
	}
}
//手机类
class Phone{
	String brand;
	double size;
	public void functioc(){
		System.out.println("");
	}
}
//电脑类
class Computer{
	String brand;
	double size;
	public void functioc(){
		System.out.println("");
	}
}
//电视类
class TV{
	String brand;
	double size;
	public void functioc(){
		System.out.println("");
	}
}
//冰箱类
class Refrigerator{
	String brand;
	double size;
	public void functioc(){
		System.out.println("");
	}
}
//空调类
class Conditioner{
	String brand;
	double size;
	public void functioc(){
		System.out.println("");
	}
}






