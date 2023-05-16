import java.io.IOException;
import java.util.Scanner;
import java.io.File;

/**
* The purpose of this class is to read in input from a designated file
* @author Zaynab Zeini
*/

public class BallotReader{

	/**
	* This method uses a scanner to read in an input file that holds a ballot
	* and processes each line in a specific format
	* @param filename a String representing the name of the user's input file
	* @exception IOException input error
	*/
	public static Ballot readBallot(String filename)
	throws IOException {

		//creates a file object
		File fileObj = new File(filename);

    //creates scanner object and uses it to read file obj
    Scanner scnr = new Scanner(fileObj);

    //officename from file, the first line
    String officeName = scnr.nextLine();

    //variable named ballot
    Ballot ballot = new Ballot(officeName);

    //number of candidates, the second line
		String line = scnr.nextLine();
		int n = Integer.parseInt(line);

    //read each line, assign that to a variable, split the variable, and assign the split
			for(int i=0; i<n; i++) {
	      String info = scnr.nextLine(); //read the line
	      String[] infoBreak = info.split(";", 2); //split the line 
	      String name = infoBreak[0]; //assign the split part
	      String affiliation = infoBreak[1];
	      ballot.addCandidate(new Candidate(name, affiliation));
	    }

		return ballot;
	}
}
