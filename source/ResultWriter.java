import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
* The purpose of this class is to write the election results to an output file
* @author Zaynab Zeini
*/
public class ResultWriter{

	/**
	* This  method writes the results of an election to a designated output file
	* in a specified format
	* @param filename a String representing the name of the user's output file
	* @param ballot of type Ballot, representing a single ballot for an office up for vote
	* @exception IOException output error
	*/
	public static void writeResults(String filename, Ballot ballot)
	throws IOException {

		//create file and print objects
		FileWriter fileWriter = new FileWriter(filename);
		PrintWriter printWriter = new PrintWriter(fileWriter);

		//LINE ONE: OFFICE NAME
		String officeName = ballot.getOfficeName();
		String lineOne = "RESULTS - " + officeName;
		printWriter.println(lineOne);

		//LINE TWO: DASHES
		String lineTwo = "";
		for(int i = 0; i < lineOne.length(); i++) {
			 lineTwo += "-";
		}
		printWriter.println(lineTwo);

		//DETERMINE MAXIMUM TAG LENGTH
		int maxTagLength = 0;
		for(Candidate person : ballot.getCandidates()) {
			if(person.toString().length() > maxTagLength) {
				maxTagLength = person.toString().length();
			}
		}

		//left and right justify
		int leftJustify = maxTagLength;
		int rightJustify = maxTagLength + 12;
		//print a line for each candidate
		for(Candidate person : ballot.getCandidates()) {
			String candidateLine = String.format("%-" + leftJustify + "s" + " %" + rightJustify + "s", person.toString(), person.getVoteCount());
			printWriter.println(candidateLine);
		}

		//PRINT BLANK LINE
		printWriter.println("\n");

		//LINE THAT INDICATES WINNER
		int maxVoteCount = 0;
		String winnerName = "";
		String winnerAffiliation = "";
		String winnerLine = "";
		boolean tie = true;
		//test each candidate in ballot
		for(Candidate person : ballot.getCandidates()) {
			if(person.getVoteCount() > maxVoteCount) {
				maxVoteCount = person.getVoteCount(); //reset maxVoteCount
				winnerName = person.getName(); //reset winner as whoever has the maxVoteCount
				winnerAffiliation = person.getAffiliation();
				tie = false;
			}
			else if(person.getVoteCount() == maxVoteCount) {
				tie = true; //if a candidate has the same amount as the maxVoteCount, its a tie
			}
		}
		if(tie == true) {
			winnerLine = "NO WINNER";
		}
		else {
			winnerLine = "WINNER: " + winnerName + " - " + winnerAffiliation;
		}
		printWriter.print(winnerLine);

		printWriter.close();


	}
}
