package eg2;

public class Team {

	private int teamId;
	private String teamName;
	private String coachName;
	public int getTeamId() {
		return teamId;
	}
	
	public Team(int teamId, String teamName, String coachName) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.coachName = coachName;
	}


	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", coachName=" + coachName + "]";
	}
	
	
	
}
