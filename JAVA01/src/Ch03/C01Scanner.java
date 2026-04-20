package Ch03;

import java.util.Scanner;

public class C01Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("num1 입력 : ");
		int num1 = sc.nextInt(); // 엔터(\n),스페이스바
		
		System.out.printf("num2 입력 : ");
		int num2 = sc.nextInt(); //엔터(\n),스페이스바
		
		System.out.printf("num3 입력 : ");
		int num3 = sc.nextInt(); //엔터(\n),스페이스바
		
		
		System.out.printf("%d %d %d\n", num1,num2,num3);
		sc.close();

	}

}
