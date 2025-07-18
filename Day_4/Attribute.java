package Day_4;

//import java.security.KeyStore.Entry.Attribute;

public class Attribute {
	// Biến x thuộc class gọi là thuộc tính
	int x = 40;

	public static void main(String[] args) {
		Attribute att = new Attribute();
		att.x = 50;
		System.out.println("Giá trị cuối cùng của x : " + att.x);

	}

}
