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

     
