package thigk2.leminhtrung;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class QuanLiSoThuc {
	
	private ArrayList<Double> danhSachSo;

    public QuanLiSoThuc() {
        this.danhSachSo = new ArrayList<>();
    } 
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
                
             // Phương thức in danh sách (mỗi dòng 10 số)
                public void xuatDanhSach() {
                    System.out.println("--- DANH SÁCH 80 SỐ THỰC ---");
                    for (int i = 0; i < danhSachSo.size(); i++) {
                        System.out.print(danhSachSo.get(i) + "\t");
                        if ((i + 1) % 10 == 0) {
                            System.out.println();
                        }
                    }
                }   
                
             // Phương thức kiểm tra giá trị X có tồn tại không
                public boolean kiemTraTonTai(double x) {
                    return danhSachSo.contains(x);
            }
        }
    

