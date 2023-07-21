package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.models.Election;
import com.example.demo.repositories.ElectionRepository;

@Controller
@Repository
public class HomeController {
	@Autowired
	ElectionRepository electionRepository;
	
	@GetMapping("/homepage")
	public String homepage() {
		return "index";
	}
	@GetMapping("/current-election")
	public String currentElec (Model currentElec) {
		electionRepository.findCurrentElection();
		List<Election> list = electionRepository.findCurrentElection();
		currentElec.addAttribute("currentElec", "a");
		return "currentElection";
	}
	@GetMapping("/past-election")
	public String pastElec (Model pastElec) {
		return "pastElection";
	}
}
