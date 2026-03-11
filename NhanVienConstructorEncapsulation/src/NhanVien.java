public class NhanVien {
    private String maNV;
    private String hoTen;
    private double luongCoBan;
    private double heSoLuong;
    // Constructor tham số
    public NhanVien(String maNV, String hoTen, double luongCoBan, double heSoLuong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        // Getter
        public String getMaNV() {
            return maNV;
        }

        public String getHoTen() {
            return hoTen;
        }

        public double getLuongCoBan() {
            return luongCoBan;
        }

        public double getHeSoLuong() {
            return heSoLuong;
        }
}
