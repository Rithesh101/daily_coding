package day1;
import java.util.Scanner;

public class program3 {

    public static void main(String[] args){

        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1; i<=n; i++){
            if (n%i==0){
                count++;
            }
        }
        System.out.println(count);
        sc.close();


    }
    
}
