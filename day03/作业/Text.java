public class Text{
	public static void main(String[]args){
		/**
			作业： 1.自定义方法 通过方法调用输出图形 和n-m的素数
				   2.方法重载求图形面积和周长
				   3.方法递归求1-n的和和n的阶乘
		*/
		//1.自定义方法打印图形
		//graph1(6);  //打印平行四边形
		//graph2(6);  //打印等腰三角形
		//table_99(); //打印九九乘法表
		//System.out.println("n--m的素数有："+prime(2,100)+"个");
	}
	//打印平行四边形
	public static void graph1(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i+n;j++){
				if(j<=n-i){
					System.out.print("  ");
				}else{
					System.out.print("￥");
				}
			}
			System.out.println();
		}
	}
	//打印等腰三角形
	public static void graph2(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i+(2*i-1);j++){
				if(j<=n-i){
					System.out.print("  ");
				}else {
					System.out.print("\0011");
				}
			}
			System.out.println();
		}
	}
	//打印九九乘法表
	public static void table_99(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
	//n--m 的素数
	public static int prime(int n,int m){
		int index=0,j;
		for(int i=n;i<=m;i++){
			for(j=n;j<i;j++){
				if(i%j==0){
					break;
				}
			}if(j==i){
				index++;
				System.out.print(i+" ");
			}
		}
		return index;
	}
	
}