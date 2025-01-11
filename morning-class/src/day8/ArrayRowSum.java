package day8;

public class ArrayRowSum {
    public static void main(String[] args) {
        int[][] arr = {
                {2,3,4,5},
                {6,7,8},
                {9, 10}
        }; // took 2 arrays


        for(int i=0; i< arr.length; i++){
            int sum =0; // written in for loop bcz if written outside the loop , val of j will be i+j. so

            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]);
                sum = sum + arr[i][j];
            }
            System.out.print(" " + sum);
            System.out.println(" ");
        }
        System.out.println(" "); //Poore loop execute hone ke baad sum print karega. So written here.
    }
}
