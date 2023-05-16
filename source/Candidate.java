import java.lang.Comparable;

/**
* The purpose of this class is to create and represent a candidate using their
* name, affiliation, and number of votes casted for them
* @author Zaynab Zeini
*/
public class Candidate implements Comparable<Candidate>{
	private int vote;
	private String name;
	private String affiliation;

	/**
	* This constructor creates a new candidate with their name and affiliation and
	* initializes their votes to zero
	* @param name the name of the candidate running for office
	* @param affiliation the party affiliation of the candidate running for office
	*/
	public Candidate(String name, String affiliation){
    this.name = name;
    this.affiliation = affiliation;
		vote = 0;
	}

	/**
	* This method returns the name of the candidate running for office
	* @return a String representing the name of the candidate
	*/
	public String getName(){
    return name;
	}

	/**
	* This method returns the affiliation of the candidate running for office
	* @return a String representing the affiliation of the candidate
	*/
	public String getAffiliation(){
    return affiliation;
	}

	/**
	* This method returns the number of votes for the candidate running for office
	* @return an int representing the number of votes for the candidate
	*/
	public int getVoteCount(){
    return vote;
	}

	/**
	* This method increments the number of votes cast for the candidate running
	*/
	public void tallyVote(){
    vote ++;
	}

	/**
	* This method generates and returns a string representation of the candidate
	* It overrides the toString() method
	* @return a String representation of the candidate with name and affiliation
	*/
	@Override
	public String toString(){ //candidate's tag
    return name + " - " + affiliation;
	}

	/**
	* This method returns an integer based on the result of comparing two objects
	* It returns a positive int if the current candidate is greater than the specified,
	* returns a negative if it's less than, and a zero if they're equal
	* It overrides the compareTo() method
	* @return an int representation of the comparison of the current and specified candidates
	*/
	@Override
	public int compareTo(Candidate otherCandidate) {
		Integer candidateVote = new Integer(this.getVoteCount());
		Integer otherCandidateVote = new Integer(otherCandidate.getVoteCount());
		return candidateVote.compareTo(otherCandidateVote);
	}
}
