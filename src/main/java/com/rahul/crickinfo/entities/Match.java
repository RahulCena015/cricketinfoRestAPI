package com.rahul.crickinfo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="cricket_matches")
@Data
public class Match {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int matchId;
	
	private String teamHeading;                 //ex: India Vs Australia, etc
	private String matchNumberVenue;
	private String battingTeam;
	private String battingTeamScore;
	private String bowlTeam;
	private String bowlTeamScore;
	private String liveText;
	private String matchLink;
	private String textComplete;
	private MatchStatus status;
	private Date date=new Date();
	
	//SET THE MATCH STATUS ACCORDING TO TEXTCOMPLETED
	public void setMatchStatus() {
		if(textComplete.isBlank()) {
			this.status=MatchStatus.LIVE;
		} else {
			this.status=MatchStatus.COMPLETED;
		}
	}

}
