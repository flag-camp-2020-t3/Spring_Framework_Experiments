package sampleProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sampleProject.model.User;
import sampleProject.model.UserInfo;
import sampleProject.service.UserService;

@RestController
public class HomePageRestController {
	/**
	 * This is a Restful Controller example
	 * Notice in onlineShop, this isn't the way we verify a user for log in
	 * 
	 * @see https://www.baeldung.com/spring-controller-vs-restcontroller
	 * @see https://stackoverflow.com/questions/45128662/spring-security-allow-access-only-users-with-specific-username
	 * @see https://spring.io/blog/2013/07/04/spring-security-java-config-preview-method-security/
	 * @author Xinrong
	 */
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/getUserInfo")
	public UserInfo getUserInfo() {
		UserInfo userInfo = userService.getUserInfo();
		return userInfo;
	}
}
