package termproj;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NursePage extends Pages{
	private Scene scene;
	public NursePage() {
		
	}
	@FXML
	private TextField weightTF = null;
	@FXML
	private TextField heightTF = null;
	@FXML
	private TextField bTempTF = null;
	@FXML
	private TextField bPressTF = null;
	@FXML
	private TextArea knownAllergyTA = null;
	@FXML
	private TextArea hcTA = null;
	@FXML
	private Button allergyButton = null;
	@FXML
	private Button hcButton = null;
	
	@FXML
	private Button createPatientButton;
	@FXML
	private TextField fNameTF;
	@FXML 
	private TextField lNameTF;
	@FXML
	private TextField dobTF;
	@FXML
	private TextField emailTF;
	@FXML
	private TextField phoneNumTF;
	@FXML
	private TextField pharmacyTF;
	@FXML
	private TextField insurCompanyTF;
	@FXML 
	private TextField immunizationTF;
	@FXML
	private TextField medicationTF;
	
	@FXML
	public void initialize() {

	}
	
	@FXML
	public void allergyButtonClicked(Event e) {
		knownAllergyTA.setText("Button Click");
	}
	
	public void create(ActionEvent event) throws IOException {
		createPatient();
	}
	
	public void createPatient() {
		String fName = fNameTF.getText();
		String lName = lNameTF.getText();
		String dob = dobTF.getText();
		String email = emailTF.getText();
		String phoneNum = phoneNumTF.getText();
		String pharmacy = pharmacyTF.getText();
		String insurCompany = insurCompanyTF.getText();
		String immunization = immunizationTF.getText();
		String medication = medicationTF.getText();
	}
	/*@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}*/
	
	/*public void setScene() throws IOException{
		scene = FXMLLoader.load(getClass().getResource("NursePane.fxml"));
	}*/
}