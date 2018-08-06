public class InputGraph{
	public static void main(String[] args){
		triangle(5);
		rhomboid(5);
		table_99();
	}
	
	public static void triangle(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i+(2*i-1);j++){
				if(j<=n-i){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public static void rhomboid(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i+n;j++){
				if(j<=n-i){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public static void table_99(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}