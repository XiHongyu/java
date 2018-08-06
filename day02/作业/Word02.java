public class Word02{
	public static void main(String[]args){
		//2.1+2+3+4。。。+n 当和大于等于1024时，求n的值
		//while循环
		int n=1,num=0;
		/*
		while(num<1024){
			num=num+n;
			n++;
		}
		System.out.println("n=="+n);
		*/
		
		//do..while循环
		/*
		do{
			num=num+n;
			n++;
		}while(num<1024);
		System.out.println(n);
		*/
		
		//for循环
		for(;num<1024;){
			num=num+n;
			n++;
		}
		System.out.println(n);
		
	}

}