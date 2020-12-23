package khoa3_chuong2_buiQuocTrieu;

import java.util.Scanner;

public class bt4 {
	final static int MIN = -100;
	final static int MAX = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMangRanDom(n);
//		int a[] = nhapMang(scan, n);
		xuatMang(a);

		timSoNguyenToCuoiCung(a);

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
	
	public static void timSoNguyenToCuoiCung (int a[]){
		int indexPrime = -1;
		for (int i = a.length -1; i >0; i--) {
			if (isPrime(a[i])){
				indexPrime = i;
				break;
			}
		}
		
		if (indexPrime == -1) {
			System.out.println("NO. Mang khong co so nguyen to.");
		} else {
			System.out.println("YES. Vi tri so nguyen to cuoi cung trong mang: " + indexPrime);

		}
	}
}
