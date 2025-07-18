package Day5_2;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GiaoVien gv = new GiaoVien();
		gv.setDiachi("Hà Nội");
		gv.setSoCCCD(123456789);
		gv.setTen("Nguyễn Văn A");
		gv.setTuoi(25);
		gv.chuyenMon = "Thạc sĩ Toán";
		gv.maGV = "GV01";
		gv.printInfo();
		gv.diChoi();
		gv.diDay();
		System.out.println("----------------------");
		SinhVien sv = new SinhVien();
		sv.setDiachi("Hà Nội");
		sv.setSoCCCD(123456789);
		sv.setTen("Nguyễn Văn B");
		sv.setTuoi(30);
		sv.maSV = "SV01";
		sv.GPA = 4.8;
		sv.soTinChi = 130;
		sv.printInfo();
		sv.diChoi();
		sv.DiThi();

	}

}
