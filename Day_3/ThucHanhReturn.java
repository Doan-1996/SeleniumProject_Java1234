package Day_3;

import java.util.Scanner;

public class ThucHanhReturn {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhập số tháng: ");
		System.out.print(level());
		
	}
	public static String level() {
		Scanner sc = new Scanner(System.in);
		int soThang = sc.nextInt();
		
		if(0<soThang&& soThang <6) {
			return "Fresher";
		}
		else if(soThang>=6 && soThang<=24)
			return "Junior";
		else
			return "Junior";
		
	}

}
