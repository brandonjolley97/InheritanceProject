package ctec.controller;

import ctec.controller.InheritanceRunner;

public class InheritanceController 
{
	private ArrayList<HeroThings> heroThings;
	
	public String showHeroLevels()
	{
		
	}
	
	private void makeHeroList()
	{
		heroThings.add(new Suit());
		heroThings.add(new Iron());
		heroThings.add(new Man());
	}
	public void start()
	{
		
	}
	
	private void swap(int firstLocation, int secondLocation)
	{
		
	}
	
	public void insertionSort()
	{
		for(int outerLoop = 1; outerLoop < heroThings.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && (heroThings.get(innerLoop-1).compareTo(heroThings.get(innerLoop))) > 0)
			{
				
			}
		}
	}
}
