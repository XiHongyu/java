//3.�����ݹ���1-n�ĺͺ�n�Ľ׳�
public class Text03{
	public static void main(String[]args){
		int sum=sum(23,24);
		System.out.println(sum);
		System.out.println("6�Ľ׳�"+sum(6));
	}
	//n��m�ĺ�
	public static int sum(int n,int m){
		if(m==n)return n;
		return m+sum(n,m-1);
	}
	//n�Ľ׳�
	public static int sum(int n){
		if(n==1)return n;
		return n*sum(n-1);
	}
}