package day04;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		int select;
//		System.out.println("1.우리집 등록");
//		System.out.println("2.회사 등록");
//		System.out.println("3.등록 보기");
//		select = input.nextInt();
//		switch (select){
//		case 3 : System.out.println("우리집 : 종로3가");
//		case 2 : System.out.println("회사 : 단성사");break;
//		case 1 : System.out.println("우리집 : 종로3가");
//	}
		Scanner input = new Scanner(System.in);
		String home=null, office=null;
		int num;
		while(true) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			num = input.nextInt();
			switch (num){
			case 1:
				System.out.println("우리집 : 종로3가");
				home = input.next();
				break;
			case 2:
				System.out.println("회사 : 단성사");
				office = input.next();
				break;
			case 3:
				if(home != null || office != null)
				System.out.println("우리집 : "+home);
				System.out.println("회사 : "+office);
				break;
			
			
			}
			
			
			
		}
		
		
		
		
	}

}
