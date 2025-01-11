package day8;

public class ArraySum2D {
    public static void main(String[] args) {
        int[][] arr = {
                {2,3,4,5},
                {6,7,8,9}
        }; // took 2 arrays

        int sum =0;
        for(int i=0; i<2; i++){
            for(int j = 0; j<4; j++){
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum); //Poore loop execute hone ke baad sum print karega. So written here.
    }
}
