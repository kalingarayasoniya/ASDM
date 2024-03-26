import java.util.Scanner;

public class Asmd
{
        public static void main(String args[])
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter two numbers");
            int a=scan.nextInt();
            int b=scan.nextInt();
            int c=a+b;
            System.out.println("Add:" +c);
            c = a-b;
            System.out.println("sub:" +c);
            c=a*b;
            System.out.println("multi:" +c);
            c=a/b;
            System.out.println("div:" +c);
        }



}
