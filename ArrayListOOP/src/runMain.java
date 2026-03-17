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
    }
}
