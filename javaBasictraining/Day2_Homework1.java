package javaBasictraining;

import java.util.ArrayList;
import java.util.Scanner;

public class Day2_Homework1 {

	public Day2_Homework1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tìm số chẵn lẻ nhập vào từ bàn phím. Sau đó chạy chế độ debug 5 lần
		Scanner scan = new Scanner(System.in);
		System.out.print("Mời nhập số : ");
		double st1 = scan.nextDouble();
		checkNumber(st1);	
	}	
	public static void checkNumber (double st1)
	{
		if(st1 %2 == 0)
		{
			System.out.print("Đây là số chẵn");		}
		else
		{
			System.out.println("Đây là số lẻ");		
		}
	

	
			
}
}
