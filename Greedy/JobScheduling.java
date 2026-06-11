package Greedy;
import java.util.*;
import java.util.ArrayList;

public class JobScheduling{
    public static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i,int d,int p){
            this.id=i;
            this.deadline=d;
            this.profit=p;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs =new ArrayList<>();

        for(int i=0;i<jobsInfo.length;i++){
            jobs.add(new Job(i, jobsInfo[i][0],jobsInfo[i][1]));
        }

        Collections.sort(jobs,(obj1,obj2) -> obj2.profit-obj1.profit);

        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;int profit=0;
        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline>time){
                profit+=curr.profit;
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("Max job can be done is : "+seq.size()+" with profit : "+profit);
        for(int i=0;i<seq.size();i++){
            System.out.println("Job"+seq.get(i));
        }
        }
}