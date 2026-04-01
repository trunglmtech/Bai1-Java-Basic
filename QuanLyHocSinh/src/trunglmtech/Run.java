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

	}

}
