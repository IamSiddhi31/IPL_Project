package jdbc_ipl_oct_23;

public class Player {

	private int pid;
	private String pname;
	private String category;
	private int runs;
	private int wickets;
	private int catches;
    private String teamName;

	
	public Player() {

	}

	public Player(int pid, String pname, String category, int runs, int wickets, int catches, String teamName) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.category = category;
		this.runs = runs;
		this.wickets = wickets;
		this.catches = catches;
		this.teamName = teamName;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public int getCatches() {
		return catches;
	}

	public void setCatches(int catches) {
		this.catches = catches;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Player: pid=" + pid + ", name=" + pname + ", category=" + category + ", runs=" + runs + ", wickets="
				+ wickets + ", catches=" + catches + ", teamName=" + teamName + "";
	}

	
	
}
