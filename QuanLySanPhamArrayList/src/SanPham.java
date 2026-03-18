public class SanPham {

        String maSP, tenSP;
        double gia;
        int soLuong;

        public SanPham(String maSP, String tenSP, double gia, int soLuong) {
            this.maSP = maSP;
            this.tenSP = tenSP;
            this.gia = gia;
            this.soLuong = soLuong;
        }

        public String getMaSP() { return maSP; }
        public String getTenSP() { return tenSP; }
        public double getGia() { return gia; }
        public int getSoLuong() { return soLuong; }

        @Override
        public String toString() {
            return String.format("%-6s %-15s %-10.2f %-5d",
                    maSP, tenSP, gia, soLuong);
        }
}

