package mvc_aufgabe1;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AnwendungssystemView {
	private AnwendungssystemControl anwControl;
	private AnwendungssystemModel anwModel;
	private GridPane grid=new GridPane();
	private TextField textfield=new TextField();
	private Button button=new Button("Test");
	
	public AnwendungssystemView(AnwendungssystemControl anwControl,Stage primaryStage, AnwendungssystemModel anwModel) {
		super();
		this.anwControl = anwControl;
		this.anwModel = anwModel;
		primaryStage.setTitle(this.anwModel.getUberschrift());
		
		this.grid.setAlignment(Pos.CENTER);
		this.grid.setHgap(10);
		this.grid.setVgap(10);
		this.grid.setPadding(new Insets(25,25,25,25));
		Scene scene=new Scene(grid,350,150);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		this.initKomponenten();
        this.initListener();
	}
	private void initKomponenten() {
		this.grid.add(textfield, 0, 0);
		this.grid.add(button, 1, 0);
	}
	private void initListener() {
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				// TODO Auto-generated method stub
				anwControl.schreibInDatei(textfield.getText()); 
				
			}
		});
	}
	void zeigInfFenster(String meldung) {
		Alert alert=new Alert(AlertType.INFORMATION);
		alert.setTitle("Information");
		alert.setHeaderText("Meldung");
		alert.setContentText(meldung);;
		alert.showAndWait();
	}
	void zeigFehlerFenster(String meldung) {
		Alert alert= new Alert(AlertType.ERROR);
		alert.setTitle("Fehlermeldung");
		alert.setHeaderText("Fehler");
		alert.setContentText(meldung);
		alert.showAndWait();
	}

}
