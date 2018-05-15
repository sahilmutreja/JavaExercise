package interviewprograms;

import java.util.Arrays;

public class CustomArrayList {

    private int actualSize;
    private Object[] list;


    public CustomArrayList(int size) {
        actualSize = 0;
        list = new Object[size];
    }

    public static void main(String[] args) {
        CustomArrayList a = new CustomArrayList(1);
        // Add Method
        a.add(10);
        a.add("Sahil");
        a.add(10.5);

        // Print custom array list
        System.out.println(a);

        // Get Method
        System.out.println("Get Value at position 1: " + a.get(0));

        // Remove Method
        System.out.println("Remove Value at position 2: " + a.remove(1));

        // Print custom array list
        System.out.println(a);

        // Size Method
        System.out.println("ArrayList size = " + a.size());
    }

    private Object remove(int i) {
        if(i>-1 && i<actualSize){
            Object item = list[i];
            list[i] = null;
            while(i<actualSize){
                list[i]= list[i+1];
                list[i+1] = null;
                i++;
            }
            actualSize--;
            return item;
        }
        else
            throw new ArrayIndexOutOfBoundsException();
    }

    private int size() {
        return actualSize;
    }

    private Object get(int i) {
        if(i>-1 && i<actualSize)
            return list[i];
        else
            throw new ArrayIndexOutOfBoundsException();
    }

    private void add(Object i) {
        if(actualSize >= (list.length)){
            list = Arrays.copyOf(list,list.length*2);
            list[actualSize++] = i;
        }
        else
            list[actualSize++] = i;
    }
    public String toString(){
        return Arrays.toString(list);
    }
}
