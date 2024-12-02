import java.util.*;
public class accept{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String a=s.next();
        int b;
        b=s.nextInt();
        String c=String.format("The name of the person is %s and age is %d",a,b);
        System.out.println(c);
    }
}