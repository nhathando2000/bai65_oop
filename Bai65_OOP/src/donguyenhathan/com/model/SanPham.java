package donguyenhathan.com.model;

public class SanPham {
	private int ma;
	private String ten;
	private double gia;
	
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma; // Instance = local
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	@Override
	public String toString() {
		return "SanPham [ma=" + ma + ", ten=" + ten + ", gia=" + gia + "]";
	}
	
}
