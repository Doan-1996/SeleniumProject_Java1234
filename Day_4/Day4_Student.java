package Day_4;

public class Day4_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day4_Person paul = new Day4_Person();
		paul.setAge(18) ;
		paul.setName("Paul Marker");
		paul.setPhoneNo("0326444567");
	
		System.out.println("Name: "+paul.getName()+ " Age: "+paul.getAge()+ " Phone number: "+ paul.getPhoneNo());
		Day4_Person peter = new Day4_Person();
		peter.setAge(18) ;
		peter.setName("Peter");
		peter.setPhoneNo("0326444567");
		System.out.println("Name: "+peter.getName()+ " Age: "+peter.getAge()+ " Phone number: "+ peter.getPhoneNo());
		
	}

}
