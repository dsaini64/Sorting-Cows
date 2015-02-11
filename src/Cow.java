
public class Cow implements Comparable<Cow> {

	
	private int weight;
	private String name;
	
	
	public Cow(){
		name = "Anonymous Cow";
		weight = 2000;
	}
	
	public Cow(String n){
		name = n;
		weight = 2000;
	}
	
	public Cow(String n, int w){
		name = n;
		weight = w; 
	}
	
	public String getName()	{
		return name;
	}
	
	public int getWeight(){	
		return weight;
	}
	
	@Override
	public int compareTo(Cow c) {
		
		return weight - c.weight;
		
	}
	
	public boolean equals(Cow c){
		if(compareTo(c) == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void printCow(){
		 
	}

}
