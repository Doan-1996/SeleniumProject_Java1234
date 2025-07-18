package Day5_Homework;

public class BA extends Nhanvien
{
	public BA(String maNV, String tenNV) {
        super(maNV,tenNV); // Gọi constructor của lớp cha
    }
	@Override
	public void HienThiThongTin() {
		System.out.println("--- Thông tin BA ---");
        System.out.println("Mã NV: " + getTenNV());
        System.out.println("Họ tên: " + getMaNV());
        System.out.println("Phòng ban: BA");
	}

}
