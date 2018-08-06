package com.demo;

import java.util.Scanner;

public class Test {

	/**
	 *
	 */
	public static void main(String[] args) {
		String[] a={"语文","数学","英语"};
		System.out.println("前三个输入1——3的一个数：");
		Scanner sc=new Scanner(System.in);
		while(true){
			try{
				int i=sc.nextInt();
				System.out.println(a[i-1]);
				break;
			}catch(Exception e ){
				System.out.println("您输入的数不再该范围，请重新输入");
				e.getMessage();
			}finally{
				System.out.println("欢迎提出建议");
			}
		}
	}
}
