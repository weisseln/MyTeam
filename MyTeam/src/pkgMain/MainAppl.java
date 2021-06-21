package pkgMain;

import pkgData.Player;

public class MainAppl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Player(2, "Dragovic", "Attack");
		System.out.println("== " + player);
		
		Player player2 = new Player(4, "Hinteregger", "Defense");
		System.out.println("== " + player2);
		
		Player player3 = new Player(4, "Bergeeer", "Hinterweltler");
		System.out.println("== " + player3);
		
		
		
		Player player5 = new Player(10, "Manhard", "Attack");
		System.out.println("== " + player5);
		
		
		
		
	}

}
