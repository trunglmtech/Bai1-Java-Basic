public class MainQuanLySanPham {
    public static void main(String[] args) {
        QuanLySanPham ql = new QuanLySanPham();

        ql.them(new SanPham("SP1", "Ao", 100, 5));
        ql.them(new SanPham("SP2", "Quan", 200, 20));
        ql.them(new SanPham("SP3", "Mu", 50, 8));

        System.out.println("Danh sách:");
        ql.hienThi();

        System.out.println("\nTìm 'a':");
        ql.tim("m");

        System.out.println("\nSắp xếp tăng:");
        ql.sapXepTang();
        ql.hienThi();

        System.out.println("\nTổng kho: " + ql.tongGiaTri());

        System.out.println("\nSắp hết hàng:");
        ql.sapHetHang();
    }
}
