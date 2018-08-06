public class StudentDemo{
	//入口方法
	public static void main(String[]args){
		//声明一个数组存放学生对象
		Student[] stus=new Student[5];
		//创建学生对象并给姓名赋值
		for(int i=0;i<stus.length;i++){
			stus[i]=new Student();
			stus[i].name="学生"+(i+1);
			//学生缴费情况
			System.out.println(stus[i].name+"..."+stus[i].isFee);
			}
			for(int i=0;i<stus.length;i++){
				//学生缴费方法
				stus[i].fees();
				//学生缴费情况
				System.out.println(stus[i].name+"..."+stus[i].isFee);
			}
		
	}
}
//创建一个学生类
class Student{
	//学生属性
	String name;
	//String id;
	//int age;
	boolean isFee;
	//学生方法
	public void fees(){
		isFee=true;
	}
}