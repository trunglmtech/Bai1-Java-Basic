package trunglmtech;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;

public class HelloJavaFx extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Tạo nút bấm
		Button btn = new Button();
		btn.setText("Say 'Hello World'");
		// Tạo cửa sổ
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		// Màn hình / cảnh hiển thị
		Scene scene = new Scene(root, 300, 250);
		primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
    

    public static void main(String[] args) {
    	launch(args);
    }    
}