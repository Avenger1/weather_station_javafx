package application;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {
	
	@FXML
	private Label label;
	
	@FXML
	private void HandleButtonActionToWykresy(ActionEvent e) throws IOException{
		Parent page_wykresy_parent = FXMLLoader.load(getClass().getResource("/weather_station.fxml"));
		Scene page_wykresy = new Scene(page_wykresy_parent);
		Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		app_stage.setScene(page_wykresy);
		app_stage.show();
		
	}
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
