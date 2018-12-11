package edu.sjsu.cs.cs151.model;

/**
 * <h1>CarrierFactory class</h1>
 * <p>
 * CarrierFactory is a type of ship that inherited from ShipFactory that use the Factory Method Pattern
 * 
 * @author Au, Phu, Tri
 * @version 1.0
 * @since 11-29-2018
 */
public class CarrierFactory extends ShipFactory{

	/**
	 * This method create a new object of Carrier
	 * @param Nothing
	 * @return object of Battleship
	 */
	@Override
	public Ship makeShip() {
		// TODO Auto-generated method stub
		return new Carrier();
	}

	
}
