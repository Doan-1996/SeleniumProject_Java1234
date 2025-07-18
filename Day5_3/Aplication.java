package Day5_3;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HinhTron ht = new HinhTron();
ht.setTenHinh("Hình Tròn");
ht.banKinh=5.5;
System.out.println(ht.getTenHinh()+ " có diện tích là: " + ht.dienTich());

HinhVuong hv = new HinhVuong();
hv.setTenHinh("Hình Vuông");
hv.chieuDaiCanh=5.5;
System.out.println(hv.getTenHinh()+ " có diện tích là: " + hv.dienTich());
	}

}
