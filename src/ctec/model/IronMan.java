package ctec.model;

import ctec.model.*;

public class IronMan 
{
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
