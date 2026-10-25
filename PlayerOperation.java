package jdbc_ipl_oct_23;

import java.util.ArrayList;
import java.util.List;

public class PlayerOperation {

	PlayersDao dao = new PlayersDao();
	List<Player> teamPlayers = new ArrayList<>();

	public List<Player> getAllPlayers() {

		List<Player> playerList = dao.getAllPlayers();
		return playerList;

	}

	public List<Player> allPlayersGivenTeamName(String teamName) {
		List<Player> playerList = dao.getAllPlayers();

		for (Player p : playerList) {

			if (teamName.equalsIgnoreCase(p.getTeamName())) {
				teamPlayers.add(p);
			}
		}

		return teamPlayers;

	}

	public List<Player> getAllBatters() {
		List<Player> batters = new ArrayList<>();

		for (Player p : dao.getAllPlayers()) {
			if (p.getCategory().equalsIgnoreCase("Batsman")) {
				batters.add(p);
			}
		}

		return batters;
	}

	public List<Player> getAllBatters(String teamName) {
		List<Player> batters = new ArrayList<>();

		for (Player p : dao.getAllPlayers()) {
			if (p.getCategory().equalsIgnoreCase("Batsman") && p.getTeamName().equalsIgnoreCase(teamName)) {
				batters.add(p);
			}
		}

		return batters;
	}

	public List<Player> getAllBowlers() {
		List<Player> bowlers = new ArrayList<>();

		for (Player p : dao.getAllPlayers()) {
			if (p.getCategory().equalsIgnoreCase("Bowler")) {
				bowlers.add(p);
			}
		}

		return bowlers;
	}

	public List<Player> getAllBowlers(String teamName) {
		List<Player> bowlers = new ArrayList<>();

		for (Player p : dao.getAllPlayers()) {
			if (p.getCategory().equalsIgnoreCase("Bowler") && p.getTeamName().equalsIgnoreCase(teamName)) {
				bowlers.add(p);
			}
		}

		return bowlers;
	}

	public List<Player> getAllRounders() {
		List<Player> allRounders = new ArrayList<>();

		for (Player p : dao.getAllPlayers()) {
			if (p.getCategory().equalsIgnoreCase("All-Rounder")) {
				allRounders.add(p);
			}
		}

		return allRounders;
	}

	public List<Player> getAllRounders(String teamName) {
		List<Player> allRounders = new ArrayList<>();

		for (Player p : dao.getAllPlayers()) {
			if (p.getCategory().equalsIgnoreCase("All-Rounder") && p.getTeamName().equalsIgnoreCase(teamName)) {
				allRounders.add(p);
			}
		}

		return allRounders;
	}

	public Player getPlayerWithHighestRuns() {
		List<Player> playerList = dao.getAllPlayers();

		Player highestRuns = playerList.get(0);

		for (Player p : playerList) {
			if (p.getRuns() > highestRuns.getRuns()) {
				highestRuns = p;
			}
		}

		return highestRuns;
	}

	public Player getPlayerWithLowestRuns() {
		List<Player> list = dao.getAllPlayers();
		Player lowest = list.get(0);

		for (Player p : list) {
			if (p.getRuns() < lowest.getRuns()) {
				lowest = p;
			}
		}
		return lowest;
	}

	public Player getPlayerWithHighestWickets() {
		List<Player> list = dao.getAllPlayers();
		Player highest = list.get(0);

		for (Player p : list) {
			if (p.getWickets() > highest.getWickets()) {
				highest = p;
			}
		}
		return highest;
	}

	public Player getPlayerWithLowestWickets() {
		List<Player> list = dao.getAllPlayers();
		Player lowest = list.get(0);

		for (Player p : list) {
			if (p.getWickets() < lowest.getWickets()) {
				lowest = p;
			}
		}
		return lowest;
	}

	public Player getPlayerWithHighestCatches() {
		List<Player> list = dao.getAllPlayers();
		Player highest = list.get(0);

		for (Player p : list) {
			if (p.getCatches() > highest.getCatches()) {
				highest = p;
			}
		}
		return highest;
	}

	public List<Player> getPlayersRunsAbove1000() {
		List<Player> result = new ArrayList<>();

		for (Player p : dao.getAllPlayers()) {
			if (p.getRuns() > 8000) {
				result.add(p);
			}
		}
		return result;
	}

	public List<Player> getPlayersWicketsAbove10() {
		List<Player> result = new ArrayList<>();

		for (Player p : dao.getAllPlayers()) {
			if (p.getWickets() > 100) {
				result.add(p);
			}
		}
		return result;
	}

	public Iterable<Player> getPlayersWicketsAbove10GivenTeam(String teamName) {
		List<Player> result = new ArrayList<>();

		for (Player p : dao.getAllPlayers()) {
			if (p.getWickets() > 100 && teamName.equalsIgnoreCase(p.getTeamName())) {
				result.add(p);
			}
		}
		return result;
	}

	public int getTotalPlayers() {
		return dao.getAllPlayers().size();
	}
	
	public Player getPlayerByName(String name) {
	    for (Player p : dao.getAllPlayers()) {
	        if (p.getPname().equalsIgnoreCase(name)) {
	            return p;
	        }
	    }
	    return null;
	}
	
	public List<Player> getPlayersByCategory(String category) {
	    List<Player> result = new ArrayList<>();

	    for (Player p : dao.getAllPlayers()) {
	        if (p.getCategory().equalsIgnoreCase(category)) {
	            result.add(p);
	        }
	    }
	    return result;
	}

	public int getTotalPlayersByTeam(String teamName) {
	    int count = 0;

	    for (Player p : dao.getAllPlayers()) {
	        if (p.getTeamName().equalsIgnoreCase(teamName)) {
	            count++;
	        }
	    }
	    return count;
	}

	public List<Player> getPlayersRunsAbove500() {
	    List<Player> players = dao.getAllPlayers();
	    List<Player> result = new ArrayList<>();

	    for (Player p : players) {
	        if (p.getRuns() > 500) {
	            result.add(p);
	        }
	    }
	    return result;
	}
	
	public List<Player> getPlayersByCategoryAndTeam(String category, String teamName) {
	    List<Player> result = new ArrayList<>();

	    for (Player p : dao.getAllPlayers()) {
	        if (p.getCategory().equalsIgnoreCase(category)
	                && p.getTeamName().equalsIgnoreCase(teamName)) {
	            result.add(p);
	        }
	    }
	    return result;
	}

	public List<Player> getPlayersByFirstLetter(char letter) {
	    List<Player> players = dao.getAllPlayers();
	    List<Player> result = new ArrayList<>();

	    for (Player p : players) {
	        if (p.getPname().toLowerCase().charAt(0)
	                == Character.toLowerCase(letter)) {
	            result.add(p);
	        }
	    }
	    return result;
	}

	public int countPlayersRunsAbove500() {
	    List<Player> players = dao.getAllPlayers();
	    int count = 0;

	    for (Player p : players) {
	        if (p.getRuns() > 500) {
	            count++;
	        }
	    }
	    return count;
	}

	public int getTotalRuns() {
	    List<Player> players = dao.getAllPlayers();
	    int total = 0;

	    for (Player p : players) {
	        total = total + p.getRuns();
	    }
	    return total;
	}
	
}
