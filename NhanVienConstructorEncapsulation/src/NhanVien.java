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
    }
        // Getter
        public String getMaNV () {
            return maNV;
        }

        public String getHoTen () {
            return hoTen;
        }

        public double getLuongCoBan () {
            return luongCoBan;
        }

        public double getHeSoLuong () {
            return heSoLuong;
        }
        // Setter
        public void setMaNV (String maNV){
            this.maNV = maNV;
        }

        public void setHoTen (String hoTen){
            this.hoTen = hoTen;
        }

        public void setLuongCoBan ( double luongCoBan){
            this.luongCoBan = luongCoBan;
        }

        public void setHeSoLuong ( double heSoLuong){
            this.heSoLuong = heSoLuong;
        }
        // Tính lương
        public double tinhLuong () {
            return luongCoBan * heSoLuong;
        }

        // Xếp loại nhân viên
        public String xepLoai () {
            double luong = tinhLuong();

            if (luong >= 20000000) {
                return "Xuất sắc";
            } else if (luong >= 15000000) {
                return "Tốt";
            } else {
                return "Khá";
            }
    }
}
