//3.方法递归求1-n的和和n的阶乘
public class Text03{
	public static void main(String[]args){
		int sum=sum(23,24);
		System.out.println(sum);
		System.out.println("6的阶乘"+sum(6));
	}
	//n到m的和
	public static int sum(int n,int m){
		if(m==n)return n;
		return m+sum(n,m-1);
	}
	//n的阶乘
	public static int sum(int n){
		if(n==1)return n;
		return n*sum(n-1);
	}
}