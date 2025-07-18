package Day_4_Homework;

public class Employee {

	private String employee_id;
	private String employee_name;
	private double employee_salary;

// khởi tạo 1 constructor
	public Employee(String employee_id, String employee_name, double employee_salary) {
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_salary = employee_salary;
	}

	public String getId() {
		return employee_id;
	}

	public void setId(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public double getEmployee_salary() {
		return employee_salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
