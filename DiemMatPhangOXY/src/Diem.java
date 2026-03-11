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

}
