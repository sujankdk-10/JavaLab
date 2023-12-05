//WAP to create a single dimension array to store first 15 natural numbers and display the sum of 3rd and last element of the array.

public class num1 {
    public static void main(String[] args){
        int[] arr= new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int sum=0;
        sum=arr[2]+arr[14];

        System.out.printf("The sum of 3rd and last element is %d",sum);

    }
}