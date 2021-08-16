package com.sab.noumanagerv2;

import com.sab.noumanagerv2.entities.AppRole;
import com.sab.noumanagerv2.entities.AppUser;
import com.sab.noumanagerv2.service.AccountService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Noumanagerv2Application {

	public static void main(String[] args) {
		SpringApplication.run(Noumanagerv2Application.class, args);
	}

	@Bean
	CommandLineRunner start(AccountService aService) {
		return args -> {

			AppRole aRole = aService.loadRoleByName("admin");
			if (aRole == null) {
				System.out.println("___________CREATION ADMIN ROLE __________");
				AppRole admin = new AppRole();
				admin.setRoleName("admin");
				aService.addNewRole(admin);
			}

			AppRole uRole = aService.loadRoleByName("user");
			if (uRole == null) {
				System.out.println("___________CREATION USER ROLE __________");
				AppRole user = new AppRole();
				user.setRoleName("user");
				aService.addNewRole(user);
			}

			AppUser user = aService.loadUserByUsername("admin");

			if (user == null) {
				System.out.println("___________CREATION ADMIN USER __________");
				aService.addNewAdmin();
			}
		};

	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
