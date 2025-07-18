package Day_4_Homework;

public class Developer extends Employee {

	// Constructor của Developer gọi constructor của lớp cha (Employee)
	public Developer(String employee_id, String employee_name, double employee_salary) {
		super(employee_id, employee_name, employee_salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khởi tạo giá trị thông tin ban đầu của Dev 1
		Developer dev1 = new Developer("DEV001", "Harry Potter", 25000);
		//Cập nhật lại thông tin nếu muốn 
		dev1.setId("DEV00A");
		dev1.setEmployee_name("Harry Lu");
		System.out.println("ID is " + dev1.getId() + " Name is : " + dev1.getEmployee_name() + " Salary is : "
				+ dev1.getEmployee_salary());
		System.out.println("------------------------------");
		//Khởi tạo giá trị ban đầu của dev 2
		Developer dev2 = new Developer("DEV002", "Hermione Granger", 70000);
		System.out.println("ID is " + dev2.getId() + " Name is : " + dev2.getEmployee_name() + " Salary is : "
				+ dev2.getEmployee_salary());
	}

}
