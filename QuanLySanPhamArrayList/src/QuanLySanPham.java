import java.util.ArrayList;
import java.util.List;

public class QuanLySanPham {
    List<SanPham> ds = new ArrayList<>();

    // Thêm
    public void them(SanPham sp) {
        ds.add(sp);
    }

    // Xóa theo mã
    public void xoa(String ma) {
        ds.removeIf(sp -> sp.getMaSP().equals(ma));
    }

    // Tìm gần đúng theo tên
    public void tim(String ten) {
        ds.stream()
                .filter(sp -> sp.getTenSP().toLowerCase().contains(ten.toLowerCase()))
                .forEach(System.out::println);
    }

    // Sắp xếp tăng dần
    public void sapXepTang() {
        for (int i = 0; i < ds.size() - 1; i++) {
            for (int j = 0; j < ds.size() - i - 1; j++) {
                if (ds.get(j).getGia() > ds.get(j + 1).getGia()) {
                    // Hoán đổi 2 sản phẩm
                    SanPham temp = ds.get(j);
                    ds.set(j, ds.get(j + 1));
                    ds.set(j + 1, temp);
                }
            }
        }
    }

    public void sapXepGiam() {
        for (int i = 0; i < ds.size() - 1; i++) {
            for (int j = 0; j < ds.size() - i - 1; j++) {
                if (ds.get(j).getGia() < ds.get(j + 1).getGia()) {
                    // Hoán đổi 2 sản phẩm
                    SanPham temp = ds.get(j);
                    ds.set(j, ds.get(j + 1));
                    ds.set(j + 1, temp);
                }
            }
        }
    }

    // Tổng giá trị kho
    public double tongGiaTri() {
        return ds.stream()
                .mapToDouble(sp -> sp.getGia() * sp.getSoLuong())
                .sum();
    }

    // Sắp hết hàng <10
    public void sapHetHang() {
        ds.stream()
                .filter(sp -> sp.getSoLuong() < 10)
                .forEach(System.out::println);
    }

    // Hiển thị
    public void hienThi() {
        System.out.println("MaSP  TenSP           Gia        SL");
        ds.forEach(System.out::println);
    }
}
