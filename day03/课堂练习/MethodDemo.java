public class MethodDemo{
	public static void main(String[]args){
		
		/**
			1.���巽�����ͼ��
			2.���巽����n����m�������
			3���õݹ���1��n�ĺ�     ��n�Ľ׳�
		*/
		double triangle=area(3,4,5);
		System.out.println(triangle);
	}
	
	//�����������
	public static double area(int a,int b,int c){
		double s=(a+b+c)/2.0;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
	
}