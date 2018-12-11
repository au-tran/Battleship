package edu.sjsu.cs.cs151.model;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>ShipFactory class</h1>
 * <p>
 * ShipFactory is a abstract class that is the main class that produce other ships used the Factory Method Pattern
 * 
 * @author Au, Phu, Tri
 * @version 1.0
 * @since 11-29-2018
 */
public abstract class ShipFactory {
	
	/**
	 * This method create a new object of particular ship
	 * This method passes in one the classes that extends ShipFactory and calls the function makeShip() demonstrating the template pattern
	 * @param any class that implement ShipFactory
	 * @return object of that particular ship
	 */
	public static <E extends ShipFactory> Ship getShip(E factory)
	{
		return factory.makeShip();
	}

	public abstract Ship makeShip();
	
}
