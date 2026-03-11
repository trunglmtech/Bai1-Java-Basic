public class MainSanPham {
    public static void main(String[] args) {
        SanPham sp = new SanPham("1", "Laptop", 150, 1);
        sp.hienThiThongTin();
        System.out.println("\nCập nhật số lượng");
        sp.setSoLuong(5);
        sp.hienThiThongTin();
        System.out.println("\n");
        sp.setTenSP("IPHONE 20000 PRO MAX");
        sp.setGia(30000000);
        sp.setSoLuong(9000000);
        sp.hienThiThongTin();
    }
}
