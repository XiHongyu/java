public class Text{
	public static void main(String[]args){
		/**
			��ҵ�� 1.�Զ��巽�� ͨ�������������ͼ�� ��n-m������
				   2.����������ͼ��������ܳ�
				   3.�����ݹ���1-n�ĺͺ�n�Ľ׳�
		*/
		//1.�Զ��巽����ӡͼ��
		//graph1(6);  //��ӡƽ���ı���
		//graph2(6);  //��ӡ����������
		//table_99(); //��ӡ�žų˷���
		//System.out.println("n--m�������У�"+prime(2,100)+"��");
	}
	//��ӡƽ���ı���
	public static void graph1(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i+n;j++){
				if(j<=n-i){
					System.out.print("  ");
				}else{
					System.out.print("��");
				}
			}
			System.out.println();
		}
	}
	//��ӡ����������
	public static void graph2(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i+(2*i-1);j++){
				if(j<=n-i){
					System.out.print("  ");
				}else {
					System.out.print("\0011");
				}
			}
			System.out.println();
		}
	}
	//��ӡ�žų˷���
	public static void table_99(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
	//n--m ������
	public static int prime(int n,int m){
		int index=0,j;
		for(int i=n;i<=m;i++){
			for(j=n;j<i;j++){
				if(i%j==0){
					break;
				}
			}if(j==i){
				index++;
				System.out.print(i+" ");
			}
		}
		return index;
	}
	
}