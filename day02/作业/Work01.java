public class Work01{
	public static void main(String[]args){
		//��1--100���������Լ�ż����
		int evemNum=0,oddNum=0;
		int index=0;
		/**
			//whileѭ��
		
		while(index<=100){
			if(index%2==0){
				evemNum+=index;
			}else{
				oddNum+=index;
			}
			index++;
		}*/
		
		//do...whileѭ��
		/*do{
			if(index%2==0){
				evemNum+=index;
			}else{
				oddNum+=index;
			}
			index++;
		}while(index<=100);*/
		
		//forѭ��
		for(int i=0;i<=100;i+=2){
			evemNum=evemNum+i;
		}
		for(int i=1;i<=100;i+=2){
			oddNum=oddNum+i;
		}
		System.out.println("�������ǣ�"+oddNum+"ż�����ǣ�"+evemNum);
		
		
	}
}