public class MainSanPham {
    public static void main(String[] args) {
        SanPham sp = new SanPham("1", "Laptop", 150, 1);
        sp.hienThiThongTin();
        System.out.println("\nCập nhật số lượng");
        sp.setSoLuong(5);
        sp.hienThiThongTin();
    }
}
