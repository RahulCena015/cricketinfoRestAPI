package com.rahul.crickinfo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.crickinfo.entities.Match;
import com.rahul.crickinfo.services.MatchService;

@RestController
@RequestMapping("/match")
public class MatchController {
	
	@Autowired
	private MatchService matchService;
	
	
	//method to get live matches 
	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatches(){
		return new ResponseEntity<>(matchService.getLiveMatches(),HttpStatus.OK);
	}
	
	//method to get all matches
	@GetMapping
	public ResponseEntity<List<Match>> getAllMatches(){
		return new ResponseEntity<>(matchService.getAllMatches(),HttpStatus.OK);
	}
	
	//method to get points table 
	@GetMapping("/pointstable")
	public ResponseEntity<?> getPointTable(){
		return new ResponseEntity<>(matchService.getPointTable(),HttpStatus.OK);
	}
	
	

}
