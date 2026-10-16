package neuLernen;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class gride extends Application {
	
		GridPane grid=new GridPane();

		@Override
		public void start(Stage primaryStage) throws Exception {
			// TODO Auto-generated method stub
			TextField textfeld=new TextField();
			Button button=new Button("Speichern");
			Button button2=new Button("Test");
			GridPane grid=new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			
			grid.setPadding(new Insets(10));
			
			grid.add(textfeld, 0, 0);
			grid.add(button, 1, 0);
			grid.add(button2, 3, 0);
			button.setOnAction(e->{
			String eingabe=textfeld.getText();
			try (BufferedWriter bw=new BufferedWriter(new FileWriter("Text.txt"))){
				bw.write(eingabe);
				bw.close();
				Alert alert=new Alert(AlertType.INFORMATION);
				alert.setTitle("INFORMATION");
				alert.setHeaderText("Meldung");
				alert.setContentText("Text wurde gespeichert");
				alert.showAndWait();
			} catch (IOException ex) {
				// TODO: handle exception
				Alert alert=new Alert(AlertType.INFORMATION);
				alert.setTitle("Fehler");
				alert.setHeaderText("Schreibfehler");
				alert.setContentText("Fehler beim Speichern der DAtei");
				alert.showAndWait();
			}
			catch (IllegalArgumentException e2) {
				// TODO: handle exception
				Alert alert=new Alert(AlertType.INFORMATION);
				alert.setTitle("Fehler");
				alert.setHeaderText("Schreibfehler");
				alert.setContentText("Fehler beim Speichern der DAtei");
				alert.showAndWait();
			}
			catch (Exception e2) {
				// TODO: handle exception
				Alert alert=new Alert(AlertType.INFORMATION);
				alert.setTitle("Fehler");
				alert.setHeaderText("Schreibfehler");
				alert.setContentText("Fehler beim Speichern der DAtei");
				alert.showAndWait();
			}
			});
			Scene scene=new Scene(grid,400,150);
			primaryStage.setTitle("Datei speichern Beispiele");
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		public static void main(String[] args) {
			launch(args);
		}
	}

