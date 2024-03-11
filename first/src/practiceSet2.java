import java.util.Scanner;

public class practiceSet2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x value:");
        int x=sc.nextInt();

        System.out.println("enter y value:");
        int y=sc.nextInt();
        String op=x>y?"x is greater":"y is greater"; //using ternary and relational operators
        System.out.println(op);

        double ans = (Math.pow((double)x,(double)2)-Math.pow((double)y,(double)2))/2;
        System.out.println("equation ans:\n"+ans);

        x=7;
        int a=x*49/x+35/x;
        System.out.println("x = 7\na = x*49/x+35/x\na = "+a);
    }

}
