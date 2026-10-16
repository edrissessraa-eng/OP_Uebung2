package Ub2A5;



import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View {
	private Control control;
	private Model model;
	private Label label=new Label("Stand: 0");
	private Button btnPlus=new Button("+1");
	
	public View(Control control, Model model ,Stage stage) {
		this.control=control;
		this.model=model;
		btnPlus.setOnAction(e-> this.control.erhoeheZaehler());
		VBox root=new VBox(10,label,btnPlus);
		root.setAlignment(Pos.CENTER);
		stage.setScene(new Scene(root,200,150));
		stage.show();
	}
	public void aktualiesirung() {
		label.setText("Stand: "+model.getStand());
	}

}
