// Gets a String from user
// Converts it to lowercase and counts letters
import java.util.*;

public class DebugSeven4
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String aString;
        int numLetters = 0;
        int stringLength;

        System.out.println("Enter a String. Include uppercase letters, lowercase letters, and numbers >> ");
        aString = kb.nextLine();

        aString = aString.toLowerCase();
        stringLength = aString.length();

        System.out.println("In all lowercase, the string is:");
        for(int i = 0; i < stringLength; i++)
        {
            char ch = aString.charAt(i);
            System.out.print(ch);

            if(Character.isLetter(ch))
                numLetters++;
        }

        System.out.println("\n");
        System.out.println("The number of CHARACTERS in the string is " + stringLength);
        System.out.println("The number of LETTERS is " + numLetters);
    }
}
