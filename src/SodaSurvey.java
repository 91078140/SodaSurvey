// Timothy Wilks
import java.text.DecimalFormat;

public class SodaSurvey
{
    // determines and prints the average of each row (soda) and
    // each column (respondent) of the survey scores
    public static void main(String[] args)
    {
        int[][] scores = { {3,4,5,2,1,4,3,2,4,4}, {2,4,3,4,3,3,2,1,2,2},
                           {3,5,4,5,5,3,2,5,5,5}, {1,1,1,3,1,2,1,3,2,4} };
        final int Sodas = scores.length;
        final int People = scores[0].length;
        int[] sodaSum = new int[Sodas];
        int[] personSum = new int[People];

        for (int soda = 0; soda < Sodas; soda++)
        {
            for(int person = 0; person < People; person++)
            {
                sodaSum[soda] += scores[soda][person];
                personSum[person] += scores[soda][person];
            }//end of nested for loop
        }// end of 1st for loop

        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("Averages:\n");
        for(int soda = 0; soda < Sodas; soda++)
        {
            System.out.println("Soda #" + (soda + 1) + ": "
                               + fmt.format((double)sodaSum[soda] / People));
        }// end of second for loop

        System.out.println();

        for(int person = 0; person < People; person++)
        {
            System.out.println("Person #" + (person + 1) + ": "
                    + fmt.format((double)personSum[person] / Sodas));
        }//end of nested for loop


    }// end of main method
}// end of class
