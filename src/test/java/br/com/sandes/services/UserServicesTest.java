package br.com.sandes.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(UserServices.class)
public class UserServicesTest {
	
	private UserServices service = new UserServices();
	
	@Test
	@DisplayName("Valida que a mensagem Hello World esta present ao fim do teste")
	void canSeeHelloWorldOnMethod() {
		
		List<String> messages = new ArrayList<>();
		
		messages = service.findAll();
		
		assertNotNull(messages);
		assertEquals(messages, List.of("Hello", "World"));
	}

}
