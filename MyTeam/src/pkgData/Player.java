package pkgData;

public class Player {

	private int numberPlayer;
	private String namePlayer, positionPlayer;
	
	
	
	
	public Player(int numberPlayer, String namePlayer, String positionPlayer) {
		super();
		this.numberPlayer = numberPlayer;
		this.namePlayer = namePlayer;
		this.positionPlayer = positionPlayer;
	}
	
	
	@Override
	public String toString() {
		return "Player [numberPlayer=" + numberPlayer + ", namePlayer=" + namePlayer + ", positionPlayer="
				+ positionPlayer + "]";
	}


	public int getNumberPlayer() {
		return numberPlayer;
	}
	public void setNumberPlayer(int numberPlayer) {
		this.numberPlayer = numberPlayer;
	}
	public String getNamePlayer() {
		return namePlayer;
	}
	public void setNamePlayer(String namePlayer) {
		this.namePlayer = namePlayer;
	}
	public String getPositionPlayer() {
		return positionPlayer;
	}
	public void setPositionPlayer(String positionPlayer) {
		this.positionPlayer = positionPlayer;
	}
	
	
	
	
	
}
