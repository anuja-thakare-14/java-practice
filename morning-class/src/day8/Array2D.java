package day8;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = {
                        {2,3,4,5},
                        {6,7,8,9}
                      }; // took 2 arrays

       //i block for roes and j block for columns
        for(int i =0; i<2; i++){
            for(int j = 0; j<4; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }
}
