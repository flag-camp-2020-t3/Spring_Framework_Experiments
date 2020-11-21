package sampleProject.model;

import java.io.Serializable;

public class User implements Serializable {
	public static final long serialVersionUID = 0L;

	private int id;
	private String email;
	private String password;
	private boolean enabled;
	
	// FK:
	// @OneToOne(mappedBy = "user")
	// private UserInfo userInfo; 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}		
}
