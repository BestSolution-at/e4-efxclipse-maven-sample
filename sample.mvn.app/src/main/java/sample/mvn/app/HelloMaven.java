package sample.mvn.app;

import javax.annotation.PostConstruct;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class HelloMaven {
	@PostConstruct
	void init(BorderPane p) {
		p.setCenter(new Button("Hello Maven!"));
	}
}
