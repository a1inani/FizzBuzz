/**
 * Created by Alinani on 21/10/2015.
 */
public class FizzBuzz {
    public static void main(String args[]) {
        long startTime = System.nanoTime();
        for(int i = 0; i<=500; i++) {
            String str = "";
            if(i%3 == 0) {
                str += "Fizz";
            }
            if(i%5 == 0) {
                str += "Buzz";
            }
            if(str == "") {
                str += i;
            }
            System.out.println(str);
        }
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime);
    }
}
