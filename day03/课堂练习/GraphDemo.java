 public class GraphDemo{
	 public static void main(String[]args){
		//打印等腰三角形
		/*
		        *
			   ***
			  *****
		*/
		for(int i=1;i<=6;i++){
			for(int j=1;j<=6-i+(2*i-1);j++){
				if(j<=6-i){
					System.out.print("  ");
				}else {
					System.out.print("\0011");
				}
			}
			System.out.println();
		}
		//打印九九乘法表
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
		//1到100之间的素数
		for(int i=2;i<=100;i++){
			int j=2;
			for(;j<i;j++){
				if(i%j==0&&j!=i){
					break;
				}
			}
			if(i==j){
				System.out.print(i+" ");
			}
		}
		//求兔子总数
		int f1=1,f2=1,f,n;
		for(n=3;n<=12;n++){
			f=f2;
			f2=f1+f2;
			f1=f;
			System.out.println("第" + n + "个月共有" + f2 + "对兔子");
			
		}
		 
	 }
 }