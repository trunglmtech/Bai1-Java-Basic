public class TaiKhoanNganHang {
    private String soTaiKhoan;
    private String tenChuTaiKhoan;
    private double soDu;

    // Constructor 1: Chỉ có số tài khoản
    public TaiKhoanNganHang(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = "Chưa xác định";
        this.soDu = 0.0;
    }

    // Constructor 2: Có số tài khoản và tên chủ
    public TaiKhoanNganHang(String soTaiKhoan, String tenChuTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = 0.0;
    }

    // Constructor 3: Đầy đủ thông tin
    public TaiKhoanNganHang(String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = (soDu >= 0) ? soDu : 0.0;
    }
}
