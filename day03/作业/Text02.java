 //2.方法重载求图形面积和周长
 public class Text02{
	 public static void main(String[]args){
		System.out.println("三角形面积"+area(6,8,10));
		System.out.println("矩形面积"+area(6,8));
		System.out.println("圆面积"+area(6));
		System.out.println("三角形周长"+perimeter(6,8,10));
		System.out.println("矩形周长"+perimeter(6,8));
		System.out.println("圆周长"+perimeter(6));
	 }
	 
	//面积 area  周长 perimeter
	//三角形面积
	public static double area(int a,int b,int c){
		double s=(a+b+c)/2.0;
		double d=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return d;
	}
	//矩形面积
	public static int area(int a,int b){
		return a*b;
	}
	//圆面积
	public static double area(int r){
		return r*r*3.14;
	}
	
	public static int perimeter(int a,int b,int c){
		return a+b+c;
	}
	public static int perimeter(int a,int b){
		return 2*(a+b);
	}
	public static double perimeter(int r){
		return 2*r*3.14;
	}
 }