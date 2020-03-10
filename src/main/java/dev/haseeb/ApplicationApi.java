package dev.haseeb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import dev.haseeb.ApplicationUtility.Reversed;

@RestController
public class ApplicationApi {

	@GetMapping("/api/{reverseString}")
	public Reversed reverseString(@PathVariable("reverseString") String reverseString) {
		return ApplicationUtility.reverseString(reverseString);
	}
}
