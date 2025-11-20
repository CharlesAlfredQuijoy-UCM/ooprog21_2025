// Program prompts user to enter a series of integers
// separated by spaces and sums them
import java.util.*;

public class DebugSeven2
{
    public static void main(String[] args)
    {
        String str;
        int length;
        int lastSpace = -1;
        int sum = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a series of integers separated by spaces >> ");
        str = in.nextLine();
        length = str.length();

        for(int x = 0; x < length; x++)
        {
            if(str.charAt(x) == ' ')
            {
                String partStr = str.substring(lastSpace + 1, x);
                int num = Integer.parseInt(partStr);
                System.out.println(num);
                sum += num;
                lastSpace = x;
            }
        }

        // last number
        String partStr = str.substring(lastSpace + 1, length);
        int num = Integer.parseInt(partStr);
        System.out.println(num);
        sum += num;

        System.out.println("-----------------------");
        System.out.println("The sum of the integers is " + sum);
    }
}
