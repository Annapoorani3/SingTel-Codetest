package Solution4;

public class Parrot extends Bird {
	
	Object neighbor;

	void setNeighbor(Object obj){
		this.neighbor = obj;
	}

		protected void sing() {
		if(neighbor instanceof Animal)
		{
			((Animal) neighbor).sing();
		}
		else if (neighbor instanceof Telephone)
		{
			((Telephone) neighbor).sing();
		}
	}



}
