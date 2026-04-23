package thigk2.leminhtrung;

public class main {
	
	/**
     * TÓM TẮT CÁCH GIẢI:
     * 1. Sử dụng lớp QuanLySoThuc để quản lý danh sách số thực bằng ArrayList.
     * 2. Gọi phương thức docDuLieuTuFile với đường dẫn tuyệt đối đến Desktop để lấy 80 số.
     * 3. Sử dụng vòng lặp và phương thức get() để in danh sách ra màn hình theo định dạng dễ nhìn.
     * 4. Sử dụng phương thức contains() của ArrayList để kiểm tra sự tồn tại của ngày sinh X.
     */

	public static void main(String[] args) {
	uanLySoThuc quanLy = new QuanLySoThuc();
        
        // ĐƯỜNG DẪN ĐẾN FILE TRÊN DESKTOP CỦA BẠN
        // Giả sử tên file là "dulieu.txt", bạn hãy sửa lại đúng tên file thực tế nhé
        String path = "C:\\Users\\Trung\\Desktop\\dulieu.txt";
        
     // Bước 1: Đọc dữ liệu
        quanLy.docDuLieuTuFile(path);
        
        // Bước 2: In danh sách ra màn hình
        quanLy.xuatDanhSach();
        
        // Bước 3: Kiểm tra giá trị X (Ngày sinh của Trung)
        // Ví dụ ngày sinh là 15, bạn hãy đổi số này đúng với ngày sinh của mình
        double X = 15.0;

	}

}
