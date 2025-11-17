package day4;

public class program4 {

    public static void main(String[] args){

        int[] ar = {1,2,9,99};
        int max = 0;
        for(int i :ar){
            if (i>max){
                max = i;

            }
        }
        System.out.print(max);
    }
    
}
