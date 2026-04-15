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


