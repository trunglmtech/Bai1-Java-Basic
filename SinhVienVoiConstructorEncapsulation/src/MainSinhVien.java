public class MainSinhVien {
    public static void main(String[] args) {
        // Tạo sinh viên với constructor mặc định
        SinhVien sv1 = new SinhVien();
        sv1.setTen("Nguyễn Văn A");
        sv1.setTuoi(20);
        sv1.setMaSV("SV001");
        sv1.setDiemTB(8.5);
        sv1.hienThiThongTin();

        System.out.println("\n---\n");
        // Tạo sinh viên với constructor có tham số
        SinhVien sv2 = new SinhVien("Trần Thị B", 21, "SV002");
        sv2.setDiemTB(7.2);
        sv2.hienThiThongTin();

        System.out.println("\n---\n");
}
