package SRP;

public class PlayerOld {
	
//	Object
	private int id;
	private String name;
	private int win;
	private int lose;
	private String date;
	
	int getId() {
		return id;
	}
	
	void setId(int id) {
		this.id = id;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getWin() {
		return win;
	}
	
	void setWin(int win) {
		this.win = win;
	}
	
	int getLose() {
		return lose;
	}
	
	void setLose(int lose) {
		this.lose = lose;
	}
	
	String getDate() {
		return date;
	}
	
	void setDate(String date) {
		this.date = date;
	}
	
//	Business layer
	Double getWinPercentage(PlayerOld player) {
		return Double.valueOf(player.getWin()/player.getWin()+player.getLose());
	}
	
	Double getLossPercentage(PlayerOld player) {
		return Double.valueOf(player.getLose()/player.getWin()+player.getLose());
	}
	
//	Data layer
	void savePlayer(PlayerOld player) {
		//Stores the player
	}
	
	void deletePlayer(PlayerOld player) {
		//Deletes the player
	}
	
//	Presentation layer
	void showPlayerHD(PlayerOld player) {
		
	}
	
	void showPlayer(PlayerOld player) {
		
	}

}
