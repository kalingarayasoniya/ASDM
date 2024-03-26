import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sacn=new Scanner(System.in);
        System.out.println("Enter key 1 on the keyboard");
        int n=sacn.nextInt();
        if(n==2)
        {
            System.out.println("You have pressed correct");
        }
        else {
            System.out.println("You have pressed not correct");
        }
    }

}

