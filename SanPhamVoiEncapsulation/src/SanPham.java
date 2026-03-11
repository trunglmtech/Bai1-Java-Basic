public class SanPham {
    private String maSP;
    private String tenSP;
    private double gia;
    private int soLuong;
    // Constructor mặc định
    public SanPham() {
        this.maSP = "Chưa có";
        this.tenSP = "Chưa rõ";
        this.gia = 1;
        this.soLuong = 0;
    }
    // Constructor có tham số
    public SanPham(String maSP, String tenSP, double gia, int soLuong) {
        setMaSP(maSP);
        setTenSP(tenSP);
        setGia(gia);
        setSoLuong(soLuong);
    }
    // Getter
    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getGia() {
        return gia;
    }

    public int getSoLuong() {
        return soLuong;
    }
}
