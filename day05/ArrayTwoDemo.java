public class ArrayTwoDemo{
	public static void main(String[]args){
		/**
			��ϰ
			1.����ת��
			2.���ά����Խ��ߺ�
			3.��ӡ������ǣ�ռ����С�ڴ�
		*/
		//1.����ת��
		//��ʼ��һ����ά����arr1����������
		int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
		//��ӡת��ǰ
		printMat(arr1);
		//ת��
		int[][] arr2=matrix(arr1);
		//��ӡת����
		printMat(arr2);
		
		//2.��Խ��ߺ�
		int sum=arrSum(arr1);
		System.out.println(sum);
		
		//��ӡ�������
		printMat(yangHui(10));
		
		
	}
	//��ӡ����
	public static void printMat(int[][] arr){
		for(int[] temp:arr){
			for(int temp1:temp){
				System.out.print(temp1+"  ");
			}
			System.out.println();
		}
	}
	//����ת��
	public static int[][] matrix(int[][] arr){
		//��ʼ��һ���������е����������ձ任��ľ���
		int[][] arr2=new int[3][3];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr2[j][i]=arr[i][j];
			}
		}
		return arr2;
	}
	//��Խ��ߺ�
	public static int arrSum(int[][] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(i==j||i+j==arr.length-1){
					sum+=arr[i][j];
				}
			}
		}
		return sum;	
	}
	
	//��ӡ�������
	public static int[][] yangHui(int n){
		int[][] arr=new int[n][];
		for(int i=0;i<arr.length;i++){
			arr[i]=new int[i+1];
			for(int j=0;j<arr[i].length;j++){
				if(j==0||j==arr[i].length-1){
					arr[i][j]=1;
				}else {
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				}
			}
		}
		
		return arr;
		
	}
	
	
	
	
	
}