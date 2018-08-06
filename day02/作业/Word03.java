public class Word03{
	public static void main(String[]args){
	/*
	3.一张纸厚度0.1cm,纸对折一次是厚度0.2cm 珠穆朗玛峰高度 8844.43米
		问折多少次可以超过珠穆朗玛峰
	*/
		//while循环
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
		
		//do..while循环
		do{
			ply=ply*2;
			n++;
		}while(ply<884443);
		System.out.println(n);
		
		int i=0;
		for(double d=0.1;d<884443;d*=2){
			
			System.out.println(i+"次，高度"+d);
			i++;
		}
		System.out.println(i+"次超过");
	}
}


