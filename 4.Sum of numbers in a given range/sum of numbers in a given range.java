import java.util.Scanner;
public class MyClass {
    public static void main(String args[])
    {
        int s,e,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start Range =");
        s=sc.nextInt();
        System.out.println("Enter the End Range =");
        e=sc.nextInt();
        for (int i=s;i<=e;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of Range "+s+" to "+e+" is = "+sum);
    }
}
