package khoa3_chuong2_buiQuocTrieu;

import java.util.Scanner;

public class bt10 {
	final static int MIN = -10000;
	final static int MAX = 10000;
	final static int giaTri2020 = 2020;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMangRanDom(n);
//		int a[] = nhapMang(scan, n);
		xuatMang(a);

		timChiSoLonHon2020(a);

	}

	public static int[] nhapMang(Scanner scan, int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập n > 0  ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[] taoMangRanDom(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}

	public static boolean isPrime(int x) {
		boolean checkPrime = true;
		x = Math.abs(x);
		if (x < 2) {
			checkPrime = false;
		}
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0) {
				checkPrime = false;
			}
		}
		return checkPrime;
	}

	public static void timChiSoLonHon2020(int a[]) {
		boolean flag = false;
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > giaTri2020) {
				index = i;
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("NO. tra ve " + flag);
		} else {
			System.out.println("Gia tri lon hon 2020: " + a[index] + " tai chi so " + index);
		}
	}
}
