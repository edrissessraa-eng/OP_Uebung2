package Ub2A5;

import javafx.stage.Stage;

public class Control {
	private Model model;
	private View view;
	
	public Control(Stage stage) {
		this.model=new Model();
		this.view=new View(this, this.model, stage);
	}
	public void erhoeheZaehler() {
		this.model.erhoehn();
		this.view.aktualiesirung();
	}

}
