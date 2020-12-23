package khoa3_chuong2_buiQuocTrieu;

import java.util.Scanner;

public class bt3 {
	final static int MIN = -100;
	final static int MAX = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMangRanDom(n);
//		int a[] = nhapMang(scan, n);
		xuatMang(a);

		timDuongNhoNhat(a);

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

	public static void timDuongNhoNhat(int a[]) {
		int indexDuongMin = -1;
		// Tim gia tri duong dau tien
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				indexDuongMin = i;
				break;
			}
		}
		// Tim gia tri duong nho nhat
		for (int i = indexDuongMin; i < a.length; i++) {
			if (a[i] > 0) {
				if (a[i] < a[indexDuongMin]) {
					indexDuongMin = i;
				}
			}
		}

		if (indexDuongMin == -1) {
			System.out.println("NO. Mang khong co so duong.");
		} else {
			System.out.println("Yes. Vi tri gia tri duong nho nhat trong mang: " + indexDuongMin);

		}
	}

}
