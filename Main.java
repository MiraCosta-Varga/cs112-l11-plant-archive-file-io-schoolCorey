// TODO: Step 2 - Import file input statements here
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main 
{
	static final String FILENAME = "Forage.csv";
	public static void main(String[] args) 
	{
		/*
		//TEST FOR STEP 1 (you can delete/comment this out after completing step 1)
		Plant test = new Plant("Stinging Nettle,65,anti-inflammatory and culinary");
		System.out.println("test plant:\n" + test + "\n\n");
		*/
		
		Scanner iStream = null;
		String plantContructor;
		Plant temp;
		ArrayList<Plant> plantList = new ArrayList<Plant>();
		

		try{
			iStream = new Scanner(new FileInputStream(FILENAME));
		}catch(FileNotFoundException fnfe){
			System.out.println("ERROR: No File " + FILENAME + "not found or unable to be opened.");
		}

		
		while (iStream.hasNextLine()) {
			plantContructor = iStream.nextLine();
			temp = new Plant(plantContructor);
			plantList.add(temp);
		}

		iStream.close();

		for (Plant plant : plantList) {
			System.out.println(plant);
			System.out.println();
		}

	}
}