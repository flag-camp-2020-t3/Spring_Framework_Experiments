package sampleProject.model;

import java.io.Serializable;

public class UserInfo implements Serializable {
	public static final long serialVersionUID = 0L;

	private int id;
	private String firstName;
	private String lastName;
	private String phone;
	// @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private User user;
	// private Location location;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
}
