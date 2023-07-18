package com.example.CashingUpProgramV2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URL;

@SpringBootApplication
public class CashingUpProgramV2Application extends Application {

	public static void main(String[] args) {
		SpringApplication.run(CashingUpProgramV2Application.class, args);
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setController(new CashingUpProgramV2Controller());
		URL xmlUrl = getClass().getResource("/scenebuilder.fxml");
		loader.setLocation(xmlUrl);
		Parent root = loader.load();
		stage.setScene(new Scene(root));
		stage.show();
	}
}
