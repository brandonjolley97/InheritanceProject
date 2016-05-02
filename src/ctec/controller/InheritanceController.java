package ctec.controller;

import ctec.controller.InheritanceRunner;
import ctec.model.*;
import ctec.view.*;
import java.util.ArrayList;

public class InheritanceController 
{
	private int start;
	private InheritanceFrame baseFrame;
	
	private ArrayList<HeroThing> heroThings;
	
	public InheritanceController()
	{
		this.heroThings = new ArrayList<HeroThing>();
		baseFrame = new InheritanceFrame(this);
	}
	
	
	public String showHeroLevel()
	{
		String heroLevels = "";
		for(HeroThing currentHero : heroThings)
		{
			heroLevels += currentHero.toString() + currentHero.heroLevel() + " hero levels \n";
		}
		
		return heroLevels;
	}
	
	public String showPhilanthropist()
	{
		String philanthropist = "";
		for(HeroThing currentHero : heroThings)
		{
			philanthropist += currentHero.toString() + currentHero.philanthropist() + " dollars \n";
		}
		
		return philanthropist;
	}
	
	public String showVillansKilled()
	{
		String villansKilled = "";
		for(HeroThing currentHero : heroThings)
		{
			villansKilled += currentHero.toString() + currentHero.villainsKilled() + " villans \n";
		}
		
		return villansKilled;
	}

	
	private void makeHeroList()
	{
		heroThings.add(new Suit());
		heroThings.add(new Iron());
		heroThings.add(new Man());
	}
	public void start()
	{
		makeHeroList();
	}
	
	private void swap(int firstLocation, int secondLocation)
	{
		HeroThing temp = heroThings.get(firstLocation);
		heroThings.set(firstLocation, heroThings.get(secondLocation));
		heroThings.set(secondLocation, temp);
	}
	
	public void insertionSort()
	{
		for(int outerLoop = 1; outerLoop < heroThings.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && (heroThings.get(innerLoop-1).compareTo(heroThings.get(innerLoop))) > 0)
			{
				swap(innerLoop, innerLoop-1);
				innerLoop--;
			}
		}
	}
	
	public void quicksort(int low, int high)
	{
		if (low < high)
		{
			int midpoint = partition(low, high);
			quicksort(low, midpoint-1);
			quicksort(midpoint+1, high);
		}
	}
	
	private int partition(int low, int high)
	{
		int position = low;
		HeroThing pivot = heroThings.get(high);
		
		for(int spot = low; spot < high -1; spot++)
		{
			if(heroThings.get(spot).compareTo(pivot) <= 0)
			{
				swap(position, spot);
				position++;
			}
		}
		swap(position, high);
		
		return position;
		
	}
	
	public ArrayList<HeroThing> getHeroThings()
	{
		return heroThings;
	}
	
	
	
	
	
	
	
	
}
