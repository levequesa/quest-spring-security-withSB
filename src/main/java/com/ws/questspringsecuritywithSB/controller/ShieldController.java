package com.ws.questspringsecuritywithSB.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShieldController {
	
	@GetMapping("/")
	public String welcomeShield() {
		return "Welcome the Shield";
	}
	
	@GetMapping("/avengers/assemble")
	public String messageAvengers() {
		return "Avengers....Assemble";
	}
	
	@GetMapping("/secret-bases")
	public List<String> townWS() {
		List<String> townWild = new ArrayList<>();
		townWild.add("Biarritz");
		townWild.add("Biarritz");
		townWild.add("Lille");
		townWild.add("Lyon");
		return townWild.stream()
			.collect(Collectors.toList());
	}
}
