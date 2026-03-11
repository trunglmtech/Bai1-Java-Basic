public class SinhVien {
    // Thuộc tính PRIVATE - chỉ truy cập trong lớp
    private String ten;
    private int tuoi;
    private String maSV;
    private double diemTB;
    // Constructor mặc định
    public SinhVien() {
        this.ten = "Chưa có tên";
        this.tuoi = 18;
        this.maSV = "SV000";
        this.diemTB = 0.0;
    }
    // Constructor có tham số
    public SinhVien(String ten, int tuoi, String maSV) {
        this.ten = ten;
        this.setTuoi(tuoi);  // Sử dụng setter để validate
        this.maSV = maSV;
        this.diemTB = 0.0;
    }
}
