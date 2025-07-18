package Day5_Homework;

public  class Tester extends Nhanvien {
	public Tester(String maNV, String tenNV) {
        super(maNV,tenNV); // Gọi constructor của lớp cha
    }
	@Override
	public void HienThiThongTin() {
		System.out.println("--- Thông tin Tester ---");
        System.out.println("Mã NV: " + getTenNV());
        System.out.println("Họ tên: " + getMaNV());
        System.out.println("Phòng ban: Tester");
	}
	

}
