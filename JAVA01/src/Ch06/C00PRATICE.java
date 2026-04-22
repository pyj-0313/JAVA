package Ch06;

import java.util.Scanner;

public class C00PRATICE {

	public static void main(String[] args) {
		
		// 2 - 9 단 출력
		
		
		// 2단을 먼저 만들어보자
//		int dan = 2;
//		while(dan<10) {
//			int i = 1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d \n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		// N - 9 단 출력
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		int dan = n;
//		while(dan<10) {
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		// N - M 단 출력(N<M, N>=2 && N<=9, M>2 && M<10)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
		
//		유효성검증(N<M, N>=2 && N<=9, M>2 && M<10) 이 아닌경우
//		N>=M || (N<2 || N>9) || (M<=2 || M>=10)
//		while(n>=m || (n<2 || n>9) || (m<=2 || m>=10)) {
//			System.out.print("n,m 다시 입력 : ");
//			n = sc.nextInt();
//			m = sc.nextInt();
//		}
//		
//		int dan=n;
//		while(dan<m+1) {
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		// M - N 단 출력 거꾸로 2 x 9, 2 x 8....
//		Scanner sc = new Scanner(System.in);
//		System.out.print("n값을 넣어주세요 : ");
//		int n = sc.nextInt();
//		System.out.print("m값을 넣어주세요 : ");
//		int m = sc.nextInt();
//		int dan = m;
//		
//		while(dan>(n-1)) {
//			int i=9;
//			while(i>0) {
//				System.out.printf("%d x %d = %d \n",dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}
//
//		sc.close();
		
		// N - M 단 출력 거꾸로 2 x 9, 2 x 8....
//		Scanner sc = new Scanner(System.in);
//		System.out.print("n값을 넣어주세요 : ");
//		int n = sc.nextInt();
//		System.out.print("m값을 넣어주세요 : ");
//		int m = sc.nextInt();
//		int dan = n;
//		
//		while(dan<(m+1)) {
//			int i=9;
//			while(i>0) {
//				System.out.printf("%d x %d = %d \n",dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan++;
//		}
//
//		sc.close();
		
		// 1) 고정높이
		// *****
		// *****
		// *****
		// *****
//		행(i)		별(j)
//		0			0-4
//		1			0-4
//		2			0-4
//		3			0-4
//		----------------
//		i=0			j=0
//		i++			j++
//		i<4			j<=?
		
//		int i=0;
//		while(i<4) {
//			int j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		// 2)
		// 높이 : 4
		// *****
		// *****
		// *****
		// *****
//		행(i)		별(j)
//		0			0-4
//		1			0-4
//		2			0-4
//		3			0-4
//		----------------
//		i=0			j=0
//		i++			j++
//		i<h			j<=h
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int h = sc.nextInt();
//		int i=0;
//		while(i<h) {
//			int j=0;
//			while(j<=h) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		// 3) 고정높이
		// *
		// **
		// ***
		// ****
//		행(i)		별(j)
//		0			0-0
//		1			0-1
//		2			0-2
//		3			0-3
//		----------------
//		i=0			j=0
//		i++			j++
//		i<4			j<=i
		
//		int i=0;
//		while(i<4) {
//			int j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		// 4)
		// 높이 : 4 
		// * 
		// ** 
		// *** 
		// **** 
//		행(i)		별(j)
//		0			0-0
//		1			0-1
//		2			0-2
//		3			0-3
//		----------------
//		i=0			j=0
//		i++			j++
//		i<h			j<=i
	
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int h = sc.nextInt();
//		
//		int i=0;
//		while(i<h) {
//			int j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		// 5) 
		//높이 : 4
		//****
		//***
		//**
		//*		
//		행(i)		별(j)
//		0			0-3
//		1			0-2
//		2			0-1
//		3			0-0
//		----------------
//		i=0			j=0
//		i++			j++
//		i<4			j<=3-i
		
//		int i=0;
//		while(i<4) {
//			int j=0;
//			while(j<=3-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		// 5) 
		//높이 : 4
		//****
		//***
		//**
		//*		
//		행(i)		별(j)
//		0			0-3
//		1			0-2
//		2			0-1
//		3			0-0
//		----------------
//		i=0			j=0
//		i++			j++
//		i<h			j<=(h-1)-i
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int h = sc.nextInt();
//		
//		int i=0;
//		while(i<h) {
//			int j=0;
//			while(j<=(h-1)-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
	}

}
