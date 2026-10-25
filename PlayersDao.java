package jdbc_ipl_oct_23;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayersDao {

	public List<Player> getAllPlayers() {

		List<Player> allplayer = new ArrayList<>();

	    try {
	        Connection con = MyDbCong.getSqlConnection();

	        Statement st = con.createStatement();
	        
			String query = "SELECT *, 'MI' AS team FROM miPlayersList UNION ALL SELECT *, 'RCB' AS team FROM rcbPlayersList UNION ALL SELECT *, 'CSK' AS team FROM cskPlayersList ORDER BY team;; ";
	        ResultSet rs = st.executeQuery(query);
	        
	        while(rs.next()) {
	        	Player p = new Player();
	        	p.setPid(rs.getInt(1));
	        	p.setPname(rs.getString(2));
	        	p.setCategory(rs.getString(3));
	        	p.setRuns(rs.getInt(4));
	        	p.setCatches(rs.getInt(5));
	        	p.setWickets(rs.getInt(6));
	        	p.setTeamName(rs.getString(7));
	        	
	        	allplayer.add(p);
	        }
	        return allplayer;
	    }
	    catch(Exception e) {
	    	
	    	e.printStackTrace();
	    }
		return null;
	    
	   }
}

