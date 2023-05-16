import java.util.ArrayList;
import java.io.*;
import java.lang.*;

/**
* The purpose of this class is to represent a ballot that holds a list
* of candidates running for a specified office
* @author Zaynab Zeini
*/
public class Ballot{
	private String officeName;
	private ArrayList<Candidate> candidatesList;

	/**
	* This constructor creates a ballot for a designated office
	* @param officeName the name of the office up for a vote
	*/
	public Ballot(String officeName){
    this.officeName = officeName;
		candidatesList = new ArrayList<Candidate>();
	}

	/**
	* This method returns the name of the office up for a vote
	* @return a String representing the name of the office up for a vote
	*/
	public String getOfficeName(){
    return officeName;
	}

	/**
	* This method adds a Candidate to the ballot and ensures no duplicates are added
	* @param c a Candidate that is running
	*/
	public void addCandidate(Candidate c){
		if(candidatesList.contains(c)) {
			System.out.println("Duplicate candidate: candidate is already on the ballot");
		}
		else {
			candidatesList.add(c);
		}
	}

	/**
	* This method returns the ballot that holds the candidates and their information
	* @return an ArrayList of candidates in the running
	*/
	public ArrayList<Candidate> getCandidates(){
    return candidatesList;
	}

	/**
	* This method generates and returns a string representation of the ballot,
	* including all the candidates
	* It overrides the toString() method
	* @return a String representation of the ballot's candidates
	*/
	@Override
	public String toString() {
		String ballotString = officeName + "\n";
		for(Candidate c : candidatesList) {
			ballotString += c.toString() + "\n";
		}
		return ballotString;
	}

}
