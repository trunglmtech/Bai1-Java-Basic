package thigk2.leminhtrung;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	/**
     * TÓM TẮT CÁCH GIẢI:
     * 1. Khởi tạo danh sách ArrayList để quản lý các đối tượng SanPham.
     * 2. Thêm sẵn (hard-code) 3 sản phẩm vào danh sách để kiểm tra hiển thị.
     * 3. Sử dụng Scanner để nhận thêm 1 sản phẩm mới từ bàn phím.
     * 4. Dùng vòng lặp for-each để duyệt và lọc sản phẩm theo loại "Thực phẩm chức năng".
     */
	
	public static void main(String[] args) {
		ArrayList<SanPham> danhSach = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
     // a. Hard-code tạo danh sách 3 sản phẩm ban đầu
        danhSach.add(new SanPham("SP01", "Dầu cá Omega", "Thực phẩm chức năng", 500000));
        danhSach.add(new SanPham("SP02", "Kem chống nắng", "Mỹ phẩm", 250000));
        danhSach.add(new SanPham("SP03", "Vitamin tổng hợp", "Thực phẩm chức năng", 300000));

        System.out.println("--- Danh sách 3 sản phẩm ban đầu ---");
        hienThiDanhSach(danhSach);
        
     // b. Thêm mới một sản phẩm từ bàn phím
        System.out.println("\n--- Nhập thông tin sản phẩm mới ---");
        System.out.print("Mã sản phẩm: ");
        String ma = sc.nextLine();
        System.out.print("Tên sản phẩm: ");
        String ten = sc.nextLine();
        System.out.print("Loại sản phẩm: ");
        String loai = sc.nextLine();
        System.out.print("Giá bán: ");
        double gia = sc.nextDouble();
        
        danhSach.add(new SanPham(ma, ten, loai, gia));
        
     // c. In lại danh sách tất cả sản phẩm
        System.out.println("\n--- Toàn bộ danh sách sản phẩm hiện tại ---");
        hienThiDanhSach(danhSach);

	}

}
