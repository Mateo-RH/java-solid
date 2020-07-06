package SRP;

public class PlayerDomain {
	
	Double getWinPercentage(Player player) {
		return Double.valueOf(player.win/player.win+player.lose);
	}
	
	Double getLossPercentage(Player player) {
		return Double.valueOf(player.lose/player.win+player.lose);
	}

}
