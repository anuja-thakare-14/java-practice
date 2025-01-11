//Reverse an array and store it in New Array:

package day7;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] a ={2,4,3,6,5};
        int[] b = new int[5];

        // printing an array:
        for(int i =0; i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(); // for new line

        //Reversing an array
        for(int i =0; i<b.length; i++) {
            int index = a.length - (i+1);// Reverse index.
            b[i] = a[index];
        }
        //printing b:
        for(int i=0; i<b.length;i++){
            System.out.print(b[i] + " ");
        }

    }
}
