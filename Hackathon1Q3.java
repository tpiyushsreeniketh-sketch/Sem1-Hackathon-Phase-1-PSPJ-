import java.util.Scanner;

public class Hackathon1Q3
{
   static int calculateTotal(int morningUsage , int eveningUsage)
    {
        return morningUsage + eveningUsage;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter Morning Water Usage (In Litres)");
        int morningUsage = sc.nextInt();
        System.out.println("Enter Evening Water Usage (In Litres)");
        int eveningUsage = sc.nextInt();

       
       
        int total = Hackathon1Q3.calculateTotal(morningUsage , eveningUsage);

        System.out.println("Total Water Usage: " + total);

    }
}