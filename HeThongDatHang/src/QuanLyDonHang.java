import java.util.ArrayList;
import java.util.List;

public class QuanLyDonHang {
    List<DonHang> ds = new ArrayList<>();

    // Thêm đơn hàng
    public void them(DonHang dh) {
        ds.add(dh);
    }

    // Tìm đơn hàng có giá trị cao nhất
    public DonHang donHangCaoNhat() {
        if (ds.isEmpty()) return null;
        DonHang max = ds.get(0);
        for (DonHang dh : ds) {
            if (dh.tongTien > max.tongTien) {
                max = dh;
            }
        }
        return max;
    }

    // Thống kê số lượng đơn hàng theo khách hàng
    public void thongKeTheoKH() {
        List<String> danhSachKH = new ArrayList<>();
        for (DonHang dh : ds) {
            if (!danhSachKH.contains(dh.tenKH)) danhSachKH.add(dh.tenKH);
        }

        for (String kh : danhSachKH) {
            int count = 0;
            for (DonHang dh : ds) {
                if (dh.tenKH.equals(kh)) count++;
            }
            System.out.println(kh + ": " + count + " đơn hàng");
        }
    }

    // Tính tổng doanh thu
    public double tongDoanhThu() {
        double tong = 0;
        for (DonHang dh : ds) {
            tong += dh.tongTien;
        }
        return tong;
    }

    // Sắp xếp đơn hàng theo ngày (tăng dần)
    public void sapXepTheoNgay() {
        for (int i = 0; i < ds.size() - 1; i++) {
            for (int j = 0; j < ds.size() - i - 1; j++) {
                if (ds.get(j).ngayDat.compareTo(ds.get(j + 1).ngayDat) > 0) {
                    DonHang temp = ds.get(j);
                    ds.set(j, ds.get(j + 1));
                    ds.set(j + 1, temp);
                }
            }
        }
    }

    // Hiển thị tất cả đơn hàng
    public void hienThi() {
        if (ds.isEmpty()) {
            System.out.println("Chưa có đơn hàng nào!");
            return;
        }
        for (DonHang dh : ds) {
            System.out.println(dh);
        }
    }
}