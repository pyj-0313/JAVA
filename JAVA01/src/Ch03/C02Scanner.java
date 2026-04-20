package Ch03;

import java.util.Scanner;

public class C02Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 :");
		int num1 = sc.nextInt();
		System.out.println("입력된 정수 값 : "+num1);
		
		System.out.print("실수 입력 :");
		double num2 = sc.nextDouble();
		System.out.println("입력된 실수 값 : "+num2);
		
		System.out.print("문자열 입력 :");
//		String str1 = sc.next();		//문자열 입력 받기 함수, 띄어쓰기는 포함X
//		System.out.println("입력된 문자열 : "+str1);
		sc.nextLine();					// \n이 잔류하고 있기 때문에 찌꺼기를 먹어치워줘야한다
		String str1 = sc.nextLine();		//문자열 입력 받기 함수, 띄어쓰기는 포함o , 첫번째로 쓸때는 찌꺼기가 남지 않는다.
		System.out.println("입력된 문자열 : "+str1);
		
		sc.close();
	}

}
