/**
 * 
 * 
 * private   私有的  关键字
   private关键字特点：private是一个权限修饰符，可以修饰成员变量和成员方法， 被修饰的成员只能在本类中访问
         封装和private的应用：把成员变量用private修饰，提供对应的getXxx()和setXxx()方法
                      private只是封装的一种形式，不能说封装就是私有
 * 
 * */
//定义一个猫类
public class Cat {
	//属性用private修饰 其他类不能直接访问   对外提供setXxx() getXxx()方法
	private String variety;
	private String colour;
	//空参构造     
	public Cat() {
		super();
		
	}
	//有参构造
	public Cat(String variety, String colour) {
		super();
		this.variety = variety;
		this.colour = colour;
	}
	public String getVariety() {//获取品种
		return variety;
	}
	public void setVariety(String variety) {//设置品种
		this.variety = variety;
	}
	public String getColour() {//获取颜色
		return colour;
	}
	public void setColour(String colour) {//设置品种
		this.colour = colour;
	}
	
	public void cry(){
		System.out.println(colour+variety+"喵喵喵");
	}
	
	
	
	
}
