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
    }
}
