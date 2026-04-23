package thigk2.leminhtrung;

/**
 * Lớp sản phẩm bao gồm các thông tin cơ bản và thuộc tính giá tự thêm.
 */
public class SanPham {
	
	    private String maSP;
	    private String tenSP;
	    private String loaiSP;
	    private double gia; // Thuộc tính thứ 4 tự thêm theo yêu cầu
	    
	    
	 // Constructor đầy đủ tham số
	    public SanPham(String maSP, String tenSP, String loaiSP, double gia) {
	        this.maSP = maSP;
	        this.tenSP = tenSP;
	        this.loaiSP = loaiSP;
	        this.gia = gia;
	    }
	    
	    
	 // Getter và Setter
	    public String getMaSP() { return maSP; }
	    public void setMaSP(String maSP) { this.maSP = maSP; }

	    public String getTenSP() { return tenSP; }
	    public void setTenSP(String tenSP) { this.tenSP = tenSP; }

	    public String getLoaiSP() { return loaiSP; }
	    public void setLoaiSP(String loaiSP) { this.loaiSP = loaiSP; }

	    public double getGia() { return gia; }
	    public void setGia(double gia) { this.gia = gia; }
	    
	    @Override
	    public String toString() {
	        return "Mã SP: " + maSP + " | Tên: " + tenSP + " | Loại: " + loaiSP + " | Giá: " + gia;
	    }
}
