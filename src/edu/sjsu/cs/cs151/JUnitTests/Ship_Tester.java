package edu.sjsu.cs.cs151.JUnitTests;

import edu.sjsu.cs.cs151.model.BattleshipFactory;

import edu.sjsu.cs.cs151.model.CarrierFactory;
import edu.sjsu.cs.cs151.model.CruiserFactory;
import edu.sjsu.cs.cs151.model.DestroyerFactory;
import edu.sjsu.cs.cs151.model.Ship;
import edu.sjsu.cs.cs151.model.ShipFactory;
import edu.sjsu.cs.cs151.model.SubmarineFactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * <h1>Ship_Tester class</h1>
 * <p>
 * JUnit Testing for Ship class
 * 
 * @author Au, Phu, Tri
 * @version 1.0
 * @since 11-29-2018
 */

class Ship_Tester {

	/**
	 * Tester for checkShip in Ship test for Destroyer
	 */
	@Test	//Test Destroyer ship
	void testDestroyerShip() {
		//******
		Ship ship1 = ShipFactory.getShip(new DestroyerFactory()); //destroyer Ship of size 2
		assertEquals(ship1.getHealth(), 2);
		assertEquals(ship1.getLength(), 2);
		assertEquals(ship1.getShipName(), "Destroyer");
		assertEquals(ship1.toString(), "Ship Name: Destroyer Length:2 Health:2");
		assertFalse(ship1.isSunken());

		//when health is 0
		ship1.setHealth(0);
		assertEquals(ship1.getHealth(), 0);
		assertTrue(ship1.isSunken());
		assertEquals(ship1.toString(), "Ship Name: Destroyer Length:2 Health:0");
	}
	
	/**
	 * Tester for checkShip in Ship test for Submarine
	 */
	@Test	//Test Submarine ship
	void testSubmarineShip() {
		//******
		Ship ship1 = ShipFactory.getShip(new SubmarineFactory()); //player1SUBMARINE Ship of size 3
		assertEquals(ship1.getHealth(), 3);
		assertEquals(ship1.getLength(), 3);
		assertEquals(ship1.getShipName(), "Submarine");
		assertEquals(ship1.toString(), "Ship Name: Submarine Length:3 Health:3");
		assertFalse(ship1.isSunken());

		//when health is 0
		ship1.setHealth(0);
		assertEquals(ship1.getHealth(), 0);
		assertTrue(ship1.isSunken());
		assertEquals(ship1.toString(), "Ship Name: Submarine Length:3 Health:0");
	}
	
	/**
	 * Tester for checkShip in Ship test for Cruiser
	 */
	@Test	//Test Cruiser ship
	void testCruiserShip() {
		//******
		Ship ship1 = ShipFactory.getShip(new CruiserFactory()); //player1CRUISER Ship of size 3
		assertEquals(ship1.getHealth(), 3);
		assertEquals(ship1.getLength(), 3);
		assertEquals(ship1.getShipName(), "Cruiser");
		assertEquals(ship1.toString(), "Ship Name: Cruiser Length:3 Health:3");
		assertFalse(ship1.isSunken());

		//when health is 0
		ship1.setHealth(0);
		assertEquals(ship1.getHealth(), 0);
		assertTrue(ship1.isSunken());
		assertEquals(ship1.toString(), "Ship Name: Cruiser Length:3 Health:0");
	}

	/**
	 * Tester for checkShip in Ship test for Battleship
	 */
	@Test	//Test BattleShip 
	void testBattleShip() {
		//******
		Ship ship1 = ShipFactory.getShip(new BattleshipFactory()); //player1BATTLESHIP Ship of size 4
		assertEquals(ship1.getHealth(), 4);
		assertEquals(ship1.getLength(), 4);
		assertEquals(ship1.getShipName(), "Battleship");
		assertEquals(ship1.toString(), "Ship Name: Battleship Length:4 Health:4");
		assertFalse(ship1.isSunken());

		//when health is 0
		ship1.setHealth(0);
		assertEquals(ship1.getHealth(), 0);
		assertTrue(ship1.isSunken());
		assertEquals(ship1.toString(), "Ship Name: Battleship Length:4 Health:0");
	}
	
	/**
	 * Tester for checkShip in Ship test for Carrier
	 */
	@Test	//Test Carrier ship 
	void testCarrierShip() {
		//******
		Ship ship1 = ShipFactory.getShip(new CarrierFactory()); //player1CARRIER Ship of size 5
		assertEquals(ship1.getHealth(), 5);
		assertEquals(ship1.getLength(), 5);
		assertEquals(ship1.getShipName(), "Carrier");
		assertEquals(ship1.toString(), "Ship Name: Carrier Length:5 Health:5");
		assertFalse(ship1.isSunken());

		//when health is 0
		ship1.setHealth(0);
		assertEquals(ship1.getHealth(), 0);
		assertTrue(ship1.isSunken());
		assertEquals(ship1.toString(), "Ship Name: Carrier Length:5 Health:0");
	}
}
