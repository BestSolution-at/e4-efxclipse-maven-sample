package sample.mvn.app;

import javax.annotation.PostConstruct;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import sample.mvn.lib.HelloWorldHelper;

public class HelloMaven {
	@PostConstruct
	void init(BorderPane p) {
		Button b = new Button("Hello Maven!");
		b.setOnAction(this::handleButtonAction);
		p.setCenter(b);
	}

	void handleButtonAction(ActionEvent e) {
		System.err.println("Action: " + e);
		HelloWorldHelper.helloWorld();
	}
}
