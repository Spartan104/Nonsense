import java.util.Scanner;
public class randomInteger {
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner ( System.in );
        System.out.print( "Input the lowest digit you want and then the highest digit you want separated by spaces.");
        int lowest = scan.nextInt();
        int highest = scan.nextInt();
        System.out.print(randomized(lowest, highest));
    }
    private static int randomized ( int a, int b )
    {
        return (int)(Math.random()*a)+(b-a);
    }
}
