package Day_4;

public class Day4_Xe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day4_Xe Xemay = new Day4_Xe();
		Xemay.setName("Grande");
		Xemay.setType("xe máy");
		Xemay.setMaxSpeed("120km/h");
		System.out.println("Name is "+ Xemay.getName()+ " Type is : "+ Xemay.getType()+ " Speed Max is : "+ Xemay.getMaxSpeed());
		
		Day4_Xe Taxi = new Day4_Xe();
		Taxi.setName("SM Vinfast");
		Taxi.setType("xe taxi");
		Taxi.setMaxSpeed("500km/h");
		System.out.println("Name is "+ Taxi.getName()+ " Type is : "+ Taxi.getType()+ " Speed Max is : "+ Taxi.getMaxSpeed());
		
	}

}
