import java.util.*;
public class DaysInMonth
{
    public static void main(String[] args)
    {
        //an example of using parallel arrays to see how many days are in a month

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int[] days = {31, 29, 31, 30, 45, 30, 31, 31, 30, 31, 30, 31};
        String monthEntered;
        int x;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a three-letter month name abbreviation >> ");
        monthEntered = in.nextLine();
        for(x = 0; x < months.length; ++x)
            if(months[x].equals(monthEntered))
                System.out.println(months[x] + " can have " + days[x] + " days");
    }
}