import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Numbers {

    public void findMidPoint(int a , int b){
        while (a++ < b--);
        System.out.println("Midpoint is " + a);
    }

    public boolean isPrime(int number){
        boolean isPrime ;
        if(number <2) isPrime = false;
        else isPrime = true;

        for (int i = 2 ; i <= number/i ; i++){
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public void forLoopControlledByTwoVar(){
        int a , b ;
        for (a = 0 , b = 20 ; a < b ; a++ , b--){
            System.out.println(a + " , " + b);
        }
    }


    public void booleanExpressionFor(){
        boolean check = true;
        for (int i = 0 ; check ; i++){
            System.out.println(i);
            if (i == 6){
                check = false ;
            }
        }
    }

    public void oddForExample(){
        boolean check = false;
        int i = 0 ;
        for ( ; !check ;){                   //Instead using a " while(!check) makes more sense.
            if (i == 10) check = true;
            System.out.println(i);
            i++;
        }
    }

    public void forEachExample(){
        int[] newArray = new int[10];
        Arrays.fill(newArray , 1);
        for (int i : newArray){
            System.out.println(newArray[i]);
        }
    }

    public void sortGivenArrayAndPrint(int[] array){
        Arrays.sort(array);
        for (int j : array) {
            System.out.println(j);
        }
    }

    public boolean cycleThroughArrayIfValueIsPresent(int[] array , int value){
        boolean isPresent = false;
        for (int j : array){
            if (j == value){
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    public void findDuplicateValues(int[] array){
        Set<Integer> duplicates = new HashSet<>();
        for (int j : array){
            if (!duplicates.add(j)){
                System.out.println("Found duplicate bro : " +j);
            }
        }
    }

    public void continueStatementExample(){
        for (int i = 0 ; i < 10 ; i++){
            System.out.println(i + " ");
            if (i % 2 == 0 ) continue;
            System.out.println(" ");
        }
    }




}
