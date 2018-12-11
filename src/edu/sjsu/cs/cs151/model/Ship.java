package edu.sjsu.cs.cs151.model;
import java.awt.Color;

/**
 * <h1>Ship Class</h1>
 * <p>
 * Ship class containing the 5 ship types of varied lengths in a standard battleship game.
 * 
 * @author Au, Phu, Tri
 * @version 1.0
 * @since 11-29-2018
 */
public abstract class Ship{

	private String shipName;
	private int length;
	private int shipHealth;
	private boolean sunken;
	
	/**
	 * This method prints the string representation of the ship
	 * @param Nothing
	 * @return shipName, length, shipHealth
	 */
	public String toString()
	{
		return ("Ship Name: " + shipName + " Length:" + length + " Health:" + shipHealth);
	}
	
	/**
	 * This method gets the name of the ship
	 * @param Nothing
	 * @return String shipName
	 */
	public String getShipName()
	{
		return shipName;
	}
	
	/**
	 * This method sets the name of the ship
	 * @param name string to change current name of a ship
	 * @return Nothing
	 */
	public void setShipName(String name)
	{
		this.shipName = name;
	}
	
	/**
	 * This method gets the length of the ship
	 * @param Nothing
	 * @return integer length
	 */
	public int getLength()
	{
		return this.length;
	}
	
	/**
	 * This method sets the length of the ship
	 * @param length value to change current length of a ship
	 * @return Nothing
	 */
	public void setLength(int length)
	{
		this.length = length;
	}
	
	/**
	 * This method gets the current health of the ship
	 * @param Nothing
	 * @return shipHealth
	 */
	public int getHealth()
	{
		return this.shipHealth;
	}
	
	/**
	 * This method sets the health of the ship
	 * @param Health value to change current health of the a ship
	 * @return Nothing
	 */
	public void setHealth(int Health)
	{
		this.shipHealth = Health;
	}
	
	
	/**
	 * This method sets the current state of the ship
	 * @param update whether the ship is sunken or not
	 * @return Nothing
	 */
	public void setSunken(boolean sunken)
	{
		this.sunken = sunken;
	}
	
	/**
	 * This method returns the current state of the ship
	 * @param Nothing
	 * @return sunken = True if shipHealth equals 0, otherwise sunken = false
	 */
	public boolean isSunken()
	  {
	    if (shipHealth == 0)
	    {
	      sunken = true;
	      return sunken;
	    }
	    return sunken;
	  }
}