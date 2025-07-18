package Day_4;

public class Dog {
	String breed;
	String size;
	double age;
	String color;

	// Phương thức trả về thông tin
	public String getInfo() {
		return "Breed is " + breed + ", size is: " + size + ", age is : " + age + ", color is : " + color;
	}

	public static void main(String[] args) {
		//Khởi tạo đối tượng 
		Dog beggie = new Dog();
		beggie.breed = "Beggie";
		beggie.size = "Big";
		beggie.age = 1.5;
		beggie.color = "Brown";
		System.out.println(beggie.getInfo());
		 
		Dog puddle = new Dog();
		puddle.breed = "Pubble";
		puddle.size = "Small";
		puddle.age = 3;
		puddle.color = "Orange";
		System.out.println(puddle.getInfo());
	}

}
