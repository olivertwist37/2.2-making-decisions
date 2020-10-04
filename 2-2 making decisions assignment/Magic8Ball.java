import java.util.Scanner;
public class Magic8Ball{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter your query");
        String query = myObj.nextLine();
        System.out.println("calculating");
        int amount1 = (int) (Math.random() * (20-1+1)+1);
        if(amount1==1){
            System.out.println("yes");
        }
        if(amount1==2){
            System.out.println("no"); 
        }
        if(amount1==3){
            System.out.println("maybe");
        }
        if(amount1==4){
            System.out.println("try again later");
        }
        if(amount1==5){
            System.out.println("it is unlikely");
        }
        if(amount1==6){
            System.out.println("it is probable");
        }
        if(amount1==7){
            System.out.println("mostly");
        }
        if(amount1==8){
            System.out.println("almost never");
        }
        if(amount1==9){
            System.out.println("you may make it so");
        }
        if(amount1==10){
            System.out.println("if the stars align");
        }
        if(amount1==11){
            System.out.println("better not tell you now");
        }
        if(amount1==12){
            System.out.println("outlook not so good");
        }
        if(amount1==13){
            System.out.println("stupid of you to ask");
        }
        if(amount1==14){
            System.out.println("dont rely on it");
        }
        if(amount1==15){
            System.out.println("fuck no");
        }
        if(amount1==16){
            System.out.println("fuck yes");
        }
        if(amount1==17){
            System.out.println("only if you pee your pants");
        }
        if(amount1==18){
            System.out.println("illiman asks to get out of this thing");
        }
        if(amount1==19){
            System.out.println("not today");
        }
        if(amount1==20){
            System.out.println("maybe eventually");
        }
        if(amount1==21){
            System.out.println("thats a bad question");
        }
    }
}
