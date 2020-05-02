package Solution1;

public class Caterpillar extends Insect {
	
	Butterfly newButterfly;

	Butterfly transform(){
		
    this.newButterfly = new Butterfly();
    return this.newButterfly;}
    
    boolean sing() {return false;}

    boolean swim() {return false;}

    boolean walk()
    {
      //System.out.println("I can walk");
	return true;
    }

	@Override
	boolean fly() {
		// TODO Auto-generated method stub
		return false;
	}


}
