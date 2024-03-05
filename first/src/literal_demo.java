import java.util.Scanner;

public class literal_demo {
    public static void main(String[] args) {
        String h=" Hey Abhi";
        System.out.println(h);

        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
        int a= sc.nextInt();
        System.out.println("enter 2nd number");
        int b= sc.nextInt();
        System.out.println("sum="+(a+b));
        sc.nextLine();
        String x=sc.nextLine();
        System.out.println(x);
    }
}
