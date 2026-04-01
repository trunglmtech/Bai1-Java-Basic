package trunglmtech;

public class Run {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // --- CÂU 2A: TẠO MỚI HỌC SINH (HARDCODE DỮ LIỆU) ---
        System.out.println("--- 2A: KHỞI TẠO CÓ SẴN DỮ LIỆU ---");
        // Cách 1: Dùng hàm tạo không tham số và Setter
        HocSinh hs1 = new HocSinh();
        hs1.setTenHocSinh("Trần Văn A");
        hs1.setTuoiHocSinh(10);
        hs1.setLopHocSinh("8A12");
        // Cách 2: Dùng hàm tạo có tham số
        HocSinh hs2 = new HocSinh("Trần Thị Tươi", 12, "6C");

        System.out.println("Thông tin học sinh 1:\n" + hs1.toString());
        System.out.println("Thông tin học sinh 2:\n" + hs2.toString());

	}

}
