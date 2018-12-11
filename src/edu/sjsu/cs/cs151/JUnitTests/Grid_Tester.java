package edu.sjsu.cs.cs151.JUnitTests;

import edu.sjsu.cs.cs151.model.Grid;
import edu.sjsu.cs.cs151.model.Cell;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * <h1>Grid_Tester class</h1>
 * <p>
 * JUnit Testing for Grid class
 * 
 * @author Au, Phu, Tri
 * @version 1.0
 * @since 11-29-2018
 */

class Grid_Tester {

	/**
	 * Tester for Grid class
	 */
	@Test
	void testGrid() {
		Grid gridObj = new Grid();
		
		assertEquals(gridObj.getGridCells()[0][0], null);
		
		gridObj.setupGrid();
		assertEquals(gridObj.getGridCells()[0][0].getClass(), Cell.class);
		assertEquals(gridObj.getGridCells().length, 10);
		assertEquals(gridObj.getGridCells()[0].length, 10);
	}

}
