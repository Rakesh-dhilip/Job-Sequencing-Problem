//Job Sequencing Problem
public class JOB {

    public static void main(String[] args) {

        char name[]={'1','2','3','4'};//JOB title
        int dl[] = {1,1,4,1};//deadline
        int profit[] ={40,30,20,10};//profit

        char cap[] = new char[2];
        for (int i =0;i<2 ;i++)
        {
            cap[i]='\0';
        }

        int j;
        int i =0;

        j = dl[i]-1;

        while (i<4)
        {

            if(j<0) {
                i++;
                if(i<4)
                j = dl[i]-1;
            }
            else if(j<2 && cap[j]=='\0')
            {
                cap[j] = name[i];
                i++;
                if(i<4)
                j = dl[i]-1;

            }
            else
               j=j-1;

        }

        for (int i1 =0 ; i1< 2 ; i1++)
            System.out.println(cap[i1]);
    }
}
