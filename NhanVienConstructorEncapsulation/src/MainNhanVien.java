public class MainNhanVien {
    public static void main(String[] args) {

        NhanVien nv = new NhanVien("1", "Nguyen Van A", 5000000, 4);

        System.out.println("Mã NV: " + nv.getMaNV());
        System.out.println("Họ tên: " + nv.getHoTen());
        System.out.println("Lương: " + nv.tinhLuong());
        System.out.println("Xếp loại: " + nv.xepLoai());
    // Đổi thông tin
    nv.setHoTen("Nguyen Van ABC");
    nv.setLuongCoBan(2000);
        System.out.println("Họ tên: " + nv.getHoTen());
        System.out.println("Lương: " + nv.tinhLuong());
    }
}
