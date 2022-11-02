package interviewprograms.array_programs;

public class FindMinMaxInMultidimensionArray {
    public static void main(String[] args) {
        int a[][]= {
                {1,2,3},
                {5,6,77},
                {34,1,56,33,9}
        };

        int min = a[0][0];
        int max = a[0][0];

        for(int i=0; i<a.length;i++)
        {
            for(int j=0; j<a[i].length;j++)
            {
                if(a[i][j]<min)
                    min = a[i][j];

                if(a[i][j]>max)
                    max = a[i][j];
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
    }
}
