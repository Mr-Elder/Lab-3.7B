import static java.lang.System.out;

import java.util.*;
import java.text.*;

public class Lab3_7B{

    public static void main (String[] args){

   		int votesForPolly = 0, votesForErnest = 0, totalPolly = 0, totalErnest = 0, precincts = 0;
   		double totalVotes = 0;
   		
   		DecimalFormat fmt = new DecimalFormat("##");

    	char response;      // answer ('y' or 'n') to the "more precincts" question

		
		do{
			precincts++;
			
			votesForErnest = GetInfo.getInt("How many votes for Ernest at this precinct?");
			votesForPolly = GetInfo.getInt("How many votes for Polly at this precinct?");
			
			totalErnest += votesForErnest;
			totalPolly += votesForPolly;
			
			if(GetInfo.getYesNo("Another precinct?"))
				response = 'y';
			else response = 'n';
		}while(response == ('y'));
    
    	totalVotes = totalErnest + totalPolly;
    
    	GetInfo.showMessage("Total Presincts : " + precincts + "\nTotal votes for Ernest : " + totalErnest + "\n Total votes for Polly : " + totalPolly + "\n\n Ernest Percent : " + fmt.format(totalErnest / totalVotes * 100.0) + "%\n Polly percent : " + fmt.format(totalPolly / totalVotes * 100.0) + "%");
    }

}