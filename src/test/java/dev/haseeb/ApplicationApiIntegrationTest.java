package dev.haseeb;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationApiIntegrationTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate template;

	@Test
	public void getReversedIntegration() throws Exception {
		ResponseEntity<String> response = template.getForEntity("http://localhost:" + port + "/api/Hello World",
				String.class);
		assertThat(response.getBody().equals("{\"reversed\":\"World Hello\"}"));
	}
}
