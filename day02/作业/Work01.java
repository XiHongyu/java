public class Work01{
	public static void main(String[]args){
		//求1--100的奇数和以及偶数和
		int evemNum=0,oddNum=0;
		int index=0;
		/**
			//while循环
		
		while(index<=100){
			if(index%2==0){
				evemNum+=index;
			}else{
				oddNum+=index;
			}
			index++;
		}*/
		
		//do...while循环
		/*do{
			if(index%2==0){
				evemNum+=index;
			}else{
				oddNum+=index;
			}
			index++;
		}while(index<=100);*/
		
		//for循环
		for(int i=0;i<=100;i+=2){
			evemNum=evemNum+i;
		}
		for(int i=1;i<=100;i+=2){
			oddNum=oddNum+i;
		}
		System.out.println("奇数和是："+oddNum+"偶数和是："+evemNum);
		
		
	}
}