package com.alfinandika.training.microservice2019.authserver;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthserverApplicationTests {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Test
	public void testGeneratePasswordBcrypt() {
		String passwordStaff = "teststaff";
		String bcryptStaff = passwordEncoder.encode(passwordStaff);
		Assert.assertNotNull(bcryptStaff);
		System.out.println("test staff : "+bcryptStaff);

		String passwordManager = "testmanager";
		String bcryptManager = passwordEncoder.encode(passwordManager);
		Assert.assertNotNull(bcryptManager);
		System.out.println("test Manager : "+bcryptManager);
	}

}
