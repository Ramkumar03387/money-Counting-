package first.java;

import java.util.Scanner;

public class Teching {
	static int user ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter num: ");
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		findFiveRubies(user);
		findTenRubies(user);
		findTwentyRubies(user);
		findFiftyRubies(user);
		findOneHundredRubies(user);
		findTwoHundredRubies(user);
		findFiveHundredRubies(user);
		findTwoThousanddRubies(user);
		
	}
	private static void findTwoThousanddRubies(int a) {
		int b = 0;
		while(a>0) {
			b++;
			a-=2000;
		}
		System.out.println("find 2000 rubies: "+b);
	}
	public static void findFiveHundredRubies(int a) {
		int b = 0;
		while(a>0) {
			b++;
			a-=500;
		}
		System.out.println("find 500 rubies: "+b);
	}

	private static void findTwoHundredRubies(int a) {
		int b = 0;
		while(a>0) {
			b++;
			a-=200;
		}
		System.out.println("find 200 rubies: "+b);
		
	}

	private static void findOneHundredRubies(int a) {
		int b = 0;
		while(a>0) {
			b++;
			a-=100;
		}
		System.out.println("find 100 rubies: "+b);
		
	}

	private static void findFiftyRubies(int a) {
		int b = 0;
		while(a>0) {
			b++;
			a-=50;
		}
		System.out.println("find 50 rubies: "+b);	
	}

	public static void findFiveRubies(int a) {
		int b = 0;
		while(a>0) {
			b++;
			a-=5;
		}
		System.out.println("find 5 rubies: "+b);	
			}
	public static void findTenRubies(int a) {
		int b = 0;
		while(a>0) {
			b++;
			a-=10;
		}
		System.out.println("find 10 rubies: "+b);
	}
	public static void findTwentyRubies(int a) {
		int b = 0;
		while(a>0) {
			b++;
			a-=20;
		}
		System.out.println("find 20 rubies: "+b);
	}
	
}
