package com.iu.s1.string;

public class StringMain1 {

	public static void main(String[] args) {
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		//String 객체 생성 test
		String t1 = "test";  //객체생성 
		String t2 = new String("test"); //객체 생성 (위에랑 같은 문법)
		
		
		System.out.println(t1);
		
		Test test = new Test();
		System.out.println(test);
		System.out.println(test.toString());
		
		System.out.println(t1==t2);
		

	}

}
