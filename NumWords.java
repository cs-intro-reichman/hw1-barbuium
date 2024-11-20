public class NumWords {

    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);

       int hundreds = number1 / 100;
       int tens = (number1 / 10) % 10;  
       int ones = number1 % 10; 
       System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones." );
       
    }
}
