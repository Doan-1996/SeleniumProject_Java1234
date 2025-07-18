package Day_4;

public class Motobike {
	String branch;
	String color;
	String number;
	String date;

	public String getInfo() {
		return "Branch is : " + branch + " Color is : " + color + "Number is : " + number + "Date register is :" + date;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motobike Lead = new Motobike();
		Lead.branch = "Honda";
		Lead.color = "Red";
		Lead.number = "29H206275";
		Lead.date = "12/12/2022";
		System.out.println(Lead.getInfo());

		Motobike Grande = new Motobike();
		Grande.branch = "Yamaha";
		Grande.color = "Blue";
		Grande.number = "29H206274";
		Grande.date = "12/12/2022";
		System.out.println(Grande.getInfo());

	}

}
