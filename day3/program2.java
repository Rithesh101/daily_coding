package day3;

public class program2 {

    public static void main(String[] args){


        int n = 709456;
        int even = 0;
        int odd = 0;

while(n>0){
    

    int rem = n%10;
    if(rem%2==0){
        even++;
    }else{
        odd++;
    }
    n = n/10;

}
System.out.print("even: "+even+"odd: "+odd);
        
    }
    
}
