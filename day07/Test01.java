 import com.hnqy.Demo.DogDemo;  //����
public class Test01 {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int a=10;
		int b=20;
		int i = extracted(a, b);
		System.out.println(i);
	//�����������
	DogDemo d=new DogDemo();
	d.name="haha";
	d.cry();
	
	//����è��  ͨ���вι������ʼֵ
	Cat c1=new Cat("�ӷ�è","��ɫ");
	c1.cry();
	//����è�����  ͨ��set �������ó�ʼֵ
	Cat c2=new Cat();
	c2.setVariety("����è");
	c2.setColour("��ɫ");
	c2.cry();

	
	
	
	
	}

	
	
	
	private static int extracted(int a, int b) {
		return a+b;
	}
	
	
	
}
