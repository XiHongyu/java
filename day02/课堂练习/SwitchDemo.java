import java.util.*;
public class SwitchDemo{
	public static void main(String[]args){
		/**
			switch���
			switch�����ʽ��{ //�������Ϳɽ���byte short char int
			case ����1:		 //�����������Ϳɽ���ö��(JDK1.5)��String�ַ�(JDK1.7)
				�����1;
			break;     //breakʡ�Կ��ܷ���case��͸
			case ����2:
				�����2;
			break;
				:
			default:
				�����n+1;
			break;
			}        //switch���� 1.����break����  2.�����Ҵ����Ž���
			switch �� if���ĶԱ�
				switch�����жϹ̶�ֵ��ʱ��ʹ��
				if�����ж������Χ��ʱ��ʹ��
		*/
		//�����·��жϼ��ں�����
		Scanner sc =new Scanner(System.in);
		System.out.print("������һ���·ݣ�");
		int month=sc.nextInt();
	switch (month){
		case 3:
		case 4:
		case 5:
			System.out.println(month+"���Ǵ�����");
		break;
		case 6:
		case 7:
		case 8:
			System.out.println(month+"�����ļ���");
		break;
		case 9:
		case 10:
		case 11:
			System.out.println(month+"�����＾��");
		break;
		case 12:
		case 1:
		case 2:
			System.out.println(month+"���Ƕ�����");
		break;
		default:
			System.out.println("û��"+month+"��");
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
			System.out.println("����ʮһ�졣");
		break;
		case 2:
			System.out.println("�ж�ʮ���졣");
		break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("����ʮ�졣");
		break;
		default :
		break;
	}
	}
}