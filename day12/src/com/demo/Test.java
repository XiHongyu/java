package com.demo;

import java.util.Scanner;

public class Test {

	/**
	 *
	 */
	public static void main(String[] args) {
		String[] a={"����","��ѧ","Ӣ��"};
		System.out.println("ǰ��������1����3��һ������");
		Scanner sc=new Scanner(System.in);
		while(true){
			try{
				int i=sc.nextInt();
				System.out.println(a[i-1]);
				break;
			}catch(Exception e ){
				System.out.println("������������ٸ÷�Χ������������");
				e.getMessage();
			}finally{
				System.out.println("��ӭ�������");
			}
		}
	}
}
