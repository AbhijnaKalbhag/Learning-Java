import java.util.Scanner;

public class Conditonals {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int age;
        age=sc.nextInt();
        if(age>=18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Ineligible to vote");
        }

        switch(age){
            case 0: {
                System.out.println("Invalid age");
            }
            break;

            case -10: {
                System.out.println("What!");
            }
            break;
            default:{
                System.out.println("test");
            }
            break;
        }
    }



}
