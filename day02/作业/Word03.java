public class Word03{
	public static void main(String[]args){
	/*
	3.һ��ֽ���0.1cm,ֽ����һ���Ǻ��0.2cm ���������߶� 8844.43��
		���۶��ٴο��Գ������������
	*/
		//whileѭ��
		double ply=0.1;
		int n=0;
		/*
		while(ply<884443){
			ply=ply*2;
			System.out.println(ply);
			n++;
		}
		System.out.println(n);
		*/
		
		//do..whileѭ��
		do{
			ply=ply*2;
			n++;
		}while(ply<884443);
		System.out.println(n);
		
		int i=0;
		for(double d=0.1;d<884443;d*=2){
			
			System.out.println(i+"�Σ��߶�"+d);
			i++;
		}
		System.out.println(i+"�γ���");
	}
}


