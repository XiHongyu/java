import java.util.*;
public class Day02Demo01{
	public static void main(String[]args){
		//�ж��·�����������
		System.out.println("�������·ݣ�");
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		if(month>=1&&month<=3){
			System.out.print(month+"���Ǵ�����");
			if(month==1||month==3){
				System.out.println("����ʮһ��");
			}else {
				System.out.println("�ж�ʮ����");
			}
		}else if(month>=4&&month<=6){
			System.out.print(month+"�����ļ���");
			if(month==5){
				System.out.println("����ʮһ��");
			}else{
				System.out.println("����ʮ��");
			}
		}else if(month>=7&&month<=9){
			System.out.print(month+"�����＾");
			if(month==7||month==8){
				System.out.println("����ʮһ��");
			}else {
				System.out.println("����ʮ��");
			}
		}else if(month>=10&&month<=12){
			System.out.print(month+"���Ƕ�����");
			if(month==12||month==10){
				System.out.println("����ʮһ��");
			}else {
				System.out.println("����ʮ��");
			}
		}else {
			System.out.println("һ����û��"+month+"��");
		}
	}
}