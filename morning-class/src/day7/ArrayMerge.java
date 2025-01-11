package day7;

// Merge A & B and Print the merged value and Display it on the console

public class ArrayMerge {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {9,7};

        int[] c = new int[a.length+b.length];

        for(int i = 0; i<a.length; i++){
            c[i]=a[i];
        }

        int al = a.length; // to keep modified value of a's length
        for(int i = 0; i<b.length; i++){
            c[al + i] = b[i];
        }
        System.out.print("{");
        for(int i=0; i<c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.print("}");
    }
}
