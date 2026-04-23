package thigk2.leminhtrung;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class QuanLiSoThuc {
	
	private ArrayList<Double> danhSachSo;

    public QuanLySoThuc() {
        this.danhSachSo = new ArrayList<>();
        
        // Phương thức đọc file từ đường dẫn được cung cấp
        public void docDuLieuTuFile(String duongDan) {
            try {
                File file = new File(duongDan);
                Scanner sc = new Scanner(file);
                while (sc.hasNextDouble()) {
                    danhSachSo.add(sc.nextDouble());
                }
                sc.close();
                
                System.out.println("Đã đọc xong dữ liệu từ file.");
            } catch (FileNotFoundException e) {
                System.out.println("Lỗi: Không tìm thấy file tại " + duongDan);
            }
        }       
    }
}
