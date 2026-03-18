import java.util.ArrayList;
import java.util.Scanner;

public class XuLyDanhSachSo {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> ds = new ArrayList<>();

            System.out.println("Nhập số nguyên (nhập 0 để kết thúc):");
            while (true) {
                int n = sc.nextInt();
                if (n == 0) break;
                ds.add(n);
            }

            System.out.println("Danh sách vừa nhập: " + ds);

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

            // 5. Đảo ngược danh sách (không dùng Collections.reverse)
            ArrayList<Integer> daoNguoc = new ArrayList<>();
            for (int i = ds.size() - 1; i >= 0; i--) {
                daoNguoc.add(ds.get(i));
            }
            System.out.println("Danh sách đảo ngược: " + daoNguoc);
        }
    }

