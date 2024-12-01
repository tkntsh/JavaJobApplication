import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Job
{
    int start, finish, profit;
 
    Job(int start, int finish, int profit)
    {
        this.start = start;
        this.finish = finish;
        this.profit = profit;
    }
}
 
class Main
{
    //function to find the maximum profit of non-overlapping jobs using LIS
    public static int findMaxProfit(List<Job> jobs)
    {
        //sort the jobs according to increasing order of their start time
        Collections.sort(jobs, Comparator.comparingInt(x -> x.start));
 
        //get the number of jobs
        int n = jobs.size();
 
        //ase-case
        if (n == 0) {
            return 0;
        }
 
        //`maxProfit[i]` stores the maximum profit of non-conflicting jobs
        //ending at the i'th job
        int[] maxProfit = new int[n];
 
        //consider every job
        for (int i = 0; i < n; i++)
        {
            //initialize current profit to 0
            maxProfit[i] = 0;
 
            //consider each `j` less than `i`
            for (int j = 0; j < i; j++)
            {
                //if the j'th job is not conflicting with the i'th job and
                //is leading to the maximum profit
                if (jobs.get(j).finish <= jobs.get(i).start
                        && maxProfit[i] < maxProfit[j]) {
                    maxProfit[i] = maxProfit[j];
                }
                System.out.println(maxProfit[j]);
            }
 
            //end the current task with i'th job
            maxProfit[i] += jobs.get(i).profit;
        }
 
        //return the maximum profit
        return Arrays.stream(maxProfit).max().getAsInt();
    }
 
    public static void main(String[] args)
    {
        List<Job> jobs = Arrays.asList(
                new Job( 1, 3, 3, 5, 2 ),
                new Job( 1, 2, 4, 2, 6 ),
                new Job( 3, 2, 4, 2, 6 )
        );
 
        System.out.println("The maximum profit is " + findMaxProfit(jobs));
    }
}