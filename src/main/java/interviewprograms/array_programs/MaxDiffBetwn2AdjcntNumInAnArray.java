package interviewprograms.array_programs;

public class MaxDiffBetwn2AdjcntNumInAnArray {
    static int a[] = {1,5,6,9,15,3};
    static int diff = 0;

    public static void main(String[] args) {
        for(int i=0; i<a.length-1; i++)
        {
            if(Math.abs(a[i+1]-a[i])>diff)
                diff=Math.abs(a[i+1]-a[i]);
        }
        System.out.println("Max diff between two adjacent no. in an array : "+diff);
    }
}
