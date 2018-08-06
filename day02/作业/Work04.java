public class Work04{
	public static void main(String[]args){
		//有一只猴子有一堆桃子，每天吃桃子的一半，并多吃一个第八天的时候剩下三个桃子，问她共有几个桃子。
		int n=3;
		for(int i=8;i>0;i--){
			n=(n+1)*2;
			System.out.println("第"+i+"天有"+n+"个桃子");
		}
		System.out.println("共有"+n+"个桃子");
	}
}