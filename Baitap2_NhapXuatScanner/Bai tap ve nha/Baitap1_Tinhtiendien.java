// Import lớp scanner
import java.util.Scanner;

public class Baitap1_Tinhtiendien {

	public static void main(String[] args) {
		// Nhập số điện
			Scanner sc = new Scanner(System.in);

	        System.out.print("Nhap so dien: ");
	        int soDien = sc.nextInt();

	        double tienDien = 0;
	    // Chia bật thang if - else tính tiền điện + dồn
	        if (soDien <= 50) {
	            tienDien = soDien * 1678;
	        } else if (soDien <= 100) {
	            tienDien = 50 * 1678 + (soDien - 50) * 1734;
	        } else if (soDien <= 200) {
	            tienDien = 50 * 1678
	                     + 50 * 1734
	                     + (soDien - 100) * 2014;
	        } else {
	            tienDien = 50 * 1678
	                     + 50 * 1734
	                     + 100 * 2014
	                     + (soDien - 200) * 2536;
	        }
	     // in ra tiền điện
	        System.out.println("Tien dien: " + tienDien + " VND");

	}

}
