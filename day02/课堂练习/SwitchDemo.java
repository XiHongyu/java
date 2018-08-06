import java.util.*;
public class SwitchDemo{
	public static void main(String[]args){
		/**
			switch语句
			switch（表达式）{ //基本类型可接收byte short char int
			case 常量1:		 //引用数据类型可接收枚举(JDK1.5)和String字符(JDK1.7)
				语句体1;
			break;     //break省略可能发生case穿透
			case 常量2:
				语句体2;
			break;
				:
			default:
				语句体n+1;
			break;
			}        //switch结束 1.遇到break结束  2.遇到右大括号结束
			switch 与 if语句的对比
				switch建议判断固定值得时候使用
				if建议判断区间或范围的时候使用
		*/
		//输入月份判断季节和天数
		Scanner sc =new Scanner(System.in);
		System.out.print("请输入一个月份：");
		int month=sc.nextInt();
	switch (month){
		case 3:
		case 4:
		case 5:
			System.out.println(month+"月是春季，");
		break;
		case 6:
		case 7:
		case 8:
			System.out.println(month+"月是夏季，");
		break;
		case 9:
		case 10:
		case 11:
			System.out.println(month+"月是秋季，");
		break;
		case 12:
		case 1:
		case 2:
			System.out.println(month+"月是冬季，");
		break;
		default:
			System.out.println("没有"+month+"月");
		break;
		
	}
	switch (month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("有三十一天。");
		break;
		case 2:
			System.out.println("有二十八天。");
		break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("有三十天。");
		break;
		default :
		break;
	}
	}
}