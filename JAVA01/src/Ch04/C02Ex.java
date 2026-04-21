package Ch04;

import java.util.Scanner;

public class C02Ex {

	public static void main(String[] args) {
		//1.문제(삼항연산자 + 논리연산자)
		// 키보드로 국어/영어/수학 점수를 입력받아 각각의부분점수가 40점이상이고
		// 총점수합의 평균이 70점이상이면 '합격'
		// 미만이면 '불합격'을 출력합니다
		Scanner sc = new Scanner (System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		int ko = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int en = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int ma = sc.nextInt();
		double avg = (double)(ko+en+ma)/3;
		
		String result = (ko >= 40 && en >= 40 && ma >= 40 && avg >= 70) ? "합격" : "불합격";
		System.out.println("결과 : " + result);
		

		//2.미니문제(%연산자) - N%2==0
		//키보드로 부터 정수값 2개를 입력받아
		//두수의 합이 짝수이면 "짝수입니다"
		//홀수이면 "홀수입니다" 를 출력하세요~

		//스캐너는 위에서 받아서 안적음
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int sum = num1+num2;
		String result2 = (sum%2 == 0) ? "짝수" : "홀수";
//		String result2 = ((num1+num2) % 2== 0) ? "짝수" : "홀수"; //int sum으로 따로 안빼고 한번에 사용해도 됨
		System.out.println("결과 : " + result2 + "입니다.");
	}

}