import java.util.*;
public class HackathonQ1
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Family Members");
        int fam = sc.nextInt();

        System.out.println("Enter Consumption(In Litres)");
        double cons = sc.nextDouble();

        System.out.println("Enter House Number");
        int Hno = sc.nextInt();

        System.out.println("Enter Water Usage Status");
        char watstatus = sc.next().charAt(0);

        System.out.println("Family Members: "  +  fam);
        System.out.println("Consumption: " + cons);
        System.out.println("House Number: " + Hno);
        System.out.println("Water Status: " + watstatus);
    }
}