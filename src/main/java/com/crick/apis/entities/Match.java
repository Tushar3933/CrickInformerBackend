package com.crick.apis.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "crick_match")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;

    private String teamHeading;
    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlTeam;
    private String bowlTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

    @Enumerated
    private MatchStatus status;


    private Date date=new Date();

    public void setMatchStatus() {
        if (this.textComplete.trim().isBlank()) {
            this.status = MatchStatus.LIVE;
        } else {
            this.status = MatchStatus.COMPLETED;
        }
    }

	public void setTeamHeading(String teamsHeading) {
		// TODO Auto-generated method stub
		
	}

	public void setMatchNumberVenue(String matchNumberVenue2) {
		// TODO Auto-generated method stub
		
	}

	public void setBattingTeam(String battingTeam2) {
		// TODO Auto-generated method stub
		
	}

	public void setBattingTeamScore(String score) {
		// TODO Auto-generated method stub
		
	}

	public void setBowlTeam(String bowlTeam2) {
		// TODO Auto-generated method stub
		
	}

	public void setBowlTeamScore(String bowlTeamScore2) {
		// TODO Auto-generated method stub
		
	}

	public void setLiveText(String textLive) {
		// TODO Auto-generated method stub
		
	}

	public void setMatchLink(String matchLink2) {
		// TODO Auto-generated method stub
		
	}

	public void setTextComplete(String textComplete2) {
		// TODO Auto-generated method stub
		
	}

	public Object getMatchId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTeamHeading() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setMatchId(Object matchId2) {
		// TODO Auto-generated method stub
		
	}
}