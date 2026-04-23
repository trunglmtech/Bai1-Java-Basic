package thigk2.leminhtrung;

public class Cau1 {

	/**
     * TÓM TẮT CÁCH GIẢI:
     * 1. Sử dụng Scanner để nhận tọa độ x, y của 2 điểm Trên-Trái và Dưới-Phải từ bàn phím.
     * 2. Tính chiều dài và chiều rộng bằng cách lấy trị tuyệt đối hiệu các tọa độ x và y tương ứng:
     * Chiều rộng = |x1 - x2|, Chiều dài = |y1 - y2|.
     * 3. Áp dụng công thức: Chu vi = (Dài + Rộng) * 2; Diện tích = Dài * Rộng.
     * 4. In kết quả ra màn hình.
     */
	
	
	
	
	public static void main(String[] args) {
		System.out.println("--- CHƯƠNG TRÌNH TÍNH CHU VI & DIỆN TÍCH HÌNH CHỮ NHẬT ---");
        
        // Nhập tọa độ góc Trên-Trái
        System.out.print("Nhập tọa độ x1 (Góc Trên-Trái): ");
        double x1 = scanner.nextDouble();
        System.out.print("Nhập tọa độ y1 (Góc Trên-Trái): ");
        double y1 = scanner.nextDouble();

        // Nhập tọa độ góc Dưới-Phải
        System.out.print("Nhập tọa độ x2 (Góc Dưới-Phải): ");
        double x2 = scanner.nextDouble();
        System.out.print("Nhập tọa độ y2 (Góc Dưới-Phải): ");
        double y2 = scanner.nextDouble();

	}

}
