package Day_3;

import java.util.Scanner;

public class ThucHanhFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invaCongSoCHan();
		//inMangSoChiaHetCHo5(nhapMang());
		sapxepMangTangDan(nhapMang());
	}

	public static void invaCongSoCHan() {
		int sum = 0;
		for (int i = 0; i <= 100; i = i + 2) {
			System.out.print(i + ",");
			sum += i;
		}
		System.out.print("\n Tổng các số chẵn là: " + sum);
	}

	public static int[] nhapMang() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Nhập độ dài mảng: ");
		int n = sc.nextInt();
		System.out.print("Nhập các giá trị của mảng : ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập giá trị thứ " + (i + 1));
			a[i] = sc.nextInt();
		}
		return a;

	}

	public static void sapxepMangTangDan(int[] a) {
		// 5 9 100 45 8
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				int temp;
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			System.out.println("Mảng các số tăng dần là : ");
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j] + " ");
			}
		}

	}

	public static void inMangSoChiaHetCHo5(int[] input) {
		String[] output = new String[input.length];

		for (int i = 0; i < input.length; i++) {
			if (input[i] % 5 == 0) {
				// System.out.println("Số chia hết cho 5: "+ a[i]);
				output[i] = String.valueOf(input[i]);
			} else {
				output[i] = "";
			}

		}
		System.out.println("Mảng chia hết cho 5: ");
		for (int j = 0; j < output.length; j++) {
			System.out.print(output[j] + " ");
		}
	}

}
