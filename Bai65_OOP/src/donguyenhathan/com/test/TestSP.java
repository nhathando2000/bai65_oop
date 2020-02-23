package donguyenhathan.com.test;

import donguyenhathan.com.model.SanPham;

public class TestSP {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham();
		sp1.setMa(1);
		sp1.setTen("coca");
		sp1.setGia(12.0);
		System.out.println(sp1);
	}

}
