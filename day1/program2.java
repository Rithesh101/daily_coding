package day1;
import java.util.*;

public class program2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int count = 0;

        int n = sc.nextInt();
        while(n>0){

            int rem = n%10;
            if (rem%2 ==0){
                count++;
            }

            n = n/10;

        }
        System.out.println(count);
        
        sc.close();

    }
    
}
