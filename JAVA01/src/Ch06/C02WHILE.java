package Ch06;

import java.util.Scanner;

public class C02WHILE {

	public static void main(String[] args) {
		
		// 2 - 9 단 출력
//		int dan = 2;
//		while(dan<10) {
//			
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			
//			System.out.println();
//			dan++;
//		}

		// N - 9 단 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("n값을 넣어주세요 : ");
//		int n = sc.nextInt();
//		int dan = n;
//		
//		while(dan<10) {
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d \n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
//		sc.close();
		
		
		// N - M 단 출력(N<M, N>=2 && N<=9, M>2 && M<10)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
		
		
		//유효성검증(N<M, N>=2 && N<=9, M>2 && M<10) 이 아닌경우
		//N>=M || (N<2 || N>9) || (M<=2 || M>=10)
//		while(n>=m || (n<2 || n>9) || (m<=2 || m>=10)) {
//			System.out.print("n,m 다시 입력 : ");
//			n = sc.nextInt();
//			m = sc.nextInt();
//		}
//		int dan = n;
//		while(dan<(m+1)) {
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d \n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		//-----------------if else 사용
//		if(n<m && n>=2 && n<=9 && m>2 && m<10) {
//			while(dan<(m+1)) {
//				int i=1;
//				while(i<10) {
//					System.out.printf("%d x %d = %d \n",dan,i,dan*i);
//					i++;
//				}
//				System.out.println();
//				dan++;
//			}
//		}else {
//			System.out.println("오류 발생");
//		}
//		sc.close();
		
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
		// i(행)		j(별)
		// 0		0-4
		// 1		0-4
		// 2    	0-4
		// 3		0-4
		//--------------
		//i=0		j=0
		//i++		j++
		//i<4		j<5
		
		// *****
		// *****
		// *****
		// *****
//		int i = 0;
//		while(i<4) {
//				
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
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이를 입력하세요 : ");
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//				
//			int j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;	
//		}
//		sc.close();
		
		
		// 3) 고정높이
		// *
		// **
		// ***
		// ****
		
		//i(행)	j(별)
		//0		0-0
		//1		0-1
		//2		0-2
		//3		0-3
		//----------
		//i=0	j=0
		//i++	j++
		//i<4	j<=i
		

//		int i = 0;
//		while(i<4) {
//				
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
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			
//			int j=0;
//			while(j<=i){
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		sc.close();

		
		// 5) 
		//높이 : 4
		//****
		//***
		//**
		//*		
//		i(행)	j(별)
//		0		0-(h-1)
//		1		0-(h-1)-1
//		2		0-(h-1)-2
//		3		0-(h-1)-3
//		..
//		h-1		0-0
//		-------------
//		i=0		j=0
//		i++		j++
//		i<4		j<=(h-1)-i
//		표준적인 방식
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int h = sc.nextInt();
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
//		sc.close();

//		특수한 경우		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j= h-1;
//			while(j>=i) {
//				System.out.print("*");
//				j--;
//			}
//			System.out.println();
//			i++;
//		}
//		sc.close();
		

		
		
		//6)
		//높이 : 4
		//   *
		//  ***
		// *****
		//*******
//		i(행)	j(공백)	k(별)
//		0		0-2		0-0
//		1		0-1		0-2
//		2		0-0		0-4
//		3		x		0-6
//		---------------------
//		i=0		j=0		k=0
//		i++		j++		k++
//		i<4		j<3-i	k<=2*i
		
//		int i=0;
//		while(i<4) {
//			int j =0;
//			while(j<3-i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k = 0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
//		------------------------------------------------------------	
//		-----------높이를 입력할때-------------
//		i(행)		j(공백)			k(별)
//		0			0-(h-2)-0		0-0
//		1			0-1				0-2
//		2			0-0				0-4
//		3			x				0-6
//		----------------------------------
//		i=0			j=0				k=0
//		i++			j++				k++
//		i<h			j<(h-1)i		k<=2*i
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0;
//		while(i<h) {
//			int j =0;
//			while(j<h-i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k = 0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
//-----------------------------------------------------
			
		//7)
		//높이 : 4
		//*******
		// *****
		//  ***
		//   *
		
		//행(i)		//공백(j)		//별(k)
//		0			x			0-6
//		1			0-0			0-4
//		2			0-1			0-2
//		3			0-2			0-0
//----------------------------------
//		i=0			j=0			k=0
//		i++			j++			k++
//		i<4			j<i		k<=6-(2*i)
		
//		int i = 0;
//		while(i<4) {
//			int j=0;
//			while(j<i) {
//				System.out.print(" ");
//				j++;
//			}
//				int k=0;
//				while(k<=6-(2*i)) {
//					System.out.print("*");
//					k++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		높이 입력받아서 출력
		//행(i)		//공백(j)		//별(k)
//		0			x			0-6
//		1			0-0			0-4
//		2			0-1			0-2
//		3			0-2			0-0
//----------------------------------
//		i=0			j=0			k=0
//		i++			j++			k++
//		i<h			j<i		k<=((h-1)*2)-(2*i)
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j=0;
//			while(j<i) {
//				System.out.print(" ");
//				j++;
//			}
//				int k=0;
//				while(k<=((h-1)*2)-(2*i)) {
//					System.out.print("*");
//					k++;
//			}
//			System.out.println();
//			i++;
//		}
//		sc.close();
		
		
		
		

		//8) 고정높이
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *
		//행(i)		//공백(j)		//별(k)
//		0			0-2			0-0
//		1			0-1			0-2
//		2			0-0			0-4
//		3			x			0-6
//-------------------------------------
//		i=0			j=0			k=0
//		i++			j++			k++
//		i<7			j<3-i		k<=2*i
//-------------------------------------		
//		4			0-0			0-4
//		5			0-1			0-2
//		6			0-2			0-0
//-------------------------------------
//		i<7		j<=i-4		k<=12-(2*i)	
		
		
//		int i=0;
//		while(i<4) {
//			int j=0;
//			while(j<3-i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k=0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
//		while(i<7) {
//			int j=0;
//			while(j<=i-4) {
//				System.out.print(" ");
//				j++;
//			}
//			int k=0;
//			while(k<=12-(2*i)) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		
		
		
		
		//9)
		//높이 : 7
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *	
		//행(i)		//공백(j)		//별(k)
//		0			0-2			0-0
//		1			0-1			0-2
//		2			0-0			0-4
//		3			x			0-6
//-------------------------------------
//		i=0			j=0			k=0
//		i++			j++			k++
//		i<h			j<3-i		k<=2*i
//-------------------------------------		
//		4			0-0			0-4
//		5			0-1			0-2
//		6			0-2			0-0
//-------------------------------------
//		i<h		j<=i-4		k<=12-(2*i)	
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int mid = h/2;
//		
//		int i=0;
//		while(i<=mid) {
//			int j=0;
//			while(j<mid-i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k=0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
//		while(i<h) {
//			int j=0;
//			while(j<=i-(mid+1)) {
//				System.out.print(" ");
//				j++;
//			}
//			int k=0;
//			while(k<=(h-i-1)*2) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		
		
		
		
		
		
		
		
		// 10)
		// 높이 : 7
		//*******
		// *****
		//  ***
		//   *
		//  ***
		// *****
		//*******
		
		//행(i)		//공백(j)		//별(k)
//		0			x			0-6
//		1			0-0 		0-4
//		2			0-1			0-2
//		3			0-2			0-0
//-------------------------------------
//		i=0			j=0			k=0
//		i++			j++			k++
//		i<4			j<i			k<=6-(2*i)
//-------------------------------------		
//		4			0-0			0-4
//		5			0-1			0-2
//		6			0-2			0-0
//-------------------------------------
//		i<7		j<=i-4		k<=12-(2*i)	
		
		
//		int i=0;
//		while(i<4) {
//			int j=0;
//			while(j<i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k=0;
//			while(k<=6-(2*i)) {
//			System.out.print("*");
//			k++;
//			}
//			System.out.println();
//			i++;
//			}
//		while(i<7) {
//			int j=0;
//			while(j<6-i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k=0;
//			while(k<=(i-4)*2+2) {
//				System.out.print("*");
//				k++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
		
		
	}

}
