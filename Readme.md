# 📘 [BufferedReader - Kết thúc dấu chấm](https://github.com/trunglmtech/Bai1-Java-Basic/tree/main/ViDuStreamKetThucDauCham)
---

## 🚀 Mô tả
Chương trình sử dụng `BufferedReader` để đọc từng ký tự từ bàn phím và kết thúc khi người dùng nhập dấu chấm (`.`).

---

## 💻 Code

```java
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        char c;

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Nhap chuoi ky tu (ket thuc bang dau cham .)");

        do {
            c = (char) br.read();
            System.out.println("Ban vua nhap: " + c);
        } while (c != '.');
    }
}
