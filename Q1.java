package day04;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		int select;
//		System.out.println("1.�츮�� ���");
//		System.out.println("2.ȸ�� ���");
//		System.out.println("3.��� ����");
//		select = input.nextInt();
//		switch (select){
//		case 3 : System.out.println("�츮�� : ����3��");
//		case 2 : System.out.println("ȸ�� : �ܼ���");break;
//		case 1 : System.out.println("�츮�� : ����3��");
//	}
		Scanner input = new Scanner(System.in);
		String home=null, office=null;
		int num;
		while(true) {
			System.out.println("1.�츮�� ���");
			System.out.println("2.ȸ�� ���");
			System.out.println("3.��� ����");
			num = input.nextInt();
			switch (num){
			case 1:
				System.out.println("�츮�� : ����3��");
				home = input.next();
				break;
			case 2:
				System.out.println("ȸ�� : �ܼ���");
				office = input.next();
				break;
			case 3:
				if(home != null || office != null)
				System.out.println("�츮�� : "+home);
				System.out.println("ȸ�� : "+office);
				break;
			
			
			}
			
			
			
		}
		
		
		
		
	}

}
