package com.rahul.crickinfo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.crickinfo.entities.Match;

public interface MatchRepo extends JpaRepository<Match, Integer> {
	
	//match fetch karna chahta hu provide the team name and fetch
	Optional<Match> findByTeamHeading(String teamHeading);

}
