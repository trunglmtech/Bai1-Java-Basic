import java.util.List;

public class DonHang {
    String maDH;
    String tenKH;
    List<String> danhSachSanPham;
    double tongTien;
    String ngayDat;

    public DonHang(String maDH, String tenKH, List<String> danhSachSanPham, double tongTien, String ngayDat) {
        this.maDH = maDH;
        this.tenKH = tenKH;
        this.danhSachSanPham = danhSachSanPham;
        this.tongTien = tongTien;
        this.ngayDat = ngayDat;
    }

    @Override
    public String toString() {
        return String.format("MaDH: %s | KH: %s | SanPham: %s | TongTien: %.2f | Ngay: %s",
                maDH, tenKH, danhSachSanPham, tongTien, ngayDat);
    }

}
