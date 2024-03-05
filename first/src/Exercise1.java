import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float sub1,sub2,sub3,sub4,sub5;
        System.out.println("Enter Subject 1 marks /100:");
        sub1=sc.nextFloat();
        System.out.println("Enter Subject 2 marks /100:");
        sub2=sc.nextFloat();
        System.out.println("Enter Subject 3 marks /100:");
        sub3=sc.nextFloat();
        System.out.println("Enter Subject 4 marks /100:");
        sub4=sc.nextFloat();
        System.out.println("Enter Subject 5 marks /100:");
        sub5=sc.nextFloat();
        float per=(sub1+sub2+sub3+sub4+sub5)/500;
        System.out.println("result : "+(per*100)+"%");


    }
}
