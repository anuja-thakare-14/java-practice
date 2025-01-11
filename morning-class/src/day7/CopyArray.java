package day7;
// copy every element from a to b:
public class CopyArray {
    public static void main(String[] args) {
        int[] a = {2,1,3,4,5};
        int[] b = new int[7];

        int minLength = Math.min(a.length, b.length); // take minimum length as we dont want array out of index

        //to copy values from A to B. in same order
        for (int i =0;i<minLength;i++) {
            b[i] = a[i];
        }

        //to copy values from A to B. in reverse order

        for (int i=0; i<a.length;i++) {
            System.out.println(a[i]);
        }

        for (int i=0; i<b.length;i++) {
            System.out.println(b[i]);
        }
    }
}
