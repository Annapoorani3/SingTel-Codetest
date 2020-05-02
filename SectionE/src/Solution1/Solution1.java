package Solution1;

public class Solution1 {
	
	public static void main(String[] args) {
		Animal[] animals = new Animal[]{
				 new Duck(),
				 new Chicken(),
				 new Parrot(),
				 new Shark(),
				 new ClownFish(),
				 new Dolphin(),
				 new Dog(),
				 new Butterfly(),
				 new Cat()
		};
		int walk_counter = 0, swim_counter=0, fly_counter=0, sing_counter = 0;

		
		
		for(Animal animal : animals)
		{
			if (animal.walk() == true) 
				walk_counter ++;
				
			if (animal.swim() == true)
				swim_counter ++;
			if (animal.fly() == true)
				fly_counter ++;
			if (animal.sing()== true)
				sing_counter ++;
	    
		}
		System.out.println("Count of Animals that can walk:");
		System.out.println( walk_counter);
		System.out.println("Count of animals that can swim");
		System.out.println(swim_counter);
		System.out.println("Count of Animals that can fly:");
		System.out.println(fly_counter);
		System.out.println("Count of animals that can sing:");
		System.out.println(sing_counter);
		

	}
}
