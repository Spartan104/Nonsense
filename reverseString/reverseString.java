import java.util.Scanner;
public class reverseString {

    // Why am I commenting again?
    // Because it's useful for ME!!! -Cole
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        System.out.print( "Please input your name" );
        String name = scan.nextLine();
        System.out.println( "Your name, reveresed, is: " + reverseName(name) );
    }


    // Helper methods that don't do anything!
    // We should probably use StringBuilder, but... oh well...
    private static String reverseName(String s)
    {
        String rs = "";
        // Start at the end of the string and go to the front
        for ( int i = s.length - 1; i >= 0 ; i-- )
        {
            // Append the char to the new string
            rs += s.charAt(i);
        }
        return rs;
    }
}
