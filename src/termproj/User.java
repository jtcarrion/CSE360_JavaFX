package termproj;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
	protected String userType;
	protected String firstName, lastName, dateofbirth, username, password;
	protected int id;
	protected List<PatientMessage> inbox = new ArrayList<PatientMessage>();

	public User() {

	}

	public String getUsername() {
		return username;
	}
//	public void setUsername(String un) {
//		un = firstName.charAt(0) + lastName + dateofbirth.substring(6, 8);
//		username = un;
//	}
//	public void setPassword(String pw) {
//		pw = lastName + firstName + dateofbirth.substring(6, 8);
//		password = pw;
//	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}

//	
	public void addMessage(PatientMessage msg) {
		inbox.add(msg);
	}

	public List<PatientMessage> getInbox() {
		return inbox;
	}
	
	public List<PatientMessage> getInbox(boolean omitSummaries) {
		
		List<PatientMessage> messages = new ArrayList<PatientMessage>();
		
		for(PatientMessage msg : inbox) {
			if(!msg.getSummary()) {
				messages.add(msg);
			} 
		}
		
		System.out.println(messages);
		
		return messages;
	}

	public User(String fName, String lName, String uType, String un, String pass, int identifictationNumber) {// use this constructor
		firstName = fName;
		lastName = lName;
		userType = uType;
		username = un;
		password = pass;
		id = identifictationNumber;
	}

	public String getUserType() {
		return userType;
	}
	public String getPassword() {
		return password;
	}

	public String toString() {
		return firstName + " " + lastName + " ID: " + id;
	}
	public int getID() {//general method for getting id
		return id;
	}
}
