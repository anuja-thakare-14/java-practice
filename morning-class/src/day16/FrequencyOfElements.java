package day16;
// find the occurance of the elements:
import  java.util.HashMap;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {2,4,3,6,2,2,5,5};
        HashMap<Integer, Integer> map = new HashMap<>();
        // To access all elements once , we use for loop.
        for(int i =0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                int x = map.get(arr[i]); // took x to store the current frequency of i;
                x=x+1;// incremented frequency.
                map.put(arr[i], x); // Replace the current value of arr[i] with x.
            }
            else{
                map.put(arr[i],1);
            }
        }

        // Print frequency
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i] + " : " + map.get(arr[i]));
        }

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        for(int i =0; i<arr.length; i++){
            System.out.print(map.get(arr[i])+" ");
        }
        System.out.println();

        // Find max from
        int max = Integer.MIN_VALUE;
        int key = -1;
        for(int i =0; i<arr.length; i++){
            if(map.get(arr[i]) > max) {
                max = map.get(arr[i]);
                key = arr[i]; // this element have max occurance
            }
        }
        System.out.println("MAX occurnace : "+ max);
        System.out.println("Max occurance of element : " + key);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number :");
//        int x = sc.nextInt();
//        if (map.containsKey(x))
//            System.out.println("Occurance of "+x+" :" + map.get(x));
//        else
//            System.out.println("Occurance of "+x+" :"+ 0);
    }
}
