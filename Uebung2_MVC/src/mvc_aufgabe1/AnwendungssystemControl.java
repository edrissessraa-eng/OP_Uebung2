package mvc_aufgabe1;

import javafx.stage.Stage;

public class AnwendungssystemControl {
	private AnwendungssystemView anwView;
	private AnwendungssystemModel anwModel;
	public AnwendungssystemControl(Stage primaryStage) {
		this.anwModel=new AnwendungssystemModel();
		this.anwView = new AnwendungssystemView(this,primaryStage,this.anwModel);
		
	}
	public void schreibInDatei(String text) {
		try {
			this.anwModel.schreibInDatei(text);
			this.anwView.zeigInfFenster("Der Text wurde erfolgreich in die Datei geschrieben");
		} catch (Exception e) {
			// TODO: handle exception
			this.anwView.zeigFehlerFenster("Fehler beim Schreiben in die Datei");
		}
	}

}
