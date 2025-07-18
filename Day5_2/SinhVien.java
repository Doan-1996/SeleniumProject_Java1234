package Day5_2;

public class SinhVien extends Nguoi {
	String maSV;
	double GPA;
	int soTinChi;

	public void DiThi() {
		System.out.println("\nSinh viên đi thi giữa kì và cuối kì");

	}

	public void printInfo() {
		System.out.print(super.getTen() + " ," + maSV + " ," + GPA + ", số tín chỉ " + soTinChi + ", "
				+ super.getDiachi() + ", tuổi" + super.getTuoi());
	}

	@Override
	public void diChoi() {
		System.out.println("\nSinh viên đi chơi mà không cần tiền");

	}

}
