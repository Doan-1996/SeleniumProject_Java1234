package Day_3;

public class Day3_Homework1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tiếp tục viết chương trình Java sắp xếp một dãy số theo thứ tự giảm dần/tăng dần bằng thuật toán nổi bọt (Bubble Sort).
		int []arr = {19,23,5,2,9,56,12,47};
		sapxepMangTangDan(arr);
		sapxepMangGiamDan(arr);
		

	}
	public static void sapxepMangTangDan(int[] arr) {
		for(int i=0;i<arr.length;i++){
			for (int j=0;j<arr.length -i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			
			}
			System.out.println("Dãy số tăng dần là ");
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[j] + " ");
			}
			
		}
		System.out.println("số bé nhất là" + arr[0] );
		System.out.println("\n------------------ ");
		
	}
	public static void sapxepMangGiamDan(int[] arr) {
		for(int i=0;i<arr.length;i++){
			for (int j=0;j<arr.length -i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			
			}
			System.out.println("Dãy số giảm dần là ");
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[j] + " ");
			}
		}
		
	}

}
