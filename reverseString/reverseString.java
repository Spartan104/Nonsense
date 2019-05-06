import java.util.Scanner;
public class reverseString {
    //Why am I commenting again?
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        System.out.print( "Please input your name );
        String name = scan.nextLine();
        System.out.print( ReverseName(name) );
    }
    //Helper methods that don't do anything!
    private static String ReverseName(String s)
    {
        String rs = "";
        for ( int i = 0; i < s.length(); i++ )
        {
            rs += s.charAt(s.length() - i);
        }
        return rs;
    }
}
