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
        
        // --- CÂU 2B: NHẬP DỮ LIỆU TỪ BÀN PHÍM ---
        System.out.println("\n--- 2B: NHẬP HỌC SINH TỪ BÀN PHÍM ---");
        HocSinh hs3 = new HocSinh();
        
        System.out.print("Mời nhập tên của học sinh thứ ba: ");
        hs3.setTenHocSinh(scanner.nextLine());
        
        System.out.print("Mời nhập tuổi của học sinh thứ ba: ");
        // Ép kiểu để tránh lỗi trôi lệnh khi nhập số rồi nhập chuỗi
        hs3.setTuoiHocSinh(Integer.parseInt(scanner.nextLine())); 
        
        System.out.print("Mời nhập lớp của học sinh thứ ba: ");
        hs3.setLopHocSinh(scanner.nextLine());

        System.out.println("Thông tin học sinh 3:\n" + hs3.toString());

	}

}
