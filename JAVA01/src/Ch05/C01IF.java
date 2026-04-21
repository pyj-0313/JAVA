package Ch05;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		//-----------------------
		//단순 IF
		//-----------------------
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : " );
//		int age = sc.nextInt();
//		if(age >= 8)
//			System.out.println("학교에 다닙니다.");
//		
//		System.out.println("첫번째 IF 코드 블럭 종료...");
//		
//		if(age<8)
//			System.out.println("학교에 다니지 않습니다.");
//		
//		System.out.println("두번째 IF 코드 블럭 종료...");
//		System.out.println("프로그램을 종료합니다.");
//		
//		sc.close();
		
		//-----------------------
		//IF-ELSE
		//-----------------------
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : " );
//		int age = sc.nextInt();
//		if(age >= 8)
//			System.out.println("학교에 다닙니다.");
//		else
//			System.out.println("학교에 다니지 않습니다.");
//		System.out.println("프로그램을 종료합니다.");
//		sc.close();
		
		//----------------------
		//1 문제
		//----------------------
		// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
		// 3의 배수이면서 5의 배수라면 "3의 배수이면서 5의 배수입니다" 출력
		// // 순서도도 그려보세요 - draw.io
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		if(num%3 == 0 && num%5 == 0) {
//			System.out.println("3의 배수이면서 5의 배수입니다." + num);
//		}else if(num%3 == 0) {
//			System.out.println("3의 배수입니다." + num);
//		}
//		System.out.println("프로그램을 종료합니다.");
//		sc.close();
		
		//---------------------
		//2 문제
		//---------------------
		// 두개의 정수를 입력받아 큰 수 출력
		//---------------------
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫번째 수를 입력하세요 : ");
//		int n1 = sc.nextInt();
//		System.out.print("두번째 수를 입력하세요 : ");
//		int n2 = sc.nextInt();
//		
//		if(n1>n2) {
//			System.out.println("큰수 : " + n1);
//		}else {
//			System.out.println("큰수 : " + n2);
//		}
//		System.out.println("프로그램을 종료합니다.");
//		sc.close();
		
		//---------------------
		//3 문제(☆)
		//---------------------
		// 세 개의 정수를 입력받아 큰 수 출력
		//---------------------
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫번째 수를 입력하세요 : ");
//		int n1 = sc.nextInt();
//		System.out.print("두번째 수를 입력하세요 : ");
//		int n2 = sc.nextInt();
//		System.out.print("세번째 수를 입력하세요 : ");
//		int n3 = sc.nextInt();
//		
//		if(n1>=n2 && n1>=n3) {
//			System.out.println("큰 수는 : " + n1);
//		}else if(n2>=n1 && n2>=n3) {
//			System.out.println("큰 수는 : " + n2);
//		}else {
//			System.out.println("큰 수는 : " + n3);
//		}
//		System.out.println("프로그램을 종료합니다.");
//		sc.close();
		
		//if만 쓸 경우 ex)n1 과 n2 값이 같을 경우 2개 출력
//		if(n1>=n2 && n1>=n3) {
//			System.out.println("큰수 : " + n1);
//		}
//		if(n2>=n3 && n2>=n1) {
//			System.out.println("큰수 : " + n2);
//		}
//		if(n3>=n1 && n3>=n2) {
//			System.out.println("큰수 : " + n3);
//		}
		
//		sc.close();
		//---------------------
		//4 문제
		//---------------------
		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력
		//---------------------
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫번째 수를 입력하세요 : ");
//		int n1 = sc.nextInt();
//		System.out.print("두번째 수를 입력하세요 : ");
//		int n2 = sc.nextInt();
//		System.out.print("세번째 수를 입력하세요 : ");
//		int n3 = sc.nextInt();
//		
//		int sum = n1+n2+n3;
//		int avg = (n1+n2+n3)/3;
//		
//		System.out.printf("세개의 정수의 합 : %d\n",sum);
//		System.out.printf("세개의 정수의 평균 : %d",avg);
//		sc.close();
		
		//---------------------
		//5 문제
		//---------------------
//		입력한 수가 짝수이고, 3의 배수라면 출력 (n%2==0 && n%3==0)
//		입력한 수가 홀수이고, 5의 배수라면 출력 (n%2==1 && n%5==0)
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("입력한 수 : ");
//		int n = sc.nextInt();
//		
//		if(n % 2 == 1 && n % 5 == 0) {
//			System.out.println("입력한 수는 홀수이고, 5의 배수입니다.");
//		}else if(n % 2 == 0 && n % 3 == 0) {
//			System.out.println("입력한 수는 짝수이고, 3의 배수입니다.");
//		}else {
//		System.out.println("프로그램을 종료합니다.");
//		}
//		sc.close();
		
		
		//강사님
//		if(n%2==0)
//		{
			//짝수
//			if(n%3==0)
				//짝수&&3의배수
//		}
//		else
//		{
			//홀수
//			if(n%5==0) {
				//홀수&&5의배수
//			}
//		}
		
		
		//-----------------------
		//IF - ELSE IF - ELSE
		//과목1,2,3,4 중 하나라도 40점 미만이면 불합격
		//과목평균이 100점만점 기준으로 60점 미만이면 불합격
		//아니면 합격
		//국어<=40||영어<=40||수학<=40||과학<=40||평균<60 : 불합격
		//그외 합격
		
		Scanner sc = new Scanner(System.in);
		int 국어 = sc.nextInt();
		int 영어 = sc.nextInt();
		int 수학 = sc.nextInt();
		int 과학 = sc.nextInt();
		double 평균 = (double)(국어+영어+수학+과학)/4;
//		else if 방법
//		if(국어<40)
//			System.out.println("불합격");
//		else if(영어<40) //국어>=40 && 영어<40
//			System.out.println("불합격");
//		else if(수학<40) //국어>=40 && 영어>=40 && 수학<40
//			System.out.println("불합격");
//		else if(과학<40) //국어>=40 && 영어>=40 && 수학>=40 && 과학<40
//			System.out.println("불합격");
//		else if(평균<60) //국어>=40 && 영어>=40 && 수학>=40 && 과학>=40 && 평균<60
//			System.out.println("불합격");
//		else //국어>=40 && 영어>=40 && 수학>=40 && 과학>=40 && 평균>=60
//			System.out.println("합격");
//		단축시킨 방법
//		if(국어>=40 && 영어>=40 && 수학>=40 && 과학>=40 && 평균>=60) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}
		// or 쓰는 방법
//		if(국어<=40||영어<=40||수학<=40||과학<=40||평균<60) {
//			System.out.println("불합격");
//		}else {
//			System.out.println("합격");
//		}
//		sc.close();	
		
		//문제
		//시험 점수를 입력받아
		//90 ~ 100점은 A,		-> 점수>=90
		//80 ~ 89점은  B,		-> 점수<90 && 점수>=80
		//70 ~ 79점은  C,		-> 점수<80 && 점수>=70
		//60 ~ 69점은  D,		-> 점수<70 && 점수>=60
		//나머지 점수는 F를 출력하는 프로그램을 작성하시오. 점수<60
		
		// 점수>=90           A
		// 점수<90 && 점수>=80 B
		// 점수<80 && 점수>=70 C
		// 점수<70 && 점수>=60 D
		// 나머지는 			F
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int n = sc.nextInt();
		
		if(n>=90) {
			System.out.println("학점은 : A");
		}else if(n>=80) {
			System.out.println("학점은 : B");
		}else if(n>=70) {
			System.out.println("학점은 : C");
		}else if(n>=60) {
			System.out.println("학점은 : D");
		}else {
		System.out.println("학점은 : F");
		}
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
