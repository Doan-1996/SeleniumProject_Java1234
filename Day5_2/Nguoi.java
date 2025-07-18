package Day5_2;

public class Nguoi {
	private String Ten;
	private int Tuoi;
	private long soCCCD;
	private String diachi;
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public int getTuoi() {
		return Tuoi;
	}
	public void setTuoi(int tuoi) {
		Tuoi = tuoi;
	}
	public long getSoCCCD() {
		return soCCCD;
	}
	public void setSoCCCD(long soCCCD) {
		this.soCCCD = soCCCD;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	
	public void diChoi() {
		System.out.println("Đi chơi khi có tiền");
		
	}
}
