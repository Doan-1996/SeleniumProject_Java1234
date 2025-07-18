package Day_3;

import java.util.Scanner;

public class Day3_Homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /*
   * Bài 3:
		1.	Tìm giá trị nhỏ nhất của mảng số nguyên được nhập vào từ bàn phím.
		2.	Tìm giá trị lớn nhất của mảng số thập phân được nhập vào từ bàn phím.

   */
		SoNguyenNhoNhat(nhapMangNguyen());
		SoThapPhanLonNhat(nhapMangThapPhan());
		
		
	}
	public static int[] nhapMangNguyen() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Nhập độ dài mảng nguyên: ");
		int n = sc.nextInt();
		System.out.print("Nhập các giá trị của mảng : ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("\nNhập giá trị thứ " + (i + 1));
			a[i] = sc.nextInt();
			//decimalArray[i] = scanner.nextDouble();
		}
		return a;

	}
	public static double[] nhapMangThapPhan() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Nhập độ dài mảng thập phân: ");
		int n = sc.nextInt();
		System.out.print("Nhập các giá trị của mảng : ");
		double[] a = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.println("\nNhập giá trị thứ " + (i + 1));
			a[i] = sc.nextDouble();
			
		}
		return a;
	}
	public static void SoNguyenNhoNhat(int[] a)
	{
		
		 for(int i=0;i<a.length;i++){
				for (int j=0;j<a.length -i-1;j++)
				{
					if(a[j]>a[j+1])
					{
						int temp = a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				
				}
			}
			System.out.println("Giá trị bé nhất là: " + a[0] );
	}
	public static void SoThapPhanLonNhat(double[] a)
	{
		
		 for(int i=0;i<a.length;i++){
				for (int j=0;j<a.length -i-1;j++)
				{
					if(a[j]<a[j+1])
					{
						double temp = a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				
				}
			}
			System.out.println("Giá trị lớn nhất là: " + a[0] );
	}

}
