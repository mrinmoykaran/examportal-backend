package com.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.exam.service.UserService;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("Starting code ");
//
//		User user = new User();
//		user.setFirstName("Mrinmoy");
//		user.setLastName("Karan");
//		user.setUsername("karanmrinmoy98");
//		user.setPassword(this.bCryptPasswordEncoder.encode("12345"));
//		user.setPhone("8918523064");
//		user.setEmail("karanmrinmoy98@gmail.com");
//		user.setProfile("default.png");
//
//		Role role = new Role();
//		role.setRoleId(44L);
//		role.setRoleName("ADMIN");
//
//		Set<UserRole> userRoleSet = new HashSet<>();
//
//		UserRole userRole = new UserRole();
//		userRole.setRole(role);
//		userRole.setUser(user);
//		
//		userRoleSet.add(userRole);
//
//		User usr=this.userService.createUser(user, userRoleSet);
//		System.out.println("New user created sucessfully with username "+usr.getUsername());

	}

}
