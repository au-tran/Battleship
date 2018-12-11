package edu.sjsu.cs.cs151.model;

/**
 * <h1>Player class</h1>
 * <p>
 * Player class containing its own grid board and 5 ship objects
 * 
 * @author Au, Phu, Tri
 * @version 1.0
 * @since 11-29-2018
 */
public class Player {
	
	private final Ship[] ships = new Ship[5];
	private final Grid playergrid;
	private int sunkenShips;
	
	/**
	 * This method initalizes a player, creating the ships and grid
	 * @param one destroyer
	 * @param two submarine
	 * @param three cruiser
	 * @param four battleship
	 * @param five carrier
	 * 
	 * @return Nothing
	 */
	public Player()
	{
		ships[0] = ShipFactory.getShip(new DestroyerFactory());
		ships[1] = ShipFactory.getShip(new SubmarineFactory());
		ships[2] = ShipFactory.getShip(new CruiserFactory());
		ships[3] = ShipFactory.getShip(new BattleshipFactory());
		ships[4] = ShipFactory.getShip(new CarrierFactory());
		playergrid = new Grid();
	}

	/**
	 * This method gets the amount of ships that was destroyed by checking if each of the 5 ships was sunken
	 * @param Nothing
	 * @return sunkenShips amount of ships whose health reached 0
	 */
	public int getSunkenShips() {
		
		setSunkenShips(0);
		
		for(int i = 0; i < ships.length; i++)
		{
			if(ships[i].isSunken() == true)
			{
				sunkenShips++;
			}
		}
		return sunkenShips;
	}

	/**
	 * This method sets the amount of ships that were sunk
	 * @param sunkenShips amount of ships whose health reached 0
	 * @return Nothing
	 */
	public void setSunkenShips(int sunkenShips) {
		this.sunkenShips = sunkenShips;
	}


	/**
	 * This method gets all the ships in player's possession
	 * @param shipName, length, shipHealth
	 * @return ships
	 */
	public Ship[] getShips() {
		return ships;
	}

	/**
	 * This method gets player's grid board
	 * @param Nothing
	 * @return playergrid
	 */
	public Grid getGrid() {
		return playergrid;
	}

}
