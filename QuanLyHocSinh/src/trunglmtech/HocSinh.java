package trunglmtech;

public class HocSinh {
	
	    // Khai báo các thuộc tính private
	    private String tenHocSinh;
	    private int tuoiHocSinh; 
	    private String lopHocSinh;

	    // Hàm tạo (Constructor) không tham số
	    public HocSinh() {
	    }

	    // Hàm tạo (Constructor) có đầy đủ tham số
	    public HocSinh(String tenHocSinh, int tuoiHocSinh, String lopHocSinh) {
	        this.tenHocSinh = tenHocSinh;
	        this.tuoiHocSinh = tuoiHocSinh;
	        this.lopHocSinh = lopHocSinh;
	    }

	    // --- Các phương thức Getters và Setters ---
	    public String getTenHocSinh() {
	        return tenHocSinh;
	    }

	    public void setTenHocSinh(String tenHocSinh) {
	        this.tenHocSinh = tenHocSinh;
	    }

	    public int getTuoiHocSinh() {
	        return tuoiHocSinh;
	    }

	    public void setTuoiHocSinh(int tuoiHocSinh) {
	        this.tuoiHocSinh = tuoiHocSinh;
	    }

	    public String getLopHocSinh() {
	        return lopHocSinh;
	    }

	    public void setLopHocSinh(String lopHocSinh) {
	        this.lopHocSinh = lopHocSinh;
	    }

	    // Tùy biến phương thức toString() để in ra thông tin đẹp mắt
	    @Override
	    public String toString() {
	        String chuoiXuat = "Họ và tên: " + tenHocSinh + "\n" +
	                           "Tuổi: " + tuoiHocSinh + "\n" +
	                           "Lớp: " + lopHocSinh;
	        return chuoiXuat;
	    }
	}

