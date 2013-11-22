import java.io.Serializable;

import javax.swing.JOptionPane;


public class User implements Serializable {

	private String accountType;
	private String username;
	private String password;
	private int pin;


	//constructor
	public User(String acType, String uName, String pw) {
		accountType = acType;
		username = uName;
		password = pw;
		pin = (int)(Math.random()*10000);
	}
	
	public User(String acType, String uName, String pw, int pin) {
		accountType = acType;
		username = uName;
		password = pw;
		this.pin = pin;
	}
	
	
	
	//setters (mutators)
	public void setAccountType(String acType) {
		accountType = acType;
	}
	
	public void setUserName(String uName) {
		username = uName;
	}
	
	public void setPassword(String pw) {
		password = pw;
	}
	//getters (accessors)
	public String getAccountType() {
		return accountType;
	}
	
	public String getUserName() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "User [accountType=" + accountType + ", username=" + username
				+ ", password=" + password + ", pin=" + pin + "]";
	}
	
	
}
