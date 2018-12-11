package edu.sjsu.cs.cs151.model;

/**
 * <h1>BattleshipFactory class</h1>
 * <p>
 * BattleshipFactory is a type of ship that inherited from ShipFactory that use the Factory Method Pattern
 * 
 * @author Au, Phu, Tri
 * @version 1.0
 * @since 11-29-2018
 */
public class BattleshipFactory extends ShipFactory{

	/**
	 * This method create a new object of Battleship
	 * @param Nothing
	 * @return object of Battleship
	 */
	@Override
	public Ship makeShip() {
		// TODO Auto-generated method stub
		return new Battleship();
	}

}
