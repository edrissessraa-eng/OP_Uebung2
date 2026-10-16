package mvc_aufgabe1;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class AnwendungssystemModel {
	
	public String getUberschrift() {
		return "Hallo";
	}
	public void schreibInDatei(String text) throws Exception{
		BufferedWriter bw=new BufferedWriter(new FileWriter("test.txt"));
		bw.write(text);
		bw.close();
		
	}

}
