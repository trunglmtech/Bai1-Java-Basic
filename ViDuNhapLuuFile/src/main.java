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
