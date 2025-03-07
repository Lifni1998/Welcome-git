import java.util.Scanner;
public class a {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int b=obj.nextInt();
        System.out.println("Enter the second number:");
        int c=obj.nextInt();
        int d;
        d=b-c;
        System.out.println("Result is:"+d);
}
}