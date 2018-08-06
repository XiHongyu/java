package com.polymorphi.test04;

public class Test04 {
	
	public static Share employ(int i){
		if(i==1)
			return new Car(60, 2, 80);
		return new Bicycle(350, 1);
	}

	public static void main(String[] args) {
		System.out.println(employ(1).getprict());
		System.out.println(employ(2).getprict());
	}
	/**
	*
	*/
}
