package Day_3;

import java.util.Scanner;

public class Day3_Homework2 {

	public static void main(String[] args) {
		/*
		 * Nhập vào một số từ bàn phím (tối đa 20 lần nhập): - Nếu gặp số thứ i nào chia
		 * hết cho cả 2 và 3 thì in ra dòng chữ “Số thoả mãn” và thoát chương trình mặc
		 * dù chưa hết dãy số. - Nếu hết 20 lần thì in ra “Không tìm thấy số thoả mãn”.
		 * 
		 */
		System.out.print(Chiahetcho2va3());
	}

	public static String Chiahetcho2va3() {

		Scanner sc = new Scanner(System.in);

			for (int i = 0; i < 20; i++) {
			System.out.print("Nhập số thứ " + (i + 1) + ": ");
			int number = sc.nextInt();
			if (number % 2 == 0 && number % 3 == 0) {

				return "Số thỏa mãn";
			}

		}
		return "Số không thỏa mãn";

	}
}
