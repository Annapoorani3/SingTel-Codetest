package Solution1;



public class Parrot extends Bird {
	
	Object neighbor;

	boolean swim() { return false; }

	boolean fly() { return true ; }

	void setNeighbor(Object obj){
	this.neighbor = obj;
}

	boolean sing() { 
			if(neighbor instanceof Animal)
			{
				((Animal) neighbor).sing();
			}
			else if (neighbor instanceof Telephone)
			{
				((Telephone) neighbor).sing();
			}
			return true;
}


}
