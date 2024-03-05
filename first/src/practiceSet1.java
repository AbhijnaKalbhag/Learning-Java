import java.util.Scanner;
public class practiceSet1 {
    public static void main(String[] args) {
        //hello user input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        System.out.println("Hello "+sc.nextLine()+"\nHappy coding🚴🏾!! ");

        //input is integer or not
        System.out.println("enter input");
        System.out.println("given input is a integer: "+sc.hasNextInt());

    }
}
