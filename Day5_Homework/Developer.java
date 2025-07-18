package Day5_Homework;

public class Developer extends Nhanvien {
	public Developer(String maNV, String tenNV) {
        super(maNV,tenNV); // Gọi constructor của lớp cha
    }
	@Override
	public void HienThiThongTin() {
		System.out.println("--- Thông tin Developer ---");
        System.out.println("Mã NV: " + getTenNV());
        System.out.println("Họ tên: " + getMaNV());
        System.out.println("Phòng ban: Developer");
	}
	

}
