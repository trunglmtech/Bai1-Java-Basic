# 📘 Java Basic - Tổng hợp bài tập Java cơ bản

Kho lưu trữ này chứa các project bài tập thực hành ngôn ngữ lập trình Java, từ các phép toán cơ bản đến lập trình hướng đối tượng (OOP) và xử lý luồng dữ liệu (Stream IO).

## 🚀 Hướng dẫn cách chạy các Project

1. Đảm bảo máy tính đã cài đặt **JDK 8+**.
2. Clone kho mã nguồn về máy: `git clone https://github.com/trunglmtech/Bai1-Java-Basic.git`
3. Mở project bằng IDE (Eclipse, IntelliJ IDEA, NetBeans) và chạy file `.java` chứa hàm `main()`.

---

## 📂 Danh sách các Project và Mã nguồn

Dưới đây là danh sách chi tiết các bài tập. **Click vào "Hiển thị Code" để xem trực tiếp mã nguồn.**

### 1. [ArrayListCoBan](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/ArrayListCoBan)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `ArrayListCoBan.java`
```java
import java.util.ArrayList;
import java.util.List;

public class ArrayListCoBan {
    public static void main(String[] args) {
        System.out.println(" ARRAYLIST CƠ BẢN - MINH HỌA CÁC PHƯƠNG THỨC \n");

        // 1. Khai báo ArrayList với Generics
        List<String> danhSachTen = new ArrayList<>();
        // 2. Thêm phần tử - add()
        System.out.println(" THÊM PHẦN TỬ ");
        danhSachTen.add("Nguyễn Văn A");
        danhSachTen.add("Trần Thị B");
        danhSachTen.add("Lê Văn C");
        // Thêm tại vị trí cụ thể - add(index, element)
        danhSachTen.add(1, "Phạm Thị D"); // Chèn vào vị trí 1

        System.out.println("Danh sách sau khi thêm: " + danhSachTen);
        // 3. Lấy kích thước - size()
        System.out.println("\n KÍCH THƯỚC ");
        System.out.println("Số phần tử: " + danhSachTen.size());
        // 4. Truy cập phần tử - get()
        System.out.println("\n TRUY CẬP PHẦN TỬ ");
        System.out.println("Phần tử thứ 0: " + danhSachTen.get(0));
        System.out.println("Phần tử thứ 2: " + danhSachTen.get(2));
        // 5. Cập nhật phần tử - set()
        System.out.println("\n CẬP NHẬT PHẦN TỬ ");
        System.out.println("Trước khi cập nhật: " + danhSachTen.get(1));
        danhSachTen.set(1, "Trần Thị B (Đã đổi tên)");
        System.out.println("Sau khi cập nhật: " + danhSachTen.get(1));
        // 6. Tìm kiếm - contains(), indexOf()
        System.out.println("\n TÌM KIẾM ");
        System.out.println("Có 'Lê Văn C' không? " + danhSachTen.contains("Lê Văn C"));
        System.out.println("Vị trí của 'Lê Văn C': " + danhSachTen.indexOf("Lê Văn C"));
        System.out.println("Vị trí của 'Không tồn tại': " + danhSachTen.indexOf("Không tồn tại"));
        // 7. Xóa phần tử - remove()
        System.out.println("\n XÓA PHẦN TỬ ");
        System.out.println("Trước khi xóa: " + danhSachTen);
        // Xóa theo chỉ số
        String removedByIndex = danhSachTen.remove(0);
        System.out.println("Đã xóa (theo index 0): " + removedByIndex);

        // Xóa theo đối tượng
        boolean removedByObject = danhSachTen.remove("Lê Văn C");
        System.out.println("Xóa 'Lê Văn C' thành công? " + removedByObject);

        System.out.println("Sau khi xóa: " + danhSachTen);

        // 8. Kiểm tra rỗng - isEmpty()
        System.out.println("\n--- KIỂM TRA RỖNG ---");
        System.out.println("Danh sách có rỗng không? " + danhSachTen.isEmpty());
        // 9. Duyệt danh sách
        System.out.println("\n--- DUYỆT DANH SÁCH ---");
        System.out.println("Cách 1: For thông thường");
        for (int i = 0; i < danhSachTen.size(); i++) {
            System.out.println("Vị trí " + i + ": " + danhSachTen.get(i));
        }

        System.out.println("\nCách 2: For-each");
        for (String ten : danhSachTen) {
            System.out.println("Tên: " + ten);
        }

        System.out.println("\nCách 3: ForEach với Lambda (Java 8+)");
        danhSachTen.forEach(ten -> System.out.println("Tên: " + ten));
        // 10. Chuyển đổi sang mảng - toArray()
        System.out.println("\n--- CHUYỂN ĐỔI SANG MẢNG ---");
        String[] mangTen = danhSachTen.toArray(new String[0]);
        System.out.println("Mảng chuyển đổi:");
        for (String ten : mangTen) {
            System.out.println(ten);
        }
        // 11. Xóa toàn bộ - clear()
        System.out.println("\n--- XÓA TOÀN BỘ ---");
        danhSachTen.clear();
        System.out.println("Sau khi clear, kích thước: " + danhSachTen.size());
        System.out.println("Danh sách có rỗng không? " + danhSachTen.isEmpty());
    }
    }
```

</details>

---

### 2. [ArrayListOOP](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/ArrayListOOP)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `runMain.java`
```java
import java.util.ArrayList;
import java.util.Scanner;

public class runMain {
    public static void main(String[] args){
        ArrayList<Integer> dssonguyen = new ArrayList<Integer>();
        Scanner banphim = new Scanner(System.in);

        for(int i = 0 ; i< 10; i++){
            System.out.print("Moi ban nhap phan tu thu " + i + ": ");
            Integer tam = banphim.nextInt();
            dssonguyen.add(tam);

        }
        // b. in ra màn hình
        System.out.print("Danh sach so nguyen la: ");
        for ( Integer x : dssonguyen){
            System.out.print(x + " ");
        }
        // c. kiêểm tra bao số chẵn
        int tam = 0;
        for ( Integer x : dssonguyen){
            if( x % 2 == 0 ) {
                tam++;
            }
        }
        System.out.println("\n");
        System.out.println("Co " + tam + " so chan trong mang ");
        // d. tppmgr cac phan tu
        int temp = 0;
        for ( Integer x : dssonguyen){
            temp += x;
        }
        System.out.println("Tong cac phan tu trong mang la: " + temp + " ");
    }
}
```

</details>

---

### 3. [BaiTapVeNha](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/BaiTapVeNha)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `Baitap3_Nhatkycanhan.java`
```java
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
```

**File:** `Baitap2_Quydoitien.java`
```java
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
```

**File:** `Baitap1_Tinhtiendien.java`
```java
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
```

</details>

---

### 4. [CacPhepToan](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/CacPhepToan)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `Bai3_Cacpheptoan.java`
```java

public class Bai3_Cacpheptoan {

	public static void main(String[] args) {
int a = 3, b = 4;
		
		System.out.println("Tong " +a+" + " +b+ " = " +(a+b));
		System.out.println("Hieu " +a+ " - " +b+ " = " +(a-b));
		System.out.println("Tich " +a+ " x " +b+ " = " +(a*b));
		System.out.println("Thuong " +a+ " : " +b+ " = " +(a/b));


	}

}
```

</details>

---

### 5. [ChuyenDoiNhietDo](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/ChuyenDoiNhietDo)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `Baitap2_Chuyendoinhietdo.java`
```java

public class Baitap2_Chuyendoinhietdo {

	public static void main(String[] args) {
		// Khai báo biến và công thức chuyển
		double celsius = 25.0;
        double fahrenheit = (celsius * 9/5) + 32;
        // In kết quả chuyển đổi
        System.out.println(celsius + "°C = " + fahrenheit + "°F");

	}

}
```

</details>

---

### 6. [DiemMatPhangOXY](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/DiemMatPhangOXY)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `Diem.java`
```java
public class Diem {
    private double x;
    private double y;

    // Constructor mặc định (0,0)
    public Diem() {
        this.x = 0;
        this.y = 0;
    }
    // Constructor có tham số
    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // Getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    // Setter
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    // Tính khoảng cách giữa 2 điểm
    public double tinhKhoangCach(Diem d) {
        return Math.sqrt(Math.pow(this.x - d.x, 2) +
                Math.pow(this.y - d.y, 2));
    }
    // Kiểm tra 2 điểm có trùng nhau không
    public boolean kiemTraTrungNhau(Diem d) {
        return this.x == d.x && this.y == d.y;
    }
    // Trả về điểm đối xứng qua gốc tọa độ
    public Diem doiXungQuaGoc() {
        return new Diem(-this.x, -this.y);
    }
}
```

**File:** `MainDiem.java`
```java
public class MainDiem {
    public static void main(String[] args) {

        Diem d1 = new Diem(3, 4);
        Diem d2 = new Diem(6, 8);
        // Tính khoảng cách
        System.out.println("Khoảng cách: " + d1.tinhKhoangCach(d2));


        // Kiểm tra trùng nhau
        if (d1.kiemTraTrungNhau(d2)) {
            System.out.println("Hai điểm trùng nhau");
        } else {
            System.out.println("Hai điểm không trùng nhau");

        // Điểm đối xứng
            Diem dx = d1.doiXungQuaGoc();
            System.out.println("Điểm đối xứng của d1: (" + dx.getX() + ", " + dx.getY() + ")");
        }
    // Test đổi thông tin
        System.out.print("\n");
    d1.setX(2);
    d1.setY(3);
    System.out.println("Khoảng cách: " + d1.tinhKhoangCach(d2));
    }
}
```

</details>

---

### 7. [GiaiPTBac1](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/GiaiPTBac1)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `Bai3_GiaiPTbac1.java`
```java
import java.util.Scanner;
public class Bai3_GiaiPTbac1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Nhap a: ");
	        double a = sc.nextDouble();

	        System.out.print("Nhap b: ");
	        double b = sc.nextDouble();

	       	  if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phuong trinh vo so nghiem.");
	            } else {
	                System.out.println("Phuong trinh vo nghiem.");
	            }
	        } else {
	            double x = -b / a;
	            System.out.printf("Nghiem x = %.2f%n", x);
	        }

	        sc.close();
	 }
}
```

</details>

---

### 8. [HeThongDatHang](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/HeThongDatHang)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `DonHang.java`
```java
import java.util.List;

public class DonHang {
    String maDH;
    String tenKH;
    List<String> danhSachSanPham;
    double tongTien;
    String ngayDat;

    public DonHang(String maDH, String tenKH, List<String> danhSachSanPham, double tongTien, String ngayDat) {
        this.maDH = maDH;
        this.tenKH = tenKH;
        this.danhSachSanPham = danhSachSanPham;
        this.tongTien = tongTien;
        this.ngayDat = ngayDat;
    }

    @Override
    public String toString() {
        return String.format("MaDH: %s | KH: %s | SanPham: %s | TongTien: %.2f | Ngay: %s",
                maDH, tenKH, danhSachSanPham, tongTien, ngayDat);
    }

}
```

**File:** `MainHeThong.java`
```java
import java.util.Arrays;
public class MainHeThong {


        public static void main(String[] args) {
            QuanLyDonHang ql = new QuanLyDonHang();

            // Thêm vài đơn hàn
            ql.them(new DonHang("DH01", "Nguyen Van A",
                    Arrays.asList("Ao", "Quan"), 300, "2026-03-01"));
            ql.them(new DonHang("DH02", "Tran Thi B",
                    Arrays.asList("Mu", "Giay"), 150, "2026-03-03"));
            ql.them(new DonHang("DH03", "Nguyen Van A",
                    Arrays.asList("Ao", "Mu"), 200, "2026-03-02"));

            System.out.println("Danh sách đơn hàng ");
            ql.hienThi();

            System.out.println("\nĐơn hàng có giá trị cao nhất ");
            System.out.println(ql.donHangCaoNhat());

            System.out.println("\nThống kê đơn hàng theo khách hàng ");
            ql.thongKeTheoKH();

            System.out.println("\nTổng doanh thu ");
            System.out.println(ql.tongDoanhThu());

            System.out.println("\n Sắp xếp đơn hàng theo ngày ");
            ql.sapXepTheoNgay();
            ql.hienThi();
        }
}

```

**File:** `QuanLyDonHang.java`
```java
import java.util.ArrayList;
import java.util.List;

public class QuanLyDonHang {
    List<DonHang> ds = new ArrayList<>();

    // Thêm đơn hàng
    public void them(DonHang dh) {
        ds.add(dh);
    }

    // Tìm đơn hàng có giá trị cao nhất
    public DonHang donHangCaoNhat() {
        if (ds.isEmpty()) return null;
        DonHang max = ds.get(0);
        for (DonHang dh : ds) {
            if (dh.tongTien > max.tongTien) {
                max = dh;
            }
        }
        return max;
    }

    // Thống kê số lượng đơn hàng theo khách hàng
    public void thongKeTheoKH() {
        List<String> danhSachKH = new ArrayList<>();
        for (DonHang dh : ds) {
            if (!danhSachKH.contains(dh.tenKH)) danhSachKH.add(dh.tenKH);
        }

        for (String kh : danhSachKH) {
            int count = 0;
            for (DonHang dh : ds) {
                if (dh.tenKH.equals(kh)) count++;
            }
            System.out.println(kh + ": " + count + " đơn hàng");
        }
    }

    // Tính tổng doanh thu
    public double tongDoanhThu() {
        double tong = 0;
        for (DonHang dh : ds) {
            tong += dh.tongTien;
        }
        return tong;
    }

    // Sắp xếp đơn hàng theo ngày (tăng dần)
    public void sapXepTheoNgay() {
        for (int i = 0; i < ds.size() - 1; i++) {
            for (int j = 0; j < ds.size() - i - 1; j++) {
                if (ds.get(j).ngayDat.compareTo(ds.get(j + 1).ngayDat) > 0) {
                    DonHang temp = ds.get(j);
                    ds.set(j, ds.get(j + 1));
                    ds.set(j + 1, temp);
                }
            }
        }
    }

    // Hiển thị tất cả đơn hàng
    public void hienThi() {
        if (ds.isEmpty()) {
            System.out.println("Chưa có đơn hàng nào!");
            return;
        }
        for (DonHang dh : ds) {
            System.out.println(dh);
        }
    }
}
```

</details>

---

### 9. [HinhVeDonGian](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/HinhVeDonGian)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `Bai2_Hinhvedongian.java`
```java

public class Bai2_Hinhvedongian {

	public static void main(String[] args) {
		System.out.println("    *	");
		System.out.println("   ***	");
		System.out.println("  *****	");
		System.out.println(" *******");

	}

}
```

</details>

---

### 10. [JavaHienDai](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/JavaHienDai)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `Bai4_Javahiendai.java`
```java

public class Bai4_Javahiendai {

	public static void main(String[] args) {

        var message = "Hello, World with var!";
        var number = 42;
        var list = java.util.List.of("Java", "Modern", "Features");
        
        System.out.println(message);
        System.out.println("Number: " + number);
        System.out.println("List: " + list);

	}

}
```

</details>

---

### 11. [KhaiBaoTinhToan](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/KhaiBaoTinhToan)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `Baitap1_Khaibaotinhtoan.java`
```java

public class Baitap1_Khaibaotinhtoan {

	public static void main(String[] args) {
		// 1. Khai báo các biến
		int a = 15;
        int b = 4;
        double c = 3.5;
        // 2. Tính toán
        int tong = a + b;
        double thuong = a / c;
        int phanDu = a ;
        // 3. In kết quả tính
        System.out.println("Tổng: " + tong);
        System.out.println("Thương: " + thuong);
        System.out.println("Phần dư: " + phanDu);
	}

}
```

</details>

---

### 12. [NhanVienConstructorEncapsulation](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/NhanVienConstructorEncapsulation)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `MainNhanVien.java`
```java
public class MainNhanVien {
    public static void main(String[] args) {

        NhanVien nv = new NhanVien("1", "Nguyen Van A", 5000000, 4);

        System.out.println("Mã NV: " + nv.getMaNV());
        System.out.println("Họ tên: " + nv.getHoTen());
        System.out.println("Lương: " + nv.tinhLuong());
        System.out.println("Xếp loại: " + nv.xepLoai());
    // Đổi thông tin
    nv.setHoTen("Nguyen Van ABC");
    nv.setLuongCoBan(2000);
        System.out.println("Họ tên: " + nv.getHoTen());
        System.out.println("Lương: " + nv.tinhLuong());
    }
}
```

**File:** `NhanVien.java`
```java
public class NhanVien {
    private String maNV;
    private String hoTen;
    private double luongCoBan;
    private double heSoLuong;
    // Constructor tham số
    public NhanVien(String maNV, String hoTen, double luongCoBan, double heSoLuong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }
        // Getter
        public String getMaNV () {
            return maNV;
        }

        public String getHoTen () {
            return hoTen;
        }

        public double getLuongCoBan () {
            return luongCoBan;
        }

        public double getHeSoLuong () {
            return heSoLuong;
        }
        // Setter
        public void setMaNV (String maNV){
            this.maNV = maNV;
        }

        public void setHoTen (String hoTen){
            this.hoTen = hoTen;
        }

        public void setLuongCoBan ( double luongCoBan){
            this.luongCoBan = luongCoBan;
        }

        public void setHeSoLuong ( double heSoLuong){
            this.heSoLuong = heSoLuong;
        }
        // Tính lương
        public double tinhLuong () {
            return luongCoBan * heSoLuong;
        }

        // Xếp loại nhân viên
        public String xepLoai () {
            double luong = tinhLuong();

            if (luong >= 20000000) {
                return "Xuất sắc";
            } else if (luong >= 15000000) {
                return "Tốt";
            } else {
                return "Khá";
            }
    }
}
```

</details>

---

### 13. [OOP Sinh viên](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/OOP%20Sinh%20viên)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `Chuongtrinhchinh.java`
```java

public class Chuongtrinhchinh {

	public static void main(String[] args) {
		// Tạo mới 1 sinh viên
		Sinhvien sv1 = new Sinhvien();
		// cấp/gán dữ liệu cụ thể
				sv1.mssv="66112233";
				sv1.ten="Phan Thị";
				sv1.tuoi=18;
				sv1.hocBai("Lập trình Java");
	}

}
```

**File:** `Sinhvien.java`
```java

public class Sinhvien {

	
		// Định nghĩa các thuộc tính
		String ten;
		String mssv;
		int tuoi;
		// Định nghĩa các phương thức / hàm
			void hocBai(String monhoc) {
			System.out.print("Bạn " + ten + " đang học môn " + monhoc);
		}
	}


```

</details>

---

### 14. [QuanLiSinhVien](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/QuanLiSinhVien)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `Baitap3_QuanlySVFile.java`
```java
// Import các lớp
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Baitap3_QuanlySVFile {

	public static void main(String[] args) {
		// Nhập thông tin các môn
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== NHẬP THÔNG TIN SINH VIÊN ===");
        System.out.print("Mã sinh viên: ");
        String id = scanner.nextLine();
        
        System.out.print("Họ tên: ");
        String name = scanner.nextLine();
        
        System.out.print("Điểm Toán: ");
        double math = scanner.nextDouble();
        
        System.out.print("Điểm Lý: ");
        double physics = scanner.nextDouble();
        
        System.out.print("Điểm Hóa: ");
        double chemistry = scanner.nextDouble();
        
        double average = (math + physics + chemistry) / 3;
        
        // Ghi vào file và in ra
        try {
            FileWriter writer = new FileWriter("students.txt", true);
            writer.write("=== SINH VIÊN ===\n");
            writer.write("Mã SV: " + id + "\n");
            writer.write("Họ tên: " + name + "\n");
            writer.write(String.format("Điểm Toán: %.1f\n", math));
            writer.write(String.format("Điểm Lý: %.1f\n", physics));
            writer.write(String.format("Điểm Hóa: %.1f\n", chemistry));
            writer.write(String.format("Điểm TB: %.2f\n", average));
            writer.write("=================\n\n");
            writer.close();
            
            System.out.println("\nĐã lưu thông tin vào file students.txt");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
        
        scanner.close();

	}

}
```

</details>

---

### 15. [QuanLyHocSinh](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/QuanLyHocSinh)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `HocSinh.java`
```java
package trunglmtech;

public class HocSinh {
	
	    // Khai báo các thuộc tính private
	    private String tenHocSinh;
	    private int tuoiHocSinh; 
	    private String lopHocSinh;

	    // Hàm tạo (Constructor) không tham số
	    public HocSinh() {
	    }

	    // Hàm tạo (Constructor) có đầy đủ tham số
	    public HocSinh(String tenHocSinh, int tuoiHocSinh, String lopHocSinh) {
	        this.tenHocSinh = tenHocSinh;
	        this.tuoiHocSinh = tuoiHocSinh;
	        this.lopHocSinh = lopHocSinh;
	    }

	    // --- Các phương thức Getters và Setters ---
	    public String getTenHocSinh() {
	        return tenHocSinh;
	    }

	    public void setTenHocSinh(String tenHocSinh) {
	        this.tenHocSinh = tenHocSinh;
	    }

	    public int getTuoiHocSinh() {
	        return tuoiHocSinh;
	    }

	    public void setTuoiHocSinh(int tuoiHocSinh) {
	        this.tuoiHocSinh = tuoiHocSinh;
	    }

	    public String getLopHocSinh() {
	        return lopHocSinh;
	    }

	    public void setLopHocSinh(String lopHocSinh) {
	        this.lopHocSinh = lopHocSinh;
	    }

	    // Tùy biến phương thức toString() để in ra thông tin đẹp mắt
	    @Override
	    public String toString() {
	        String chuoiXuat = "Họ và tên: " + tenHocSinh + "\n" +
	                           "Tuổi: " + tuoiHocSinh + "\n" +
	                           "Lớp: " + lopHocSinh;
	        return chuoiXuat;
	    }
	}

```

**File:** `Run.java`
```java
package trunglmtech;
import java.util.ArrayList;
import java.util.Scanner;

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
        
        // --- CÂU 3: NHẬP DANH SÁCH N HỌC SINH (ARRAYLIST) ---
        System.out.println("\n--- 3: NHẬP DANH SÁCH ARRAYLIST ---");
        ArrayList<HocSinh> danhSachHocSinh = new ArrayList<>();
        
        System.out.print("Nhập số lượng học sinh n = ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println("Mời nhập thông tin học sinh thứ " + i + ":");
            HocSinh tam = new HocSinh(); // Khởi tạo học sinh tạm

            System.out.print("Nhập tên: ");
            tam.setTenHocSinh(scanner.nextLine());

            System.out.print("Nhập tuổi: ");
            tam.setTuoiHocSinh(Integer.parseInt(scanner.nextLine()));

            System.out.print("Nhập lớp: ");
            tam.setLopHocSinh(scanner.nextLine());

            // Đưa đối tượng học sinh vào danh sách
            danhSachHocSinh.add(tam);
        }
        
        // In danh sách ra màn hình
        System.out.println("\nDanh sách học sinh vừa nhập:");
        for (int i = 0; i < danhSachHocSinh.size(); i++) {
            System.out.println(danhSachHocSinh.get(i).toString());
            System.out.println("--------------------");
        }
        
        // --- CÂU 4: THÊM 1 HỌC SINH MỚI VÀO DANH SÁCH ---
        System.out.println("\n--- 4: THÊM HỌC SINH VÀO DANH SÁCH ---");
        HocSinh hsThem = new HocSinh();
        System.out.print("Nhập tên học sinh cần thêm: ");
        hsThem.setTenHocSinh(scanner.nextLine());
        System.out.print("Nhập tuổi: ");
        hsThem.setTuoiHocSinh(Integer.parseInt(scanner.nextLine()));
        System.out.print("Nhập lớp: ");
        hsThem.setLopHocSinh(scanner.nextLine());

        danhSachHocSinh.add(hsThem); // Thêm vào danh sách
        
        // --- CÂU 5: XÓA HỌC SINH TÊN "Hoa" ---
        System.out.println("\n--- 5: XÓA HỌC SINH TÊN 'Hoa' ---");
        for (int i = 0; i < danhSachHocSinh.size(); i++) {
            HocSinh hsTim = danhSachHocSinh.get(i); // Lấy học sinh thứ i ra để kiểm tra
            
            // Nếu tên của học sinh bằng "Hoa"
            if (hsTim.getTenHocSinh().equals("Hoa")) {
                danhSachHocSinh.remove(hsTim); // Xóa khỏi danh sách
                System.out.println("Đã xóa học sinh tên Hoa đầu tiên tìm thấy.");
                break; // Thoát vòng lặp ngay lập tức 
            }
            
            
         // CÂU 5b: In lại danh sách để kiểm tra kết quả cuối cùng
            System.out.println("\nDanh sách sau khi xử lý:");
            for (HocSinh hs : danhSachHocSinh) {
                System.out.println(hs.toString());
                System.out.println("--------------------");
            }
        }

	}

}
```

</details>

---

### 16. [QuanLySanPhamArrayList](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/QuanLySanPhamArrayList)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `MainQuanLySanPham.java`
```java
public class MainQuanLySanPham {
    public static void main(String[] args) {
        QuanLySanPham ql = new QuanLySanPham();

        ql.them(new SanPham("SP1", "Ao", 100, 5));
        ql.them(new SanPham("SP2", "Quan", 200, 20));
        ql.them(new SanPham("SP3", "Mu", 50, 8));

        System.out.println("Danh sách:");
        ql.hienThi();

        System.out.println("\nTìm 'a':");
        ql.tim("m");

        System.out.println("\nSắp xếp tăng:");
        ql.sapXepTang();
        ql.hienThi();

        System.out.println("\nTổng kho: " + ql.tongGiaTri());

        System.out.println("\nSắp hết hàng:");
        ql.sapHetHang();
    }
}
```

**File:** `QuanLySanPham.java`
```java
import java.util.ArrayList;
import java.util.List;

public class QuanLySanPham {
    List<SanPham> ds = new ArrayList<>();

    // Thêm
    public void them(SanPham sp) {
        ds.add(sp);
    }

    // Xóa theo mã
    public void xoa(String ma) {
        ds.removeIf(sp -> sp.getMaSP().equals(ma));
    }

    // Tìm gần đúng theo tên
    public void tim(String ten) {
        ds.stream()
                .filter(sp -> sp.getTenSP().toLowerCase().contains(ten.toLowerCase()))
                .forEach(System.out::println);
    }

    // Sắp xếp tăng dần
    public void sapXepTang() {
        for (int i = 0; i < ds.size() - 1; i++) {
            for (int j = 0; j < ds.size() - i - 1; j++) {
                if (ds.get(j).getGia() > ds.get(j + 1).getGia()) {
                    // Hoán đổi 2 sản phẩm
                    SanPham temp = ds.get(j);
                    ds.set(j, ds.get(j + 1));
                    ds.set(j + 1, temp);
                }
            }
        }
    }

    public void sapXepGiam() {
        for (int i = 0; i < ds.size() - 1; i++) {
            for (int j = 0; j < ds.size() - i - 1; j++) {
                if (ds.get(j).getGia() < ds.get(j + 1).getGia()) {
                    // Hoán đổi 2 sản phẩm
                    SanPham temp = ds.get(j);
                    ds.set(j, ds.get(j + 1));
                    ds.set(j + 1, temp);
                }
            }
        }
    }

    // Tổng giá trị kho
    public double tongGiaTri() {
        return ds.stream()
                .mapToDouble(sp -> sp.getGia() * sp.getSoLuong())
                .sum();
    }

    // Sắp hết hàng <10
    public void sapHetHang() {
        ds.stream()
                .filter(sp -> sp.getSoLuong() < 10)
                .forEach(System.out::println);
    }

    // Hiển thị
    public void hienThi() {
        System.out.println("MaSP  TenSP           Gia        SL");
        ds.forEach(System.out::println);
    }
}
```

**File:** `SanPham.java`
```java
public class SanPham {

        String maSP, tenSP;
        double gia;
        int soLuong;

        public SanPham(String maSP, String tenSP, double gia, int soLuong) {
            this.maSP = maSP;
            this.tenSP = tenSP;
            this.gia = gia;
            this.soLuong = soLuong;
        }

        public String getMaSP() { return maSP; }
        public String getTenSP() { return tenSP; }
        public double getGia() { return gia; }
        public int getSoLuong() { return soLuong; }

        @Override
        public String toString() {
            return String.format("%-6s %-15s %-10.2f %-5d",
                    maSP, tenSP, gia, soLuong);
        }

}

```

</details>

---

### 17. [QuyDoiTienTe](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/QuyDoiTienTe)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `Bai2_QuyDoiTienTe.java`
```java
import java.util.Scanner;

public class Bai2_QuyDoiTienTe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TY_GIA_USD = 23500;
        final int TY_GIA_EUR = 27000;

        System.out.println("1. USD -> VND");
        System.out.println("2. EUR -> VND");
        System.out.print("Chon: ");
        int choice = sc.nextInt();

        System.out.print("Nhap so tien: ");
        int soTien = sc.nextInt();   

        int vnd;

        if (choice == 1) {
            vnd = soTien * TY_GIA_USD;
        } else if (choice == 2) {
            vnd = soTien * TY_GIA_EUR;
        } else {
            System.out.println("Lua chon khong hop le!");
            sc.close();
            return;
        }

        System.out.println("So tien quy doi: " + vnd + " VND");

        sc.close();
    }
}
```

</details>

---

### 18. [SanPhamVoiEncapsulation](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/SanPhamVoiEncapsulation)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `MainSanPham.java`
```java
public class MainSanPham {
    public static void main(String[] args) {
        SanPham sp = new SanPham("1", "Laptop", 150, 1);
        sp.hienThiThongTin();
        System.out.println("\nCập nhật số lượng");
        sp.setSoLuong(5);
        sp.hienThiThongTin();
        System.out.println("\n");
        sp.setTenSP("IPHONE 20000 PRO MAX");
        sp.setGia(30000000);
        sp.setSoLuong(9000000);
        sp.hienThiThongTin();
    }
}
```

**File:** `SanPham.java`
```java
public class SanPham {
    private String maSP;
    private String tenSP;
    private double gia;
    private int soLuong;
    // Constructor mặc định
    public SanPham() {
        this.maSP = "Chưa có";
        this.tenSP = "Chưa rõ";
        this.gia = 1;
        this.soLuong = 0;
    }
    // Constructor có tham số
    public SanPham(String maSP, String tenSP, double gia, int soLuong) {
        setMaSP(maSP);
        setTenSP(tenSP);
        setGia(gia);
        setSoLuong(soLuong);
    }
    // Getter
    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getGia() {
        return gia;
    }

    public int getSoLuong() {
        return soLuong;
    }
    // Setter valid
    public void setMaSP(String maSP) {
        if (maSP != null && !maSP.trim().isEmpty()) {
            this.maSP = maSP;
        } else {
            System.out.println("Mã sản phẩm không được rỗng!");
        }
    }

    public void setTenSP(String tenSP) {
        if (tenSP != null && !tenSP.trim().isEmpty()) {
            this.tenSP = tenSP;
        } else {
            System.out.println("Tên sản phẩm không hợp lệ!");
        }
    }

    public void setGia(double gia) {
        if (gia > 0) {
            this.gia = gia;
        } else {
            System.out.println("Giá phải > 0!");
        }
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Số lượng phải ≥ 0!");
        }
    }
    // Tính thành tiền
    public double tinhThanhTien() {
        return gia * soLuong;
    }

    // Hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Mã SP: " + maSP);
        System.out.println("Tên SP: " + tenSP);
        System.out.println("Giá: " + gia);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Thành tiền: " + tinhThanhTien());
    }
}
```

</details>

---

### 19. [SayHello](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/SayHello)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `SayHelloApp.java`
```java

public class SayHelloApp {

	public static void main(String[] args) {
		System.out.println("Xin chao cac ban");

	}

}
```

</details>

---

### 20. [SinhVienArrayList](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/SinhVienArrayList)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `MainQuanLySinhVien.java`
```java
import java.util.List;

public class MainQuanLySinhVien {
    public static void main(String[] args) {
        System.out.println("=== HỆ THỐNG QUẢN LÝ SINH VIÊN VỚI ARRAYLIST ===\n");

        QuanLySinhVien qlsv = new QuanLySinhVien();

        // Thêm sinh viên
        qlsv.themSinhVien(new SinhVien("SV001", "Nguyễn Văn A", 8.5));
        qlsv.themSinhVien(new SinhVien("SV002", "Trần Thị B", 7.2));
        qlsv.themSinhVien(new SinhVien("SV003", "Lê Văn C", 6.8));
        qlsv.themSinhVien(new SinhVien("SV004", "Phạm Thị D", 9.1));
        qlsv.themSinhVien(new SinhVien("SV005", "Hoàng Văn E", 5.5));

        // Hiển thị danh sách
        qlsv.hienThiDanhSach();

        // Tìm sinh viên
        System.out.println("\n=== TÌM KIẾM SINH VIÊN ===");
        SinhVien sv = qlsv.timTheoMa("SV003");
        System.out.println("Tìm SV003: " + (sv != null ? sv : "Không tìm thấy"));

        // Tìm điểm cao nhất
        System.out.println("\n=== SINH VIÊN ĐIỂM CAO NHẤT ===");
        SinhVien svCaoNhat = qlsv.timDiemCaoNhat();
        System.out.println(svCaoNhat != null ? svCaoNhat : "Không có sinh viên");

        // Tính điểm trung bình lớp
        System.out.println("\n=== ĐIỂM TRUNG BÌNH LỚP ===");
        System.out.printf("Điểm TB lớp: ");

                // Lọc sinh viên
                System.out.println("\n=== SINH VIÊN CÓ ĐIỂM >= 8.0 ===");
        List<SinhVien> svGioi = qlsv.locSinhVienTheoDiem(8.0);
        if (!svGioi.isEmpty()) {
            svGioi.forEach(System.out::println);
        } else {
            System.out.println("Không có sinh viên nào đạt điểm >= 8.0");
        }

        // Sắp xếp
        System.out.println("\n=== DANH SÁCH SAU KHI SẮP XẾP (GIẢM DẦN THEO ĐIỂM) ===");
        qlsv.sapXepTheoDiem();
        qlsv.hienThiDanhSach();

        // Xóa sinh viên
        System.out.println("\n=== XÓA SINH VIÊN ===");
        qlsv.xoaSinhVien("SV002");
        qlsv.hienThiDanhSach();

        // Sử dụng subList
        qlsv.hienThiHaiSinhVienDauTien();
    }
}
```

**File:** `QuanLySinhVien.java`
```java
import java.util.ArrayList;
import java.util.List;

// Lớp quản lý sinh viên sử dụng ArrayList
public class QuanLySinhVien {
    private List<SinhVien> danhSachSV;

    public QuanLySinhVien() {
        danhSachSV = new ArrayList<>();
    }

    // Thêm sinh viên - add()
    public void themSinhVien(SinhVien sv) {
        danhSachSV.add(sv);
        System.out.println("Đã thêm: " + sv.getHoTen());
    }

    // Tìm sinh viên theo mã - sử dụng get() và vòng lặp
    public SinhVien timTheoMa(String maSV) {
        for (SinhVien sv : danhSachSV) {
            if (sv.getMaSV().equals(maSV)) {
                return sv;
            }
        }
        return null;
    }

    // Tìm sinh viên có điểm cao nhất
    public SinhVien timDiemCaoNhat() {
        if (danhSachSV.isEmpty()) {
            return null;
        }

        SinhVien svCaoNhat = danhSachSV.get(0);
        for (SinhVien sv : danhSachSV) {
            if (sv.getDiemTB() > svCaoNhat.getDiemTB()) {
                svCaoNhat = sv;
            }
        }
        return svCaoNhat;
    }

    // Tính điểm trung bình của cả lớp
    public double tinhDiemTrungBinhLop() {
        if (danhSachSV.isEmpty()) {
            return 0;
        }

        double tong = 0;
        for (SinhVien sv : danhSachSV) {
            tong += sv.getDiemTB();
        }
        return tong / danhSachSV.size();
    }

    // Lọc sinh viên có điểm >= điểm cho trước
    public List<SinhVien> locSinhVienTheoDiem(double diemToiThieu) {
        List<SinhVien> ketQua = new ArrayList<>();
        for (SinhVien sv : danhSachSV) {
            if (sv.getDiemTB() >= diemToiThieu) {
                ketQua.add(sv);
            }
        }
        return ketQua;
    }

    // Sắp xếp theo điểm (giảm dần) - sử dụng thuật toán đơn giản
    public void sapXepTheoDiem() {
        // Sử dụng bubble sort
        for (int i = 0; i < danhSachSV.size() - 1; i++) {
            for (int j = 0; j < danhSachSV.size() - i - 1; j++) {
                if (danhSachSV.get(j).getDiemTB() < danhSachSV.get(j + 1).getDiemTB()) {
                    // Hoán đổi
                    SinhVien temp = danhSachSV.get(j);
                    danhSachSV.set(j, danhSachSV.get(j + 1));
                    danhSachSV.set(j + 1, temp);
                }
            }
        }
    }

    // Hiển thị toàn bộ sinh viên
    public void hienThiDanhSach() {
        if (danhSachSV.isEmpty()) {
            System.out.println("Danh sách sinh viên trống!");
            return;
        }

        System.out.println("\n=== DANH SÁCH SINH VIÊN ===");
        System.out.println(String.format("%-5s %-10s %-20s %-10s",
                "STT", "Mã SV", "Họ tên", "Điểm TB"));
        System.out.println("=".repeat(50));

        for (int i = 0; i < danhSachSV.size(); i++) {
            SinhVien sv = danhSachSV.get(i);
            System.out.println(String.format("%-5d %-10s %-20s %-10.2f",
                    i + 1, sv.getMaSV(), sv.getHoTen(), sv.getDiemTB()));
        }
    }

    // Xóa sinh viên theo mã - remove()
    public boolean xoaSinhVien(String maSV) {
        for (int i = 0; i < danhSachSV.size(); i++) {
            if (danhSachSV.get(i).getMaSV().equals(maSV)) {
                SinhVien svBiXoa = danhSachSV.remove(i);
                System.out.println("Đã xóa: " + svBiXoa.getHoTen());
                return true;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã: " + maSV);
        return false;
    }

    // Sử dụng subList()
    public void hienThiHaiSinhVienDauTien() {
        if (danhSachSV.size() >= 2) {
            List<SinhVien> subList = danhSachSV.subList(0, 2);
            System.out.println("\nHai sinh viên đầu tiên:");
            subList.forEach(System.out::println);
        }
    }
}
```

**File:** `SinhVien.java`
```java
import java.util.ArrayList;
import java.util.List;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private double diemTB;

    public SinhVien(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    // Getter
    public String getMaSV() { return maSV; }
    public String getHoTen() { return hoTen; }
    public double getDiemTB() { return diemTB; }

    @Override
    public String toString() {
        return String.format("Mã: ");
    }
}
```

</details>

---

### 21. [SinhVienVoiConstructorEncapsulation](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/SinhVienVoiConstructorEncapsulation)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `MainSinhVien.java`
```java
public class MainSinhVien {
    public static void main(String[] args) {
        // Tạo sinh viên với constructor mặc định
        SinhVien sv1 = new SinhVien();
        sv1.setTen("Nguyễn Văn A");
        sv1.setTuoi(20);
        sv1.setMaSV("SV001");
        sv1.setDiemTB(8.5);
        sv1.hienThiThongTin();

        System.out.println("\n---\n");
        // Tạo sinh viên với constructor có tham số
        SinhVien sv2 = new SinhVien("Trần Thị B", 21, "SV002");
        sv2.setDiemTB(7.2);
        sv2.hienThiThongTin();

        System.out.println("\n---\n");
        // Test validation
        SinhVien sv3 = new SinhVien();
        sv3.setTuoi(15);  // Tuổi không hợp lệ
        sv3.setDiemTB(12.5);  // Điểm không hợp lệ
        sv3.setMaSV("ABC123");  // Mã SV không hợp lệ
        // Truy cập thông qua getter
        System.out.println("\nTên sv1: " + sv1.getTen());
        System.out.println("Điểm TB sv2: " + sv2.getDiemTB());
    }
}
```

**File:** `SinhVien.java`
```java
public class SinhVien {
    // Thuộc tính PRIVATE - chỉ truy cập trong lớp
    private String ten;
    private int tuoi;
    private String maSV;
    private double diemTB;
    // Constructor mặc định
    public SinhVien() {
        this.ten = "Chưa có tên";
        this.tuoi = 18;
        this.maSV = "SV000";
        this.diemTB = 0.0;
    }
    // Constructor có tham số
    public SinhVien(String ten, int tuoi, String maSV) {
        this.ten = ten;
        this.setTuoi(tuoi);  // Sử dụng setter để validate
        this.maSV = maSV;
        this.diemTB = 0.0;
    }
    // GETTER - Lấy giá trị thuộc tính
    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getMaSV() {
        return maSV;
    }

    public double getDiemTB() {
        return diemTB;
    }
    // SETTER - Gán giá trị với kiểm tra
    public void setTen(String ten) {
        if (ten != null && !ten.trim().isEmpty()) {
            this.ten = ten;
        } else {
            System.out.println("Tên không hợp lệ");
        }
    }

    public void setTuoi(int tuoi) {
        if (tuoi >= 18 && tuoi <= 50) {
            this.tuoi = tuoi;
        } else {
            System.out.println("Tuổi phải từ 18 đến 50");
            this.tuoi = 18;  // Giá trị mặc định
        }
    }

    public void setMaSV(String maSV) {
        if (maSV != null && maSV.startsWith("SV")) {
            this.maSV = maSV;
        } else {
            System.out.println("Mã SV phải bắt đầu bằng 'SV'");
        }
    }

    public void setDiemTB(double diemTB) {
        if (diemTB >= 0.0 && diemTB <= 10.0) {
            this.diemTB = diemTB;
        } else {
            System.out.println("Điểm TB phải từ 0.0 đến 10.0!");
        }
    }
    // Phương thức công khai
    public void hienThiThongTin() {
        System.out.println("=== THÔNG TIN SINH VIÊN ===");
        System.out.println("Tên: " + this.ten);
        System.out.println("Tuổi: " + this.tuoi);
        System.out.println("Mã SV: " + this.maSV);
        System.out.println("Điểm TB: " + this.diemTB);
        System.out.println("Xếp loại: " + this.xepLoai());
    }
    // Phương thức private - chỉ dùng nội bộ
    private String xepLoai() {
        if (diemTB >= 8.0) return "Giỏi";
        else if (diemTB >= 6.5) return "Khá";
        else if (diemTB >= 5.0) return "Trung bình";
        else return "Yếu";
    }
}
```

</details>

---

### 22. [TaiKhoanNganHangVoiConstructorOverload](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/TaiKhoanNganHangVoiConstructorOverload)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `MainBanking.java`
```java
public class MainBanking {
        public static void main(String[] args) {

            // Tạo tài khoản với constructor 1
            TaiKhoanNganHang tk1 = new TaiKhoanNganHang("01");
            System.out.println("TK1: " + tk1.getSoTaiKhoan() + " - " + tk1.getTenChuTaiKhoan() + " - Số dư: " + tk1.getSoDu());

            // Tạo tài khoản với constructor 2
            TaiKhoanNganHang tk2 = new TaiKhoanNganHang("02", "Nguyen Van A");
            System.out.println("TK2: " + tk2.getSoTaiKhoan() + " - " + tk2.getTenChuTaiKhoan() + " - Số dư: " + tk2.getSoDu());

            // Tạo tài khoản với constructor 3
            TaiKhoanNganHang tk3 = new TaiKhoanNganHang("03", "Tran Thi B", 1000);
            System.out.println("TK3: " + tk3.getSoTaiKhoan() + " - " + tk3.getTenChuTaiKhoan() + " - Số dư: " + tk3.getSoDu());

            System.out.println("\nThử gửi tiền");
            tk1.guiTien(500);
            tk2.guiTien(1000);

            System.out.println("\nThử rút tiền");
            tk2.rutTien(300);
            tk3.rutTien(1500); // rút quá xem báo gì
            System.out.println("\nSố dư conf lại");
            System.out.println("TK1: " + tk1.getSoDu());
            System.out.println("TK2: " + tk2.getSoDu());
            System.out.println("TK3: " + tk3.getSoDu());

            
        }
    }
```

**File:** `TaiKhoanNganHang.java`
```java
public class TaiKhoanNganHang {
    private String soTaiKhoan;
    private String tenChuTaiKhoan;
    private double soDu;

    // Constructor 1: Chỉ có số tài khoản
    public TaiKhoanNganHang(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = "Chưa xác định";
        this.soDu = 0.0;
    }

    // Constructor 2: Có số tài khoản và tên chủ
    public TaiKhoanNganHang(String soTaiKhoan, String tenChuTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = 0.0;
    }

    // Constructor 3: Đầy đủ thông tin
    public TaiKhoanNganHang(String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = (soDu >= 0) ? soDu : 0.0;
    }
    // Getter/Setter
    public String getSoTaiKhoan() { return soTaiKhoan; }
    public String getTenChuTaiKhoan() { return tenChuTaiKhoan; }
    public double getSoDu() { return soDu; }

    public void setTenChuTaiKhoan(String ten) {
        if (ten != null && ten.length() > 0) {
            this.tenChuTaiKhoan = ten;
        }
    }
    // Phương thức gửi tiền
    public boolean guiTien(double soTien) {
        if (soTien > 0) {
            this.soDu += soTien;
            System.out.println("Gửi tiền thành công! Số dư mới: " + this.soDu);
            return true;
        }
        System.out.println("Số tiền gửi phải > 0!");
        return false;
    }
    // Phương thức rút tiền
    public boolean rutTien(double soTien) {
        if (soTien > 0 && soTien <= this.soDu) {
            this.soDu -= soTien;
            System.out.println("Rút tiền thành công! Số dư mới: " + this.soDu);
            return true;
        }
        System.out.println("Số tiền rút không hợp lệ!");
        return false;
    }
}
```

</details>

---

### 23. [ThayDoiThongDiep](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/ThayDoiThongDiep)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `Bai1_Thaydoithongdiep.java`
```java

public class Bai1_Thaydoithongdiep {

	public static void main(String[] args) {
		System.out.println("Xin chao moi nguoi");
		System.out.println("Toi ten la Le Minh Trung");
		System.out.println("Toi hoc mon Lap trinh Java lop 66.CNTT-2");
		System.out.print("MSSV: 66134203");

	}

}
```

</details>

---

### 24. [TinhBMIScanner](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/TinhBMIScanner)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `Baitap2_TinhchisoBMI.java`
```java
// Import lớp Scanner
import java.util.Scanner;
public class Baitap2_TinhchisoBMI {

	public static void main(String[] args) {
		// Nhập dữ liệu chiều cao cân nặng từ bàn phím và tính toán và in ra
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== TÍNH CHỈ SỐ BMI ===");
        System.out.print("Nhập cân nặng (kg): ");
        double weight = scanner.nextDouble();
        
        System.out.print("Nhập chiều cao (m): ");
        double height = scanner.nextDouble();
        
        double bmi = weight / (height * height);
        
        System.out.printf("PTn=== KẾT QUẢ ===PTn");
        System.out.printf("Cân nặng: PT.1f kgPTn", weight);
        System.out.printf("Chiều cao: PT.2f mPTn", height);
        System.out.printf("Chỉ số BMI: PT.2fPTn", bmi);
        // Điều kiện BMI và in ra kết quả
        if (bmi < 18.5) {
            System.out.println("Phân loại: Thiếu cân");
        } else if (bmi < 25) {
            System.out.println("Phân loại: Bình thường");
        } else if (bmi < 30) {
            System.out.println("Phân loại: Thừa cân");
        } else {
            System.out.println("Phân loại: Béo phì");
        }
        
        scanner.close();
	}

}
```

</details>

---

### 25. [TinhChiSoBMI](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/TinhChiSoBMI)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `Baitap3_TinhchisoBMI.java`
```java

public class Baitap3_TinhchisoBMI {

	public static void main(String[] args) {
		// Khai báo dữ liệu chiều cao cân nặng
		 
        double weight = 65.5;    
        double height = 1.70;    
        
        double bmi = weight / (height * height);
        // In dữ liệu chiều cao cân nặng
        System.out.println("Cân nặng: " + weight + " kg");
        System.out.println("Chiều cao: " + height + " m");
        System.out.println("Chỉ số BMI: " + bmi);
        // Tạo điều kiện in các chỉ số BMI
        if (bmi < 18.5) {
            System.out.println("Phân loại: Thiếu cân");
        } else if (bmi < 25) {
            System.out.println("Phân loại: Bình thường");
        } else if (bmi < 30) {
            System.out.println("Phân loại: Thừa cân");
        } else {
            System.out.println("Phân loại: Béo phì");
        }

	}

}
```

</details>

---

### 26. [TinhLuongTheoGio](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/TinhLuongTheoGio)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `Bai1_Tinhluongtheogio.java`
```java
import java.util.Scanner;
public class Bai1_Tinhluongtheogio {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Nhap gio lam: ");
	        double soGioLam = sc.nextDouble();

	 	        System.out.print("Nhap luong theo gio: ");
	        double luongTheoGio = sc.nextDouble();

	        double tongLuong;

	         if (soGioLam <= 40) {
	            tongLuong = soGioLam * luongTheoGio;
	        } else {
	            double gioThuong = 40;
	            double gioTangCa = soGioLam - 40;
	            tongLuong = gioThuong * luongTheoGio 
	                      + gioTangCa * luongTheoGio * 1.5;
	        }

	       System.out.println("Tong luong: " + tongLuong);

	        sc.close();

	}

}
```

</details>

---

### 27. [TinhTienDien](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/TinhTienDien)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `Baitap4_Tinhtiendien.java`
```java

public class Baitap4_Tinhtiendien {

	public static void main(String[] args) {
			// Khai báo dữ liệu điện
		 int soDien = 250;  // kWh
	     double tienDien = 0;
	     // Điều kiện và tính tiền điện
	     if (soDien <= 50) {
	            tienDien = soDien * 1678;
	        } else if (soDien <= 100) {
	            tienDien = 50 * 1678 + (soDien - 50) * 1734;
	        } else if (soDien <= 200) {
	            tienDien = 50 * 1678 + 50 * 1734 + (soDien - 100) * 2014;
	        } else if (soDien <= 300) {
	            tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (soDien - 200) * 2536;
	        } else {
	            tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (soDien - 300) * 2834;
	        }
	     // In kết quả tiền điện thông tin điện
	     	System.out.println("Số điện: " + soDien + " kWh");
	        System.out.println("Tiền điện: " + tienDien + " đồng");
	        System.out.println("Tiền điện (VND): " + String.format("%,.0f", tienDien) + " đ");

	}

}
```

</details>

---

### 28. [TinhTongHaiSo](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/TinhTongHaiSo)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `Baitap1_Tinhtonghaiso.java`
```java
// Import lớp Scanner
import java.util.Scanner;

public class Baitap1_Tinhtonghaiso {

	public static void main(String[] args) {
		// Nhập dữ liệu từ bàn phím 
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();
        // Tính tổng 2 số và in ra
        double sum = num1 + num2;
        System.out.printf("Tổng của %.2f và %.2f là: %.2f", num1, num2, sum);

        
        scanner.close();
	}

}
```

</details>

---

### 29. [ViDuDocChuoiKeyboardStop](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/ViDuDocChuoiKeyboardStop)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `main.java`
```java
import java.io.*;
public class main {
	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        String str;

        System.out.println("Nhap chuoi (go 'stop' de ket thuc):");

        do {
            str = br.readLine(); 
            System.out.println("Ban vua nhap: " + str);
        } while (!str.equals("stop"));
    }
}
```

</details>

---

### 30. [ViDuNhapLuuFile](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/ViDuNhapLuuFile)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `main.java`
```java
import java.io.*;
public class main {
	 public static void main(String[] args) throws IOException {

	        BufferedReader br = new BufferedReader(
	                new InputStreamReader(System.in));

	        FileWriter fw;

	        try {
	            fw = new FileWriter("test.txt");
	        } catch (IOException e) {
	            System.out.println("Khong mo duoc file!");
	            return;
	        }

	        String str;

	        System.out.println("Nhap du lieu (go 'stop' de dung):");

	        do {
	            System.out.print(": ");
	            str = br.readLine();

	            if (str.equals("stop")) break;

	            fw.write(str + "\n"); 
	        } while (true);

	        fw.close();
	        System.out.println(" ghi file xong");
	    }
}
```

</details>

---

### 31. [ViDuOOP_QLNV_KeThua](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/ViDuOOP_QLNV_KeThua)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `NhanVien.java`
```java


public class NhanVien {
    // thuộc tính
    private String maNV;
    private String hoTen;
    private double luongCoBan;
    // hàm tạo
//	public NhanVien(){

//	}
//	public NhanVien(String maNhanVien, String tenNhanVien, double luognCoBan) {
//		this.maNV = maNhanVien;
//		this.hoTen = tenNhanVien;
//		this.luongCoBan = luongCoBan;
    //}

    public NhanVien(String maNV, String hoTen, double luongCoBan) {
        super();
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }
    public NhanVien() {
        super();
    }
    public double tinhLuong() {
        return luongCoBan;
    }
    @Override
    public String toString() {
        String chuoiXuat= "";
        chuoiXuat = chuoiXuat + "Mã NV: " + this.maNV;
        chuoiXuat = chuoiXuat + " Họ Tên: " + this.hoTen;
        chuoiXuat = chuoiXuat + " Lương cơ bản: " + this.luongCoBan;
        return chuoiXuat;
        //return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
    }
    public void hienThiThongTin() {
        System.out.println("Mã NV: " + maNV);
        System.out.println(" Họ tên: " + hoTen);
        System.out.println(" Lương cơ Bản: " + luongCoBan);
    }
    //cac getter/setter
    public String getMaNV() {
        return maNV;
    }
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public double getLuongCoBan() {
        return luongCoBan;
    }
    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

}
```

**File:** `NhanVienVanPhong.java`
```java
public class NhanVienVanPhong extends NhanVien{
    private double soGioLamThem;
    private double luongThemMoiGio;
    // Hàm tạo
    public NhanVienVanPhong(String maNV, String hoTen, double LuongCoBan, double soGioLamThem, double LuongThemMoiGio) {
        super(maNV, hoTen, LuongCoBan);
        this.soGioLamThem = soGioLamThem;
        this.luongThemMoiGio = luongThemMoiGio;
    }
    @Override
    public double tinhLuong() {
        return super.getLuongCoBan() + soGioLamThem*luongThemMoiGio;
    }
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Số giờ làm thêm: " + soGioLamThem);
        System.out.println("Lương cho mỗi giờ làm thêm: " + luongThemMoiGio);
        System.out.println("Lương được nhận: " + tinhLuong());
    }
    public String toString() {
        String chuoiXuat= super.toString();
        chuoiXuat = chuoiXuat + "\nSố giờ làm thêm: " + soGioLamThem;
        chuoiXuat = chuoiXuat + "\nLương cho mỗi giờ làm thêm: " + luongThemMoiGio;
        chuoiXuat = chuoiXuat + "\nLương được nhận: " + tinhLuong();
        return chuoiXuat;
    }

}
```

**File:** `Run.java`
```java
public class Run {

    public static void main(String[] args) {
        // Test lớp Nhân Viên
        NhanVien nv1 = new NhanVien("001", "Nguyễn ABC", 2300000);
        // nv1.hienThiThongTin();
        System.out.println(nv1.toString());
        NhanVienVanPhong nvVanPhong1 = new NhanVienVanPhong("002", "Lê BCD", 2300000, 3, 200000);
        System.out.println(nvVanPhong1.toString());
        //	nvVanPhong1.hienThiThongTin();
    }

}
```

</details>

---

### 32. [ViDuStreamDocChuoi](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/ViDuStreamDocChuoi)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `ViDuDocStream.java`
```java
package trunglmtech;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;



public class ViDuDocStream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fInput = new FileInputStream("C:\\Users\\Admin\\Desktop\\Bai1-Java-Basic\\ViDuStreamDocChuoi\\src\\trunglmtech\\test.txt");
		InputStreamReader ipReader = new InputStreamReader(fInput);
		BufferedReader bufReader = new BufferedReader(ipReader);
		
		
		
		String line1 = bufReader.readLine();
		System.out.println(line1);
		String line2 = bufReader.readLine();
		System.out.println(line2);
	}

}
```

</details>

---

### 33. [ViDuStreamKetThucDauCham](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/ViDuStreamKetThucDauCham)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `Main.java`
```java

import java.io.*; 
public class Main {

	public static void main(String[] args) throws IOException {
		{
			char c;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Nhap chuoi ky tu, gioi han dau cham.");
			 // read characters
			do
			{
			c = (char) br.read();
			System.out.print(c);
			} while(c != '.');
			} 

	}

}
```

</details>

---

### 34. [XuatPrintWriter](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/XuatPrintWriter)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `main.java`
```java
import java.io.*;
public class main {

	public static void main(String[] args) {
		
		PrintWriter pw = new PrintWriter(System.out, true);

        int i = 10;
        double d = 123.67;
        double r = i + d;

        pw.println("dùng PrintWriter:");
        pw.println("i = " + i);
        pw.println("d = " + d);
        pw.println(i + " + " + d + " = " + r);
    }
}


```

</details>

---

### 35. [XuLyDanhSachSo](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/XuLyDanhSachSo)
<details>
<summary><b>💻 Hiển thị Code</b></summary>

**File:** `XuLyDanhSachSo.java`
```java
import java.util.ArrayList;
import java.util.Scanner;

public class XuLyDanhSachSo {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> ds = new ArrayList<>();

            System.out.print("Nhập số lượng phần tử: ");
            int n = sc.nextInt();

            // Nhập từng phần tử
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập số thứ " + (i + 1) + ": ");
                int x = sc.nextInt();
                ds.add(x);
            }

            System.out.println("\nDanh sách vừa nhập: " + ds);

            // 1. Loại bỏ trùng lặp
            ArrayList<Integer> dsKhongTrung = new ArrayList<>();
            for (Integer x : ds) {
                if (!dsKhongTrung.contains(x)) {
                    dsKhongTrung.add(x);
                }
            }
            System.out.println("Danh sách không trùng lặp: " + dsKhongTrung);

            // 2. Tìm số lớn thứ 2
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            for (int x : dsKhongTrung) {
                if (x > max1) {
                    max2 = max1;
                    max1 = x;
                } else if (x > max2) {
                    max2 = x;
                }
            }
            System.out.println("Số lớn thứ 2: " + max2);

            // 3. Tính trung bình cộng các số chẵn
            int tongChan = 0, demChan = 0;
            for (int x : ds) {
                if (x % 2 == 0) {
                    tongChan += x;
                    demChan++;
                }
            }
            double trungBinhChan = demChan > 0 ? (double) tongChan / demChan : 0;
            System.out.println("Trung bình cộng số chẵn: " + trungBinhChan);

            // 4. Tách danh sách thành 2: số chẵn và số lẻ
            ArrayList<Integer> chan = new ArrayList<>();
            ArrayList<Integer> le = new ArrayList<>();
            for (int x : ds) {
                if (x % 2 == 0) chan.add(x);
                else le.add(x);
            }
            System.out.println("Số chẵn: " + chan);
            System.out.println("Số lẻ: " + le);

            // 5. Đảo ngược danh sách (không dùng Collections.reverse
            ArrayList<Integer> daoNguoc = new ArrayList<>();
            for (int i = ds.size() - 1; i >= 0; i--) {
                daoNguoc.add(ds.get(i));
            }
            System.out.println("Danh sách đảo ngược: " + daoNguoc);
        }
    }

```

</details>

---

