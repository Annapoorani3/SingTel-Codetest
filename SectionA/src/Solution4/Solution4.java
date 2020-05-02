package Solution4;

public class Solution4 {
	
public static void main(String[] args) {
		
		Animal rooster = new Chicken();
		rooster.setGender("M");
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal duck = new Duck();

		Telephone telephone = new Telephone();

		Parrot parrot1 = new Parrot();
		parrot1.setNeighbor(rooster);
		parrot1.sing();

		Parrot parrot2 = new Parrot();
		parrot2.setNeighbor(dog);
		parrot2.sing();
		
		Parrot parrot3 = new Parrot();
		parrot3.setNeighbor(cat);
		parrot3.sing();
		
		Parrot parrot4 = new Parrot();
		parrot4.setNeighbor(telephone);
		parrot4.sing();
		
		Parrot parrot5 = new Parrot();
		parrot5.setNeighbor(duck);
		parrot5.sing();
 		


}
}