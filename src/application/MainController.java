package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class MainController {

	@FXML
	private Label lblstatus;
	
	@FXML
	private TextField txtusername;
	
	@FXML
	private TextField txtpassword;
	
	public void Login(ActionEvent event) throws Exception {
		if (txtusername.getText().equals("user") && txtpassword.getText().equals("pass")) {
			lblstatus.setText("Login success");
			Stage primaryStage = new Stage();
			Parent rootp = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(rootp,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} else {
			lblstatus.setText("Login failed");
		}
	}
}
