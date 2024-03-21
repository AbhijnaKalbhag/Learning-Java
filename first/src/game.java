import java.util.Scanner;
import java.util.Random;

public class game {
    public static void play(String user, String computer){
        if(user.equals(computer)){
            System.out.println("Tie!");
        }
        else if(user.equals("Rock")){
            if(computer.equals("Paper")) {
                System.out.println("Computer wins!");
            }
            if(computer.equals("Scissor")){
                System.out.println("You win!");
         }
        }
        else if(user.equals("Paper")){
            if(computer.equals("Scissor")) {
                System.out.println("Computer wins!");
            }
            if(computer.equals("Rock")){
                System.out.println("You win!");
            }
        }
       else{//user ="Scissor"
            if(computer.equals("Rock")) {
                System.out.println("Computer wins!");
            }
            if(computer.equals("Paper")){
                System.out.println("You win!");
            }
        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        String user=sc.nextLine();
        float computer=random.nextFloat(1);

        if(computer>=0.000000 && computer<=0.333334){
            System.out.printf("You picked %s\nComputer Picked Rock\n",user);
           play(user,"Rock");
        }
        else if(computer>0.333334 && computer<0.666668){
            System.out.printf("You picked %s\nComputer Picked Paper\n",user);
            play(user,"Paper");
        }
        else{
            System.out.printf("You picked %s\nComputer Picked Scissor\n",user);
            play(user,"Scissor");
        }


    }
}
