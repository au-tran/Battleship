package edu.sjsu.cs.cs151.JUnitTests;

import edu.sjsu.cs.cs151.model.Cell;
import edu.sjsu.cs.cs151.model.DestroyerFactory;
import edu.sjsu.cs.cs151.model.Ship;
import edu.sjsu.cs.cs151.model.ShipFactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * <h1>Cell_Tester class</h1>
 * <p>
 * JUnit Testing for Cell class
 * 
 * @author Au, Phu, Tri
 * @version 1.0
 * @since 11-29-2018
 */
class Cell_Tester {

	/**
	 * Tester for checkShip in Cell test when there is no ship
	 */
	@Test 		//test when checkShip does not has any ship
	void testCheckShip1() {
		Cell cellObj = new Cell();
		
		boolean flag = cellObj.checkHit();
		assertFalse(flag);
		assertSame(cellObj.getShip(), null);
	}

	/**
	 * Tester for checkShip in Cell test when there is ship
	 */
	@Test      //test when checkShip does contains a ship
	void testCheckShip2() {
		Cell cellObj = new Cell();
		Ship shipObj = ShipFactory.getShip(new DestroyerFactory()); //DESTROYER Ship of size 2
		
		cellObj.setShip(shipObj);
		
		boolean flag = cellObj.checkHit(); //hit one time
		assertTrue(flag); 
		assertSame(1, shipObj.getHealth()); //ship health is now 1
		assertFalse(shipObj.isSunken()); //ship still remain on the field
		
		flag = cellObj.checkHit(); //hit one time
		assertTrue(flag); 
		assertSame(0, shipObj.getHealth()); //ship health is now 0
		assertTrue(shipObj.isSunken()); //ship is now sunk
	}

}
