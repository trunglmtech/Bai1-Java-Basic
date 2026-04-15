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
