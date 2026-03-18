import java.util.ArrayList;
import java.util.List;

public class QuanLySinhVien {
    private List<SinhVien> danhSachSV;

    public QuanLySinhVien() {
        danhSachSV = new ArrayList<>();
    }

    // Thêm sinh viên - add()
    public void themSinhVien(SinhVien sv) {
        danhSachSV.add(sv);
        System.out.println("Đã thêm: " + sv.getHoTen());
    }

    // Tìm sinh viên theo mã - sử dụng get() và vòng lặp
    public SinhVien timTheoMa(String maSV) {
        for (SinhVien sv : danhSachSV) {
            if (sv.getMaSV().equals(maSV)) {
                return sv;
            }
        }
        return null;
    }
}
