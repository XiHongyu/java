 //2.����������ͼ��������ܳ�
 public class Text02{
	 public static void main(String[]args){
		System.out.println("���������"+area(6,8,10));
		System.out.println("�������"+area(6,8));
		System.out.println("Բ���"+area(6));
		System.out.println("�������ܳ�"+perimeter(6,8,10));
		System.out.println("�����ܳ�"+perimeter(6,8));
		System.out.println("Բ�ܳ�"+perimeter(6));
	 }
	 
	//��� area  �ܳ� perimeter
	//���������
	public static double area(int a,int b,int c){
		double s=(a+b+c)/2.0;
		double d=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return d;
	}
	//�������
	public static int area(int a,int b){
		return a*b;
	}
	//Բ���
	public static double area(int r){
		return r*r*3.14;
	}
	
	public static int perimeter(int a,int b,int c){
		return a+b+c;
	}
	public static int perimeter(int a,int b){
		return 2*(a+b);
	}
	public static double perimeter(int r){
		return 2*r*3.14;
	}
 }