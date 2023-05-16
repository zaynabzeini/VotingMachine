# Voting Machine Project
Within the documentation file, a user manual describing this project, with visuals, can be found. Below is a similar summary.

The software must first be compiled through the javac PerfectCandidate.java command and then run using java PerfectCandidate. 
The screen should display a window, asking for a path to the desired input file; it will give the option to browse for it or have the user manually enter its name as seen below. Once the file is chosen, the user should press “OK.”     
 
This software’s input is valid only in the form of a text file (.txt), following a specific format, that the software will read accordingly. This format is as follows: line one holds the name of the office up for election, the second line holds the number of candidates running for the office, and the subsequent lines each correspond with a candidate–holding information regarding their name and political party, separated by a semicolon. An example is as follows:
                  Milky Isle President
                  3
                  Molly Lou;Yellow Party
                  Autumn Star;Green Party
                  Elise Chalam;Blue Party 
The window should display the name of the office up for election and each candidate and their respective parties, giving the user the option to choose by clicking on their desired candidate. Once chosen, the user must click the “Cast Vote” button.
  
The window will then ask for confirmation of the voter’s choice, in which the user can cancel and return to the candidate list or continue on if it is, in fact, their desired candidate.
   
Once the user casts and confirms their vote, they will be alerted that their vote has been tallied, following which they should click “OK.”

This process is repeated for each voter. Once everyone has voted, the user must click the red escape option in the upper left hand corner of the window. The user should expect to see another window, asking to confirm that everyone has voted. If not, they may click “No” and return to the ballot to finish voting; if yes, the user will confirm by clicking the respective button.
 
The user will then be presented with a window asking for the path to the output file in which the results of the election will be displayed. They may browse for an already existing file or manually enter one.

The software’s output, which must be written to a text file (.txt), should be expected in a specific format as well. The first line will declare the results with the name of the office, followed by a line of dashes. Following the line of dashes, each candidate will have a line with their name, political party, and the number of votes they received. Following a blank line, the winner will be displayed with their name and political party, and in the case of a tie, no winner is declared. An example is as follows:
                  RESULTS - Milky Isle President
                  ------------------------------------------
                  Molly Lou - Yellow Party			110
                  Autumn Star - Green Party			  96
                  Elise Chalam - Blue Party			  97

                  WINNER: Molly Lou - Yellow Party

The user should navigate to the location of and open their output file in order to view the results.

 
