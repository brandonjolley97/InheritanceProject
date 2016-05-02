package ctec.model;

import ctec.model.*;

public abstract class IronMan implements HeroThing
{
	
	
	public String toString()
	{
		String description = "This is a " + this.getClass().getName() + " and it has a meme of " + heroMeme() + " with ";
		
		return description;
	}
	
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		if(compared instanceof HeroThing)
		{
			if(this.heroLevel() > ((HeroThing) compared).heroLevel())
			{
				comparedValue = 1;
			}
			else if(this.heroLevel() < ((HeroThing) compared).heroLevel())
			{
				comparedValue = -1;
			}
			else
			{
				comparedValue = 0;
			}
		}
		return comparedValue;
	}
	
	

}
