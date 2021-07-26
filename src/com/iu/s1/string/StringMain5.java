package com.iu.s1.string;

import java.util.Scanner;

public class StringMain5 {
	public static void main(String [] args) {
		String n = "Hello World";
		
		String n2 = n.replace("Hello", "Bye");
		
		
		System.out.println(n);
		System.out.println(n2);
		
		String n3 = n.substring(n.indexOf('W'),8); //마지막 인덱스 번호 미만까지 
		System.out.println(n3);
		
		System.out.println("--------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("저장할 파일명을 입력");
		//a.txt ,  iu.jpg ,    study.pdf, test.iu.gif   등등 으로 작성 
		//입력받은 파일이 이미지 파일 여부 판단 
		//이미지파일은 jpg,gif,png,svg
		
		String file = sc.next();	
		
		String str = file.substring(file.indexOf('.'));
		
		String h1=".jpg";
		String h2=".png";
		String h3=".gif";
		String h4=".svg";
		
		if(str.equals(h1) || str.equals(h2) || str.equals(h3) || str.equals(h4)) {
			System.out.println("이미지파일입니다.");
		}else {
			System.out.println("이미지 파일이 아닙니다");
		}
			
	}
	
}
