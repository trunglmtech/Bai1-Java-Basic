//Import các lớp
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Baitap3_Nhatkycanhan {

	public static void main(String[] args) {
		// Nhập nội dung
			Scanner sc = new Scanner(System.in);

	        System.out.print("Nhap noi dung nhat ky: ");
	        String noiDung = sc.nextLine();
	    // Ghi nhật ký
	        try {
	            FileWriter fw = new FileWriter("nhatky.txt", true);
	            fw.write(noiDung + "\n");
	            fw.close();

	            System.out.println("Da ghi nhat ky thanh cong");
	        } catch (IOException e) {
	            System.out.println("Loi khi ghi file");
	        }
	}

}
