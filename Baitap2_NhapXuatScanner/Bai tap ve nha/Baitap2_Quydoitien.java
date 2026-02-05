// Import lớp scanner
import java.util.Scanner;

public class Baitap2_Quydoitien {

	public static void main(String[] args) {
		// Khai báo dữ liệu tỉ giá tiền hiện tại và nhập số tiền cần đổi
			Scanner sc = new Scanner(System.in);

	        double tiGia = 26000;

	        System.out.println("1.USD > VND");
	        System.out.print("Chon kieu quy doi: ");
	        int chon = sc.nextInt();

	        System.out.print("Nhap so tien: ");
	        double soTien = sc.nextDouble();
	   // Xử lý quy đổi
	        	if (chon == 1) {
	            double vnd = soTien * tiGia;
	            System.out.println("So tien sau khi doi: " + vnd + " VND");
	        	} else {
	        	System.out.println("Lua chon khong hop le!");
    }

}
