package edu.sjsu.cs.cs151.model;

/**
 * <h1>SubmarineFactory class</h1>
 * <p>
 * SubmarineFactory is a type of ship that inherited from ShipFactory that use the Factory Method Pattern
 * 
 * @author Au, Phu, Tri
 * @version 1.0
 * @since 11-29-2018
 */
public class SubmarineFactory extends ShipFactory{

	/**
	 * This method create a new object of Submarine
	 * @param Nothing
	 * @return object of Submarine
	 */
	@Override
	public Ship makeShip() {
		// TODO Auto-generated method stub
		return new Submarine();
	}

	
}
