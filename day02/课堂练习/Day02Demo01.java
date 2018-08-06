import java.util.*;
public class Day02Demo01{
	public static void main(String[]args){
		//判断月份天数及季节
		System.out.println("请输入月份：");
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		if(month>=1&&month<=3){
			System.out.print(month+"月是春季，");
			if(month==1||month==3){
				System.out.println("有三十一天");
			}else {
				System.out.println("有二十八天");
			}
		}else if(month>=4&&month<=6){
			System.out.print(month+"月是夏季，");
			if(month==5){
				System.out.println("有三十一天");
			}else{
				System.out.println("有三十天");
			}
		}else if(month>=7&&month<=9){
			System.out.print(month+"月是秋季");
			if(month==7||month==8){
				System.out.println("有三十一天");
			}else {
				System.out.println("有三十天");
			}
		}else if(month>=10&&month<=12){
			System.out.print(month+"月是冬季，");
			if(month==12||month==10){
				System.out.println("有三十一天");
			}else {
				System.out.println("有三十天");
			}
		}else {
			System.out.println("一年中没有"+month+"月");
		}
	}
}