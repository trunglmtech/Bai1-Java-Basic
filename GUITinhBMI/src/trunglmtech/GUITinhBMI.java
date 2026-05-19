package trunglmtech;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUITinhBMI extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 1. Khởi tạo các thành phần giao diện cơ bản (Labels, TextFields, Button)
        Label lblHeader = new Label("ỨNG DỤNG TÍNH CHỈ SỐ BMI");
        lblHeader.setStyle("-fx-font-size: 18px; -fx-font-weight: bold; -fx-text-fill: #2c3e50;");

        Label lblWeight = new Label("Nhập cân nặng (kg):");
        TextField txtWeight = new TextField();
        txtWeight.setPromptText("Ví dụ: 65");
        txtWeight.setMaxWidth(200);

        Label lblHeight = new Label("Nhập chiều cao (mét):");
        TextField txtHeight = new TextField();
        txtHeight.setPromptText("Ví dụ: 1.70");
        txtHeight.setMaxWidth(200);

        Button btnCalculate = new Button("Tính BMI");
        btnCalculate.setStyle("-fx-background-color: #3498db; -fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 8px 20px;");

        Label lblResult = new Label("Nhập thông tin và ấn nút để tính.");
        lblResult.setStyle("-fx-font-size: 14px; -fx-text-fill: #7f8c8d;");

        // 2. Định nghĩa sự kiện khi click vào nút "Tính BMI"
        btnCalculate.setOnAction(e -> {
            try {
                // Lấy dữ liệu từ ô nhập và chuyển đổi sang dạng số thực (double)
                double weight = Double.parseDouble(txtWeight.getText());
                double height = Double.parseDouble(txtHeight.getText());

                if (weight <= 0 || height <= 0) {
                    lblResult.setText("Lỗi: Số liệu phải lớn hơn 0!");
                    lblResult.setStyle("-fx-font-size: 14px; -fx-text-fill: #e74c3c; -fx-font-weight: bold;");
                    return;
                }

                // Áp dụng công thức tính BMI cơ bản: BMI = Cân nặng / (Chiều cao * Chiều cao)
                double bmi = weight / (height * height);

                // Đánh giá thể trạng dựa theo thang chuẩn của WHO
                String status = "";
                String colorStyle = "";
                
                if (bmi < 18.5) {
                    status = "Cân nặng thấp (Gầy)";
                    colorStyle = "-fx-text-fill: #e67e22;"; // Màu cam
                } else if (bmi >= 18.5 && bmi < 24.9) {
                    status = "Thể trạng bình thường";
                    colorStyle = "-fx-text-fill: #2ecc71;"; // Màu xanh lá
                } else if (bmi >= 25 && bmi < 29.9) {
                    status = "Thừa cân (Tiền béo phì)";
                    colorStyle = "-fx-text-fill: #e67e22;"; // Màu cam
                } else {
                    status = "Béo phì";
                    colorStyle = "-fx-text-fill: #e74c3c;"; // Màu đỏ
                }

                // Hiển thị kết quả ra nhãn và làm tròn chỉ số tới 2 chữ số thập phân
                lblResult.setText(String.format("BMI của bạn: %.2f\nĐánh giá: %s", bmi, status));
                lblResult.setStyle("-fx-font-size: 15px; -fx-font-weight: bold; " + colorStyle);

            } catch (NumberFormatException ex) {
                // Xử lý lỗi nhập sai định dạng (để trống hoặc nhập chữ cái)
                lblResult.setText("Lỗi: Vui lòng nhập số hợp lệ!");
                lblResult.setStyle("-fx-font-size: 14px; -fx-text-fill: #e74c3c; -fx-font-weight: bold;");
            }
        });

        // 3. Xếp các thành phần giao diện theo chiều dọc (Sử dụng cấu trúc VBox)
        VBox root = new VBox(15); // Khoảng cách giãn giữa các hàng là 15px
        root.setPadding(new Insets(25)); // Đệm lề xung quanh khung 25px
        root.setAlignment(Pos.CENTER);   // Căn lề tất cả các thành phần ra chính giữa khung hình
        
        // Đưa các điều khiển (Controls) vào vùng chứa của VBox
        root.getChildren().addAll(lblHeader, lblWeight, txtWeight, lblHeight, txtHeight, btnCalculate, lblResult);

        // 4. Đặt cấu trúc VBox vào phân cảnh (Scene) và trình diễn trên sân khấu (Stage)
        Scene scene = new Scene(root, 360, 360); // Thiết lập kích thước cửa sổ ứng dụng
        
        primaryStage.setTitle("Công cụ tính BMI đơn giản");
        primaryStage.setScene(scene);
        primaryStage.show(); // Hiển thị ứng dụng
    }

    public static void main(String[] args) {
        launch(args); // Gọi hàm khởi chạy vòng đời JavaFX
    }
}
