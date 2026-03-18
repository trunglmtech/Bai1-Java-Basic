import java.util.Arrays;
public class MainHeThong {


        public static void main(String[] args) {
            QuanLyDonHang ql = new QuanLyDonHang();

            // Thêm vài đơn hàng
            ql.them(new DonHang("DH01", "Nguyen Van A",
                    Arrays.asList("Ao", "Quan"), 300, "2026-03-01"));
            ql.them(new DonHang("DH02", "Tran Thi B",
                    Arrays.asList("Mu", "Giay"), 150, "2026-03-03"));
            ql.them(new DonHang("DH03", "Nguyen Van A",
                    Arrays.asList("Ao", "Mu"), 200, "2026-03-02"));

            System.out.println("Danh sách đơn hàng ");
            ql.hienThi();

            System.out.println("\nĐơn hàng có giá trị cao nhất ");
            System.out.println(ql.donHangCaoNhat());

            System.out.println("\nThống kê đơn hàng theo khách hàng ");
            ql.thongKeTheoKH();

            System.out.println("\nTổng doanh thu ");
            System.out.println(ql.tongDoanhThu());

            System.out.println("\n Sắp xếp đơn hàng theo ngày ");
            ql.sapXepTheoNgay();
            ql.hienThi();
        }
}

