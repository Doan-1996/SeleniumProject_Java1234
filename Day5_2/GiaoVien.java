package Day5_2;

public class GiaoVien extends Nguoi {
	// Thuộc tính riêng của giáo viên
	String maGV;
	String chuyenMon;

	// Phuong thức riêng của Giáo viên
	public void diDay() {
		System.out.println("\nGiáo viên đ dạy 5 ngày/tuần");
	}
	public void printInfo() {
		System.out.println(super.getTen() +","+ maGV + ","+ chuyenMon + super.getDiachi()+",tuổi "+ super.getTuoi());
	}

	@Override
	public void diChoi() {
		System.out.println("\nGiáo viên đi chơi vào ngày nghỉ");
	}
}
