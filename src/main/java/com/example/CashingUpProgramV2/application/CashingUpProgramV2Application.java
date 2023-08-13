package com.example.CashingUpProgramV2.application;

import com.example.CashingUpProgramV2.WeaverApplication;
import com.example.CashingUpProgramV2.service.ControllerService;
import com.example.CashingUpProgramV2.setup.StageReadyEvent;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CashingUpProgramV2Application extends Application {

	@Autowired
	private ControllerService service;

	private ConfigurableApplicationContext context;

	@Override
	public void init() throws Exception {
		this.context = new SpringApplicationBuilder()
				.sources(WeaverApplication.class)
				.run(getParameters().getRaw().toArray(new String[0]));
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		context.publishEvent(new StageReadyEvent(primaryStage));
	}

	@Override
	public void stop() throws Exception {
		this.context.close();
		Platform.exit();
	}
}
