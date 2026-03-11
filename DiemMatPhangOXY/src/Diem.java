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

}
