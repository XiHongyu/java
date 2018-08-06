 import com.hnqy.Demo.DogDemo;  //导包
public class Test01 {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int a=10;
		int b=20;
		int i = extracted(a, b);
		System.out.println(i);
	//创建狗类对象
	DogDemo d=new DogDemo();
	d.name="haha";
	d.cry();
	
	//创建猫类  通过有参构造给初始值
	Cat c1=new Cat("加菲猫","黄色");
	c1.cry();
	//创建猫类对象  通过set 方法设置初始值
	Cat c2=new Cat();
	c2.setVariety("流浪猫");
	c2.setColour("灰色");
	c2.cry();

	
	
	
	
	}

	
	
	
	private static int extracted(int a, int b) {
		return a+b;
	}
	
	
	
}
