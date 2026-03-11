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
}
