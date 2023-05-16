import static org.junit.Assert.*;
import org.junit.Test;

public class CandidateTests {

  //creating candidate
  private Candidate testPerson;

  //getting the name and affiliation
  public void testCandidateConstructor() {
    testPerson = new Candidate("Name", "Party");
    assertEquals("Name", testPerson.getName());
    assertEquals("Party", testPerson.getAffiliation());
  }

  //getting the vote count, updating the vote count
  public void testGetTallyVote() {
    assertEquals(0, testPerson.getVoteCount());
    testPerson.tallyVote();
    assertEquals(1 ,testPerson.getVoteCount());
    testPerson.tallyVote();
    testPerson.tallyVote();
    assertEquals(3 ,testPerson.getVoteCount());
  }

  //representing the candidate as string
  public void testToString() {
    assertEquals("Name - Party", testPerson.toString());
  }

}
