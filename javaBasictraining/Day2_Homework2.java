package javaBasictraining;

import java.util.Scanner;

public class Day2_Homework2 {

	public Day2_Homework2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Nhập mảng
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số lượng phần tử của mảng: ");
		int kichThuoc = scanner.nextInt(); // --> trả ra 1 số nguyên

		double[] array = new double[kichThuoc]; // khai báo 1 mảng mà có số lượng mảng là số vừa nhập (kichThuoc)
		double sum = 0;
		System.out.println("Bắt đầu nhập các phần tử của mảng:");
		for (int i = 0; i < kichThuoc; i++) {

			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
			array[i] = scanner.nextDouble(); // Nhập giá trị từng mảng một cho đến khi đạt đến giá trị kích thước
			double value = array[i]; // lấy giá trị của mỗi mảng
			sum += value; // tính tổng
			
		}
		System.out.println("Tổng giá trị của mảng là:  " + sum);
	
	}

}
