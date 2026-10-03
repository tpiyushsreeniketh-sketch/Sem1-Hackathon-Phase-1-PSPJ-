import java.util.*;
public class Hackathon1Q2
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Water Consumption(In Litres)");
        double cons = sc.nextDouble();
        int bill = 0;

        if(cons<=500)
        {
            bill = 100;
        }
        else
        if(cons>500)
        {
            bill = 200;
        }
        System.out.println("Water Bill: " + bill);
        sc.close();

    }
}