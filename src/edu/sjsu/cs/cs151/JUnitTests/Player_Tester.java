package edu.sjsu.cs.cs151.JUnitTests;

import edu.sjsu.cs.cs151.model.Player;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * <h1>Player_Tester class</h1>
 * <p>
 * JUnit Testing for Player class
 * 
 * @author Au, Phu, Tri
 * @version 1.0
 * @since 11-29-2018
 */

class Player_Tester {

	/**
	 * Tester for Player class
	 */
	@Test
	void testPlayer() {
		//pass random order
		Player player = new Player();
				
		assertEquals(player.getShips()[0].getShipName(), "Destroyer");
		assertEquals(player.getShips()[1].getShipName(), "Submarine");
		assertEquals(player.getShips()[2].getShipName(), "Cruiser");
		assertEquals(player.getShips()[3].getShipName(), "Battleship");
		assertEquals(player.getShips()[4].getShipName(), "Carrier");
		
		//Test number of sunken ships
		//set cruiser and carrier to health zero
		player.getShips()[0].setHealth(0);
		player.getShips()[0].isSunken();
		player.getShips()[4].setHealth(0);
		player.getShips()[4].isSunken();
		
		assertEquals(player.getSunkenShips(), 2);
		
		
	}

}
