package khoa3_chuong2_buiQuocTrieu;

import java.util.Scanner;

public class bt6 {
	final static int MIN = -100;
	final static int MAX = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
//		int x = nhapX(scan);
		int a[] = taoMangRanDom(n);
//		int a[] = nhapMang(scan, n);
		xuatMang(a);

		timDoanChuaPhanTu(a);

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

	public static void timDoanChuaPhanTu(int a[]) {
		int indexMax = 0;
		int indexMin = 0;
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[indexMin]) {
				indexMin = i;
			}
			if (a[i] > a[indexMax]) {
				indexMax = i;
			}

		}
		if (Math.abs(a[indexMin]) > Math.abs(a[indexMax])) {
			x = indexMin;
		} else {
			x = indexMax;
		}

		System.out.println("gia tri x can tim sao cho doan [-x,x] chua tat ca cac gia tri = " + Math.abs(a[x]));

	}

}
