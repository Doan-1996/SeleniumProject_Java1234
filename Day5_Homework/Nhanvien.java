package Day5_Homework;

public abstract class Nhanvien {
	 private String maNV;
	    private String TenNV; // <-- Đảm bảo dòng này đã được khai báo!

	    // Constructor
	    public Nhanvien(String maNV, String hoTen) {
	        this.maNV = maNV;
	        this.TenNV = hoTen;
	     ;
	    }
	public String getTenNV() {
		return TenNV;
	}

	public void setTenNV(String tenNV) {
		TenNV = tenNV;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	//trả về 1 chuỗi nếu không có khi in ra danh sách nhân viên nó sẽ in ra giá trị mặc định TenClass@diaChiTrongBoNho
	@Override
	
    public String toString() {
        return "Mã NV: " + maNV + ", Họ tên: " + TenNV;
    }
	public abstract void HienThiThongTin() ;
}
