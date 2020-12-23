package khoa3_chuong2_buiQuocTrieu;

import java.util.Scanner;

public class bt7 {
	final static int MIN = -100;
	final static int MAX = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int x = nhapX(scan);
		int y = nhapY(scan);
		int a[] = taoMangRanDom(n);
		xuatMang(a);
		timGiaTriTrongDoan(a, x, y);

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

	public static int nhapX(Scanner scan) {
		int x;

		System.out.print("Nhập gia tri duoi x  ");
		x = Integer.parseInt(scan.nextLine());

		return x;
	}

	public static int nhapY(Scanner scan) {
		int y;

		System.out.print("Nhập gia tri tren y  ");
		y = Integer.parseInt(scan.nextLine());
		return y;
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

	public static void timGiaTriTrongDoan(int a[], int x, int y) {
		boolean thoaDk = false;
		int indexTim =-1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= x && a[i] <= y) {
				thoaDk = true;
				indexTim = i;
				break;
			}
		}

		if (thoaDk == true) {
			System.out.println("Gia tri dau tien nam trong doan ["+ x +","+y+"] = " + a[indexTim] );
		} else {
			System.out.println("NO. tra lai ket qua -1");
		}
	}

}
