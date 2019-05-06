import java.util.Scanner;
public class average {
    public static void main ( String[] args)
    {
        Scanner scan = new Scanner ( System.in );
        System.out.print( "Type in two numbers with a space between them.");
        Double first = scan.nextDouble();
        Double second = scan.nextDouble();
        System.out.print( averaged(first, second));
    }
    private static Double averaged(Double a, Double b)
    {
        return a + b / 2;
    }
}
