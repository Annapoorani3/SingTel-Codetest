package Solution1;

public class Shark extends Fish{
	
	String Size;
	String color;
	Fish food;

	Shark(){
	Size = "Large";
	color = "Grey";
}

void eat(Fish fish){
	this.food = fish ;
	System.out.println("I eat fish");
}



}
