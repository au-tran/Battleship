package edu.sjsu.cs.cs151.model;

/**
 * <h1>CruiserFactory class</h1>
 * <p>
 * CruiserFactory is a type of ship that inherited from ShipFactory that use the Factory Method Pattern
 * 
 * @author Au, Phu, Tri
 * @version 1.0
 * @since 11-29-2018
 */
public class CruiserFactory extends ShipFactory{

	/**
	 * This method create a new object of Cruiser
	 * @param Nothing
	 * @return object of Cruiser
	 */
	@Override
	public Ship makeShip() {
		// TODO Auto-generated method stub
		return new Cruiser();
	}

}
