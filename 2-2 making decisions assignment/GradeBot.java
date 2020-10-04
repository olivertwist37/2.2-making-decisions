import java.util.Scanner;
public class GradeBot{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("what was the test out of?");
        double testQ = myObj.nextDouble();
        System.out.println("what was your mark rounded to the closesnt integer?");
        double testMark = myObj.nextDouble();
        double mark=-1;
        if (testMark>=0&&testQ>=1&&testMark<=testQ){
         mark =  (testMark/testQ*100);
               System.out.println(mark);
        }else {
         System.out.println("Error: invalid numbers entered");
        }
        if (mark>=0){
        if (mark>=86){
         System.out.println("what you got "+mark+"% A good job");
        }else if (mark>=73){
         System.out.println("what you got "+mark+"% B thats not bad");
        }else if (mark>=67){
         System.out.println("what you got "+mark+"% C+ you better do better next time");
        }else if (mark>=60){
         System.out.println("what you got "+mark+"% C uh oh");
        }else if (mark>=50){
         System.out.println("what you got "+mark+"% C- this is not looking good");
        }else if (mark>=0){
         System.out.println("what you got "+mark+"% F oh shit");
        }else{
         System.out.println("Error: negative percentage");
        }
     }
    }
}
