package edu.sjsu.cs.cs151.JUnitTests;

import edu.sjsu.cs.cs151.model.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * <h1>Model_Tester class</h1>
 * <p>
 * JUnit Testing for Model class
 * 
 * @author Au, Phu, Tri
 * @version 1.0
 * @since 11-29-2018
 */
class Model_Tester {

	/**
	 * Tester for placeShip method in Model class
	 */
	@Test
	void testPlaceShip() {
		Model model = new Model();
		model.getPlayer1().getGrid().setupGrid();
		model.getPlayer2().getGrid().setupGrid();
		
		
	//****check when place ship in wrong order
		//straight col but skipping a place in row
		int[] rows = {1, 2, 4};
		int[] cols = {1, 1, 1};
		assertFalse(model.placeShip(rows, cols, "Player 1", "Submarine"));
		
		//straight row but skipping a place in col
		int[] row = {2, 2, 2};
		int[] col = {1, 2, 4};
		assertFalse(model.placeShip(row, col, "Player 1", "Submarine"));
		
		//not in straight row or col
		int[] r = {1, 2, 4};
		int[] c = {1, 2, 4};
		assertFalse(model.placeShip(r, c, "Player 1", "Submarine"));
		
	//****check when ship is place successfully in horizontal
		int[] r1 = {2, 2, 2};
		int[] c1 = {1, 2, 3};
		assertTrue(model.placeShip(r1, c1, "Player 2", "Submarine"));
		
	//****check when ship is place successfully in vertical
		int[] r2 = {5, 6, 7};
		int[] c2 = {5, 5, 5};
		assertTrue(model.placeShip(r2, c2, "Player 2", "Cruiser"));
		
	//****NOTE: no need to check overlapping ship placement since in view.java,
		//after a ship is successfully placed, the button will be disable.
		//Hence this will prevent user from select the same location on the grid
		
	}
	
	/**
	 * Tester for attack method in Model class
	 */
	@Test
	void testAttack() {
		Model model = new Model();
		model.getPlayer1().getGrid().setupGrid();
		
		int[] rows = {1, 1};
		int[] cols = {1, 2};
		model.placeShip(rows, cols, "Player 1", "Destroyer");
		
	//****When attack miss
		assertFalse(model.attack(5, 5, "Player 1"));
		
	//****When attack hit
		assertTrue(model.attack(1, 1, "Player 1"));

	//****NOTE: no need to check for repeated attack at same location since in view.java,
		//after a particular location is being attacked, that button will be disable.
		//Hence this will prevent user from select the same location on the grid
	}

	/**
	 * Tester for getShipAttack method in Model class
	 */
	@Test
	void testGetShipAttack() {
		Model model = new Model();
		model.getPlayer1().getGrid().setupGrid();
		
		int[] rows = {1, 1};
		int[] cols = {1, 2};
		model.placeShip(rows, cols, "Player 1", "Destroyer");
		
		int[] rows2 = {5, 5, 5};
		int[] cols2 = {1, 2, 3};
		model.placeShip(rows2, cols2, "Player 1", "Submarine");
		
	//****When selected a location with no ship
		assertSame(model.getShipAttacked(1, 1, "Player 1"), "Destroyer");
		assertEquals(model.getShipAttacked(5, 2, "Player 1"), "Submarine");
		
	//****NOTE: no need to check for location with no ship since in view.java,
		//it is already being take care of
	}
	
	/**
	 * Tester for isShipSunk method in Model class
	 */
	@Test
	void testIsShipSunk() {
		Model model = new Model();
		model.getPlayer1().getGrid().setupGrid();
		
		int[] rows = {1, 1};
		int[] cols = {1, 2};
		model.placeShip(rows, cols, "Player 1", "Destroyer");
		
		assertFalse(model.isShipSunk(1, 1, "Player 1"));
		
		model.getPlayer1().getShips()[0].setHealth(0);
		
		assertTrue(model.isShipSunk(1, 1, "Player 1"));
	}
	
	/**
	 * Tester for checkIfLose method in Model class
	 */
	@Test
	void testCheckIfLose() {
		Model model = new Model();
		
		//check when at least one ship is still remain (player 1)
		assertFalse(model.checkifLost("Player 1"));
		
		//check when all ships are sank (player 2)
		model.getPlayer2().getShips()[0].setHealth(0);
		model.getPlayer2().getShips()[1].setHealth(0);
		model.getPlayer2().getShips()[2].setHealth(0);
		model.getPlayer2().getShips()[3].setHealth(0);
		model.getPlayer2().getShips()[4].setHealth(0);
		
		assertTrue(model.checkifLost("Player 2"));
	}
}
