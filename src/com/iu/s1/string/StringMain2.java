package com.iu.s1.string;

public class StringMain2 {

	public static void main(String[] args) {
		String name = "Hello World";
		
		
		char ch = name.charAt(1);
		
		System.out.println(ch);
		
		name="991021-1234567";
		
		ch = name.charAt(7);
		
		if(ch=='1' || ch=='3' ) {
			System.out.println("남자입니다");
		}else {
			System.out.println("여자입니다");
			}
		
		ch = name.charAt(200);
		System.out.println(ch);
		
		
		
		
		
		
		
		
		
	}

}
