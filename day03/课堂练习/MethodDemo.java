public class MethodDemo{
	public static void main(String[]args){
		
		/**
			1.定义方法输出图形
			2.定义方法求n——m间的素数
			3利用递归求1到n的和     求n的阶乘
		*/
		double triangle=area(3,4,5);
		System.out.println(triangle);
	}
	
	//求三角形面积
	public static double area(int a,int b,int c){
		double s=(a+b+c)/2.0;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
	
}