package Solution1;

public class Caterpillar extends Insect {
	
	Butterfly newButterfly;

	Butterfly transform(){
    this.newButterfly = new Butterfly();
    return this.newButterfly;
}

	void walk()
	{
       System.out.println("I can walk");
	}


}
