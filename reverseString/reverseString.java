import java.util.Scanner;
public class reverseString {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        System.out.print( "Please input your name" );
        String name = scan.nextLine();
        System.out.print( reverseName(name) );
    }
    private static String reverseName(String s)
    {
        String rs = "";
        for ( int i = 0; i < s.length(); i++ )
        {
            rs += s.charAt(s.length() - i);
        }
        return rs;
    }
}
