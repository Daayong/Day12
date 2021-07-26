package com.iu.s1.string;

public class StringMain3 {

	public static void main(String[] args) {
		String name = "Hello World";
		
		char ch = 'o';
		//o라는 문자가 몇개 있습니까 
		
	//	int count=0;
		
	//	for(int i=0; i<13; i++) {
		
	//		int num = name.indexOf('o',i);
		
	//		if(num>0) {
		//		count=count+1;
	//		}
		
	//	}
		int count = 0 ; 	
		int num=0;		
		boolean check= true;
		
		while(check) {
			num = name.indexOf(ch,num);
			if (num>0) {
				num=num+1;
				//num++;
				count++;	
			}else {
				 System.out.println("검색종료");
				break;
			}
		}
				
				
		System.out.println(ch+"는 총 "+ count +"개 있습니다");
		
	}

}
