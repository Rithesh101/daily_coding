package day1;

public class program5 {

    public static void main(String[] args){

        int[] nums = {1,2,3,4,5};

        int count = 0;

        int n = nums.length;
        int sum = 0;
        for (int i : nums){
            sum = sum+i;
        }
        int avg = sum/n;
        for( int j : nums){
            if ( j > avg){
                count++;

            }
        }

        System.out.print(count);




    }
    
}
