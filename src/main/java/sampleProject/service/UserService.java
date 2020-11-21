package sampleProject.service;

import org.springframework.stereotype.Service;

import sampleProject.model.UserInfo;

@Service
public class UserService {
	public UserInfo getUserInfo() {
		UserInfo userInfo = new UserInfo();
		userInfo.setFirstName("Alice");
		userInfo.setLastName("Z");
		userInfo.setPhone("2060000000");
		userInfo.setUser(null);
		return userInfo;
	}
}
