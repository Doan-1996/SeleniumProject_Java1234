package javaBasictraining;

import java.util.Scanner;

public class Person1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tên : Vũ THúy Đoan");
		System.out.println("Email : doanvt@gmail.com");
		System.out.println("Sđt : 0326434694");
		Scanner scan = new Scanner(System.in);
		System.out.print("Mời nhập số thứ 1: ");
		int st1 = scan.nextInt();
		System.out.print("Mời nhập số thứ 2: ");
		int st2 = scan.nextInt();
		printLargerNumber(st1,st2);
		phepTinh();
	}
	public static void printLargerNumber (int number1, int number2)
	{
		if(number1<number2)
		{
			System.out.println("Số lớn hơn là number2: " + number2);
		}
		else
			System.out.print("Số lớn hơn là number 1: " + number1);
	}
    public static void phepTinh()
    {
    	double result =0;
    	result = (1123*6745)/500;
    	System.out.print("Kết quả phép tính: " + result);
    }
}
