package Day_3;

import java.util.Scanner;

public class KiemTraChanLe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Mời nhập số : ");
		Scanner sr = new Scanner(System.in);
		int number = sr.nextInt();
		Kiemtra(number);
		inNgay(number);
		int[] mangSoNguyen= {1,3,6,7,55,33,22,789};

	}

	public static void Kiemtra(int number) {
		String result;
		result = (number % 2 == 0) ? "số chẵn" : "số lẻ";
		System.out.print(result);
	}

	public static void inNgay(int number) {
		String result;
		switch (number) {
		case 2:
			result = "Monday";
			break;
		case 3:
			result = "Tueday";
			break;
		case 4:
			result = "Wednesday";
			break;
		case 5:
			result = "Thursday";
			break;
		case 6:
			result = "Friday";
			break;
		case 7:
			result = "Saturday";
			break;
		case 8:
			result = "Sunday";
			break;
		default:
			result = "Number must be greater than 2 and smaller 8";
		}
		System.out.print("\n"+ result);
	}
}
