package Solution1;

public class Solution1 {
	
public static void main(String[] args) {
		
		Animal clownfish = new ClownFish();
		((ClownFish) clownfish).makeJokes();

		Animal shark = new Shark();
		Fish fish = new Fish();
		((Shark) shark).eat(fish);

		Animal dolphin = new Dolphin();
		((AquaticAnimal) dolphin).swim();




}
}
