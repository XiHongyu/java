public class Word02{
	public static void main(String[]args){
		//2.1+2+3+4������+n ���ʹ��ڵ���1024ʱ����n��ֵ
		//whileѭ��
		int n=1,num=0;
		/*
		while(num<1024){
			num=num+n;
			n++;
		}
		System.out.println("n=="+n);
		*/
		
		//do..whileѭ��
		/*
		do{
			num=num+n;
			n++;
		}while(num<1024);
		System.out.println(n);
		*/
		
		//forѭ��
		for(;num<1024;){
			num=num+n;
			n++;
		}
		System.out.println(n);
		
	}

}