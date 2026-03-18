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

// Tìm sinh viên có điểm cao nhất
public SinhVien timDiemCaoNhat() {
    if (danhSachSV.isEmpty()) {
        return null;
    }

    SinhVien svCaoNhat = danhSachSV.get(0);
    for (SinhVien sv : danhSachSV) {
        if (sv.getDiemTB() > svCaoNhat.getDiemTB()) {
            svCaoNhat = sv;
        }
    }
    return svCaoNhat;
}

// Tính điểm trung bình của cả lớp
public double tinhDiemTrungBinhLop() {
    if (danhSachSV.isEmpty()) {
        return 0;
    }

    double tong = 0;
    for (SinhVien sv : danhSachSV) {
        tong += sv.getDiemTB();
    }
    return tong / danhSachSV.size();
    }
    // Lọc sinh viên có điểm >= điểm cho trước
    public List<SinhVien> locSinhVienTheoDiem(double diemToiThieu) {
        List<SinhVien> ketQua = new ArrayList<>();
        for (SinhVien sv : danhSachSV) {
            if (sv.getDiemTB() >= diemToiThieu) {
                ketQua.add(sv);
            }
        }
        return ketQua;
    }

    // Sắp xếp theo điểm (giảm dần) - sử dụng thuật toán đơn giản
    public void sapXepTheoDiem() {
        // Sử dụng bubble sort
        for (int i = 0; i < danhSachSV.size() - 1; i++) {
            for (int j = 0; j < danhSachSV.size() - i - 1; j++) {
                if (danhSachSV.get(j).getDiemTB() < danhSachSV.get(j + 1).getDiemTB()) {
                    // Hoán đổi
                    SinhVien temp = danhSachSV.get(j);
                    danhSachSV.set(j, danhSachSV.get(j + 1));
                    danhSachSV.set(j + 1, temp);
                }
            }
        }
    }

}
