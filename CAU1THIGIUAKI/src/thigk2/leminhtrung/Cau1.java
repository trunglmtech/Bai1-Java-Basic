package thigk2.leminhtrung;
import java.util.Scanner;
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
		Scanner scanner = new Scanner(System.in);
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
        
        
        // Tính toán kích thước
        double chieuRong = Math.abs(x1 - x2);
        double chieuDai = Math.abs(y1 - y2);
        
        // Tính Chu vi và Diện tích
        double chuVi = (chieuDai + chieuRong) * 2;
        double dienTich = chieuDai * chieuRong;
        
        
        // Xuất kết quả
        System.out.println("\n--- KẾT QUẢ ---");
        System.out.printf("Chiều dài: %.2f, Chiều rộng: %.2f\n", chieuDai, chieuRong);
        System.out.printf("Chu vi hình chữ nhật: %.2f\n", chuVi);
        System.out.printf("Diện tích hình chữ nhật: %.2f\n", dienTich);
        
        scanner.close();
	}

}
