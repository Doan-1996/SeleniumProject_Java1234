package Day5_Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
	private static List<Nhanvien> danhSachDevelopers = new ArrayList<>();
	private static List<Nhanvien> danhSachTesters = new ArrayList<>();
	private static List<Nhanvien> danhSachBAs = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menuPhongBan(); // gọi hàm menuphongban
		System.out.println("Mời bạn chọn phòng ban");
		int chon;
		chon = sc.nextInt();// nhập từ bàn phím
		switch (chon) {
		// Hãy thực hiện chức năng nhập thông tin nhân viên, và khi nhập xong, hãy thêm
		// các nhân viên đó vào chính cái danh sách danhSachDevelopers (là danh sách riêng của phòng ban Developer)
		case 1: // Developer
			nhapDanhSachNhanVien("Developer", danhSachDevelopers);
			break;
		case 2: // Tester
			nhapDanhSachNhanVien("Tester", danhSachTesters);
			break;
		case 3: // Business Analyst
			nhapDanhSachNhanVien("Business Analyst", danhSachBAs);
			break;
		default:
			System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
		}

	}

	// Danh sách riêng cho từng phòng ban (theo gợi ý dùng mảng ở lúc nhập và in)

	private static void menuPhongBan() {
		System.out.println("1. Phòng ban Developer");
		System.out.println("2. Phòng ban Tester");
		System.out.println("3. Phòng ban Business Analyst");
	}

	// Hàm nhập nhân viên và in ra ds nhân viên sau khi nhập
	private static void nhapDanhSachNhanVien(String tenPhongBan, List<Nhanvien> danhSach) {
		System.out.println("\n--- NHẬP THÔNG TIN CHO PHÒNG BAN " + tenPhongBan);
		System.out.print("Nhập số lượng nhân viên " + tenPhongBan + " muốn thêm: ");
		int n = sc.nextInt(); // số lượng nhân viên
		sc.nextLine();// DÒNG NÀY ĐỂ ĐỌC VÀ LOẠI BỎ KÝ TỰ XUỐNG DÒNG CÒN SÓT LẠI
		for (int i = 0; i < n; i++) {
			System.out.println("\nNhập thông tin nhân viên thứ " + (i + 1) + ":");
			System.out.print("Mã NV: ");
			String maNV = sc.nextLine();
			System.out.print("Họ tên: ");
			String hoTen = sc.nextLine();
			// Thực hiện thêm vào danh sách phòng ban Tester/Dev/BA
			switch (tenPhongBan) {
			case "Developer":
				danhSach.add(new Developer(maNV, hoTen)); // thêm 1 nhân viên dev có thuộc tính như class Developer đã
															// được định nghĩa vào danhSachs nhân viên
				break;
			case "Tester":
				danhSach.add(new Tester(maNV, hoTen));
				break;
			case "Business Analyst":
				danhSach.add(new BA(maNV, hoTen));
				break;
			default:
				System.out.println("Lỗi nội bộ: Không xác định được loại phòng ban.");
				break;
			}

			System.out.println("Đã thêm nhân viên " + maNV + " vào phòng ban " + tenPhongBan + ".");
		}
		// System.out.println("Danh sách nhân viên là "+ danhSach);
		System.out.println("\n--- DANH SÁCH NHÂN VIÊN PHÒNG BAN " + tenPhongBan + " ---");
		for (Nhanvien nv : danhSach) {
			// nv như là nv hiện tại đang nhập
			// với mỗi nhân viên được thêm vào thì sẽ được hiển thị lên màn hình theo format
			// của hàm HienThiThongTin trong class Nhânvien
			nv.HienThiThongTin(); // Gọi phương thức toString() của đối tượng Nhanvien
			System.out.println("------------------------------------");
		}
	}

}
