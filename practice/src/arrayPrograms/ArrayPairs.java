package arrayPrograms;

public class ArrayPairs {
    public static void main(String[] args) {
        int[] arr = {6,1,2,3};

        int count = 0;
        for(int i=0; i<arr.length; i++){

            for(int j =i+1; j<arr.length; j++){
                System.out.print(arr[i] + " " +arr[j] + " = ");
                System.out.print(arr[i] + arr[j]);
                if ((arr[i] + arr[j]) %2 == 0) {
                    System.out.print(" Divisible by 2");
                    count = count + 1;
                }
                System.out.println();
            }
        }

        System.out.println("COUNT : "+count);




    }
}
