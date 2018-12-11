package edu.sjsu.cs.cs151.model;

/**
 * <h1>DestroyerFactory class</h1>
 * <p>
 * DestroyerFactory is a type of ship that inherited from ShipFactory that use the Factory Method Pattern
 * 
 * @author Au, Phu, Tri
 * @version 1.0
 * @since 11-29-2018
 */
public class DestroyerFactory extends ShipFactory{
	
	/**
	 * This method create a new object of Destroyer
	 * @param Nothing
	 * @return object of Destroyer
	 */
	@Override
	public Ship makeShip() {
		// TODO Auto-generated method stub
		return new Destroyer();
	}

}
