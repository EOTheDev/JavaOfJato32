package it.edorta.hello_javafx;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
	Stage palco;
	Button btn;
	Text textView;
	Label titolo;
	
	
    @Override
    public void start(Stage stage) {
//        var javaVersion = SystemInfo.javaVersion();
//        var javafxVersion = SystemInfo.javafxVersion();
//
//        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
//        var scene = new Scene(new StackPane(label), 640, 480);
//        stage.setScene(scene);
//        stage.show();
    	palco=stage;
    	palco.setTitle("Hamilton");
    	btn = new Button("Cliccami!");
    	VBox layout =new VBox();
    	
    	
    	
    	titolo= new Label("Ciao!");
    	layout.getChildren().add(titolo);
    	
    	btn.setOnAction(e->System.out.println("funziona"));
    	btn.setOnAction(e->titolo.setText("Bravo, hai cliccato"));
    	
    	textView=new Text("Hamilton è un musical con musiche, testi e libretto di Lin-Manuel Miranda. Ispirato alla vita di Alexander Hamilton, uno dei padri fondatori degli Stati Uniti, si basa sulla biografia omonima del 2004 dello storico Ron Chernow. È uno dei nove musical su 83 ad aver vinto il Premio Pulitzer per la drammaturgia.");
    	layout.getChildren().add(textView);
    	
    	layout.getChildren().add(btn);
    	Scene primaScena = new Scene(layout, 500, 400);
    	palco.setScene(primaScena);
    	primaScena.getStylesheets().add("style.css");
    	palco.show();
    }

    public static void main(String[] args) {
        launch();
    }

}