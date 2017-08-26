package sample.mvn.app;

import javax.annotation.PostConstruct;

// This is ok because packag is exported
//import org.eclipse.e4.core.services.adapter.Adapter;

// FIXME Should give a warning/error
//import org.eclipse.fx.core.internal.JUtilLoggerFactory;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import sample.mvn.lib.HelloWorldHelper;
// FIXME Should give a warning/error
//import sample.mvn.lib.internal.InternalAPI;

public class HelloMaven {
//	JUtilLoggerFactory f;
	
	@PostConstruct
	void init(BorderPane p) {
//		Adapter a;
//		InternalAPI i;
		Button b = new Button("Hello Maven!");
		b.setOnAction(this::handleButtonAction);
		p.setCenter(b);
	}

	void handleButtonAction(ActionEvent e) {
		System.err.println("Action: " + e);
		HelloWorldHelper.helloWorld();
	}
}
