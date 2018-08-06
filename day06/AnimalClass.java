public class AnimalClass{
	//入口方法
	public static void main(String[]args){
		Cat c=new Cat();
		c.colour="花";
		c.legs=4;
		System.out.println(c.colour+"...."+c.legs);
		c.cry();
		
		Dog d=new Dog();
		d.colour="黑";
		d.legs=4;
		System.out.println(d.colour+"...."+d.legs);
		d.cry();
	}
}
//创建一个动物类
class Animal{
	//属性
	int legs;   
	String colour;
	//行为
	public void cry(){
		System.out.println("叫");
	}
	public void eat(){
		System.out.println("吃");
	}
}
//猫类继承动物类的属性
class Cat extends Animal{
	//重写父类方法
	public void cry(){
		System.out.println("喵喵喵");
	}
	public void eat(){
		System.out.println("猫吃鱼");
	}
	//猫特有的方法
	public void catchMouse(){
		System.out.println("抓老鼠");
	}
}
//狗类继承动物类的属性
class Dog extends Animal{
	//重写父类方法
	public void cry(){
		System.out.println("汪汪汪");
	}
	public void eat(){
		System.out.println("狗吃肉");
	}
	//狗特有的方法
	public void lookHome(){
		System.out.println("看家");
	}
}