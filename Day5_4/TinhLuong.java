package Day5_4;

public class TinhLuong {
//khai báo hằng số lương cơ bản 
	public static final double LUONG_CO_BAN = 1000;

	// Hàm số tính lương với 2 tham số
	public static double TinhLuong(double hesoluong) {
		System.out.println("-> Tính lương theo công thức 2 tham số ");
		return LUONG_CO_BAN * hesoluong;
	}

	// Hàm số với 3 tham số truyền vào (lương cơ bản x hệ số lương x số năm kinh
	// nghiệm )
	public static double TinhLuong(double hesoluong, int namKN) {
		System.out.println("-> Tính lương theo công thức 3 tham số ");
		return hesoluong * namKN * LUONG_CO_BAN;
	}
	// Hàm số với 4 tham số truyền vào (lương cơ bản x hệ số lương x số năm kinh
	// nghiệm + luongCoBan x loại)

	//public static double TinhLuong(double hesoluong, int namKN, double loai) {
		System.out.println("-> Tính lương theo công thức 4 tham số ");
		return hesoluong * namKN * LUONG_CO_BAN + LUONG_CO_BAN * loai;
	}

}
