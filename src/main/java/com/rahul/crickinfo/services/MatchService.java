package com.rahul.crickinfo.services;

import java.util.List;
import java.util.Map;

import com.rahul.crickinfo.entities.Match;

public interface MatchService {
	
	//Get all matches
	List<Match> getAllMatches();
	
	//get live matches
	List<Match> getLiveMatches();
	
	//get cwc2023 point tables
	List<List<String> >getPointTable();

}
