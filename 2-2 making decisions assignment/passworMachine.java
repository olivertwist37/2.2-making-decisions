import java.util.Scanner;
public class passworMachine{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("What's the password? ");
        String passwordAttempt = myObj.nextLine();
        if(passwordAttempt.equals("dragon")){
            System.out.println("Correct! My secret is: I am Batman.");
        }else{
         System.out.println("Incorrect Password! My secret is still safe ...");   
        }
    }
}
