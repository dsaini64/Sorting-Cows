import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Cow[] cowArray = new Cow[] {new Cow("Bob", 10), new Cow("Joe", 1066546), new Cow(), new Cow("LalaLand"), new Cow("Kevin")};
		printCows(cowArray);
		Arrays.sort(cowArray);
		printCows(cowArray);
		
	}
		
	
	public static void printCows(Cow[] c){
			for(int i = 0; i < c.length; i++){
				System.out.println(c[i].getName() + ", " + c[i].getWeight());
			}
		}
	

}
