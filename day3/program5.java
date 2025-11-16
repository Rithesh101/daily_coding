package day3;

public class program5 {

    public static void main(String[] args){


        int[] arr = {12, 74, 39, 10,91, 98, 35, 83, 90, 71, 34, 76};

        int sum = 0;
        int count =0;
        int k = 8;

        for(int i =0; i <arr.length; i++){
            while(arr[i]>0){
                int rem = arr[i]%10;
                sum += rem;
                arr[i] = arr[i]/10;
                
            }
            if ( sum>k){
                count++;
            }
            sum = 0;
        }
        System.out.print(count);
    }
    
}
