package day8;

public class Array2DTraversal {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        // Normal traversal
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println();
        // Reverse traversal per row
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length-1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println();

        // Column traversal - transpose of a matrix - can be done only when all arrays of same length
        for (int j = 0; j < arr[0].length; j++){
            for (int i = 0;i< arr.length; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println();

        // ZIG ZIG traversal
        for (int i = 0; i < arr.length; i++) {
            if (i%2 == 0) { // EVEN
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println(" ");
        }
    }
}
