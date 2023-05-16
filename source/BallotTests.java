import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.*;
import java.util.*;

public class BallotTests {


  private Ballot testCompleteBallot;

  public void testBallotConstructor() {
    testCompleteBallot = new Ballot("Office");
  }

  //getting the name of the office
  public void testGetOffice() {
    assertEquals("Office", testCompleteBallot.getOfficeName());
  }

  //adding Candidate to Ballot, listing all candidates
  public void testAddGetListCandidates() {

    //adds candidate to Ballot object using addCandidate, uses getCandidates to return a list
    testCompleteBallot.addCandidate(new Candidate("Name 1", "Blue Party"));
    testCompleteBallot.addCandidate(new Candidate("Name 2", "Red Party"));
    ArrayList<Candidate> testCandidatesList = testCompleteBallot.getCandidates();

    //creates a list and adds the same candidates to them
    ArrayList<Candidate> testAssertList = new ArrayList<Candidate>();
    testAssertList.add(new Candidate("Name 1", "Blue Party"));
    testAssertList.add(new Candidate("Name 2", "Red Party"));

    //puts both lists into Strings to list the candidates and makes sure they're the same
    assertEquals(testCandidatesList.toString(), testAssertList.toString());
  }


}
