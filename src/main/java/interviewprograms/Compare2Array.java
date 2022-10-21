package interviewprograms;

public class Compare2Array {

    public static void main(String[] args) {
        int a[]= {1,2,3,4,5};
        int b[]= {1,2,4,5};
        int c[]= {1,2,3};
        int d[]= {1,2,3,4,5};
        int e[]= {1,2,3,4,5,6};

        System.out.println("If a==b: "+eq(a,b));
        System.out.println("If a==c: "+eq(a,c));
        System.out.println("If a==d: "+eq(a,d));
        System.out.println("If a==e: "+eq(a,e));

    }

    private static boolean eq(int a[], int b[])
    {
        if(a.length != b.length)
            return false;

        for(int i=0 ; i<a.length; i++)
        {
            if(a[i]!=b[i])
                return false;
        }
        return true;

    }
}
