public class Recursive {

    public int recursiveFact(int n){
        if (n == 1) return 1 ;
        return fact(n-1) * n ;
    }

    public int sum(int min , int max){
        if (max > min){
            return max + sum(min , max-1);
        }else{
            return max ;
        }
    }


    public int fact(int number){
        int result =1;
        if (number == 1) return 1;
        while (number>1){
            result *= number;
            number --;
        }
        return result;
    }


}
