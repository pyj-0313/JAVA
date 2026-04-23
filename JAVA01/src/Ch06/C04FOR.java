package Ch06;

import java.util.Scanner;

public class C04FOR {

	public static void main(String[] args) {
		
		
//		int i=0;
//		while(i<10) {
//			System.out.println("HELLOWORLD");
//			i++;
//		}
		
//		for(int i=0;i<10;i++) {
//			System.out.println("HELLOWORLD");
//		}
		
		//02WHILE.java 의 while문을 모두 for문으로 바꾸세요.
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
		// 2 - 9 단 출력 (for문)
//		for(int dan=2; dan<10;dan++) {
//			System.out.println();
//			for(int i=1;i<10;i++) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//			}
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
		
		// N - 9 단 출력 (for문)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("n값을 넣어주세요 : ");
//		int n = sc.nextInt();
//		
//		for(int dan=n; dan<10;dan++) {
//		System.out.println();
//		for(int i=1;i<10;i++) {
//			System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//		}
//	}
		
		// N - M 단 출력(N<M, N>=2 && N<=9, M>2 && M<10)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//
//		// 유효성검증(N<M, N>=2 && N<=9, M>2 && M<10) 이 아닌경우
//		// N>=M || (N<2 || N>9) || (M<=2 || M>=10)
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
		
		// N - M 단 출력(N<M, N>=2 && N<=9, M>2 && M<10) (for문)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		while(n>=m || (n<2 || n>9) || (m<=2 || m>=10)) {
//			System.out.print("n,m 다시 입력 : ");
//			n = sc.nextInt();
//			m = sc.nextInt();
//		}
//		for(int dan=n; dan<m+1; dan++) {
//			System.out.println();
//			for(int i=1; i<10; i++) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//			}
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
		
		// M - N 단 출력 거꾸로 2 x 9, 2 x 8....
//		Scanner sc = new Scanner(System.in);
//		System.out.print("m값을 넣어주세요 : ");
//		int m = sc.nextInt();
//		System.out.print("n값을 넣어주세요 : ");
//		int n = sc.nextInt();
//		
//		for(int dan=m; dan>(m-1); dan--) {
//			System.out.println();
//			for(int i=9; i>0; i--) {
//				System.out.printf("%d x %d = %d \n",dan,i,dan*i);
//			}
//		}
		
		// 1) 고정높이 (for문)
		// i(행) j(별)
		// 0 0-4
		// 1 0-4
		// 2 0-4
		// 3 0-4
		// --------------
		// i=0 j=0
		// i++ j++
		// i<4 j<5

		// *****
		// *****
		// *****
		// *****
//		for(int i=0; i<4; i++) {
//			System.out.println();
//			for(int j=0; j<5; j++) {
//				System.out.print("*");
//			}
//		}
		
		// 2) (for문)
		// 높이 : 4
		// *****
		// *****
		// *****
		// *****
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이를 입력하세요 : ");
//		int h = sc.nextInt();
//		for(int i=0; i<h; i++) {
//			System.out.println();
//			for(int j=0; j<5; j++) {
//				System.out.print("*");
//			}
//		}
		
		// 3) 고정높이
		// *
		// **
		// ***
		// ****

		// i(행) j(별)
		// 0 0-0
		// 1 0-1
		// 2 0-2
		// 3 0-3
		// ----------
		// i=0 j=0
		// i++ j++
		// i<4 j<=i
		
//		for(int i=0; i<4; i++) {
//			System.out.println();
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int h = sc.nextInt();
//		
//		for(int i=0; i<h; i++) {
//			System.out.println();
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//		}
		
		// 5)
				// 높이 : 4 (for문)
				// ****
				// ***
				// **
				// *
//				i(행)	j(별)
//				0		0-(h-1)
//				1		0-(h-1)-1
//				2		0-(h-1)-2
//				3		0-(h-1)-3
//				..
//				h-1		0-0
//				-------------
//				i=0		j=0
//				i++		j++
//				i<4		j<=3-i
		
//		for(int i=0; i<4; i++) {
//			System.out.println();
//			for(int j=0; j<=3-i; j++) {
//				System.out.print("*");
//			}
//		}
		
//		높이 입력해서 받기
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int h = sc.nextInt();
//		
//		for(int i=0; i<h; i++) {
//			System.out.println();
//			for(int j=0; j<=(h-1)-i; j++) {
//				System.out.print("*");
//			}
//		}
		
		
		// 6)
		// 높이 : 4
		//    *
		//   ***
		// 	*****
		// *******
//		i(행)	j(공백)	k(별)
//		0		0-2		0-0
//		1		0-1		0-2
//		2		0-0		0-4
//		3		x		0-6
//		---------------------
//		i=0		j=0		k=0
//		i++		j++		k++
//		i<4		j<3-i	k<=2*i
		
//		for(int i=0; i<4; i++) {
//			System.out.println();
//			for(int j=0; j<3-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<=2*i;k++) {
//				System.out.print("*");
//			}
//		}
//		높이 입력받기
//		i(행)				j(공백)				k(별)
//		0					0~(h-2)-0			0-0
//		1					0~(h-2)-1			0-2
//		2					0~(h-2)-2			0-4
//		3					0~(h-2)-3		 	0-6
//		...
//		h-1(0부터시작이라-1)	0-(h-2)-(h-1)
//		-------------------------------------------------
//		i=0					j=0					k=0
//		i++					j++					k++
//		i<h					j<(h-1)-i			k<=2*i
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int h = sc.nextInt();
//		for(int i=0;i<h;i++) {
//			System.out.println();
//			for(int j=0; j<(h-1)-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<=2*i; k++) {
//				System.out.print("*");
//			}
//		}
		
		// 7)
		// 높이 : 4
		// *******
		// 	*****
		//   ***
		//	  *

		// 행(i) //공백(j) //별(k)
//		0			x			0-6
//		1			0-0			0-4
//		2			0-1			0-2
//		3			0-2			0-0
//----------------------------------
//		i=0			j=0			k=0
//		i++			j++			k++
//		i<4			j<i			k<2*(4-i)-1
//								k<=(3*2)-2*i //강사님 기준
		
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<=(3*2)-2*i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 행(i) //공백(j) //별(k)
//		0			x			0-6
//		1			0-0			0-4
//		2			0-1			0-2
//		3			0-2			0-0
//		h-1			
//----------------------------------
//		i=0			j=0			k=0
//		i++			j++			k++
//		i<h			j<i		k<2*(h-i)-1
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int h = sc.nextInt();
//		for(int i=0; i<h; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<2*(h-i)-1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 8) 고정높이
		//    *
		//   ***
		//  *****
		// *******
		//  *****
		//   ***
		//    *
//		행(i)		공백(j)		별(k)
//		0			0-2			0-0
//		1			0-1			0-2
//		2			0-0			0-4
//		3			x			0-6
//------------------------------------
//		i<4			j=0			k=0
//					j++			k++
//					j<3-i		k<=2*i
//------------------------------------		
//		4			0-0			0-4
//		5			0-1			0-2
//		6			0-2			0-0
//------------------------------------
//		i>=4		j=0			k=0
//					j++			k++
//					j<=i-4		k<=(6*2)-i*2
//------------------------------------
//		i=0
//		i++
//		i<7
		
//		for(int i=0; i<7; i++) {
//			if(i<4) {
//			for(int j=0; j<3-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<=2*i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			}else {
//				for(int j=0; j<=i-4; j++) {
//					System.out.print(" ");
//				}
//				for(int k=0; k<=(6*2)-i*2; k++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		}
		
//		행(i)			공백(j)			별(k)
//		0				0-2				0-0
//		1				0-1				0-2
//		2				0-0				0-4
//		3				x				0-6
//-------------------------------------------------
//		i<=h/2			j=0				k=0
//						j++				k++
//						j<(h/2)-i		k<=2*i
//-------------------------------------------------
//		4				0-0				0-4
//		5				0-1				0-2
//		6				0-2				0-0
//-------------------------------------------------
//						j=0				k=0
//						j++				k++
//						j<i-h/2		k<=((h-1)*2)-i*2
										
//-------------------------------------------------
//		i=0
//		i++
//		i<7
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int h = sc.nextInt();
//		for(int i=0; i<h; i++) {
//			if(i<=h/2) {
//			for(int j=0; j<(h/2)-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<=2*i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			}else {
//				for(int j=0; j<i-h/2; j++) {
//					System.out.print(" ");
//				}
//				for(int k=0; k<=((h-1)*2)-i*2; k++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
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
		// 행(i) //공백(j) //별(k)
//		0			x			0-6
//		1			0-0 		0-4
//		2			0-1			0-2
//		3			0-2			0-0
//-------------------------------------
//		i<4			j=0			k=0
//					j++			k++
//					j<i			k<=(3*2)-2*i
//-------------------------------------		
//		4			0-2			0-2
//		5			0-1			0-4
//		6			0-0			0-6
//-------------------------------------
//		i<=4		j=0			k=0
//					j++			k++
//					j<6-i		k<2*(i-3)+1
		
		for(int i=0; i<7; i++) {
			if(i<4) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=(3*2)-2*i; k++) {
				System.out.print("*");
			}
			}else {
				for(int j=0; j<6-i; j++) {
					System.out.print(" ");
				}
				for(int k=0; k<2*(i-3)+1; k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
		
		//1-10까지합
		//1-N까지합
		//N-M까지합(N<M)
		//2단 구구단
		//N단 구구단(2<=N<=9)
		//2-9 구구단
		//2-N 구구단
		//N-M 구구단
		//별찍기
		
		
	}

}
