import java.util.Scanner;
class quads
{
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the coefficient of x^2:");
        double coeff1 = s.nextDouble();
        System.out.println("Enter the coefficient of x:");
        double  coeff2 = s.nextDouble();
        System.out.println("Enter the constant term:");
        double  coeff3 = s.nextDouble();

        double temp1 = Math.sqrt(coeff2 * coeff2 - 4 * coeff1 * coeff3);
 
        double root1 = (-coeff2 +  temp1) / (2*coeff1) ;
        double root2 = (-coeff2 -  temp1) / (2*coeff1) ;
 
        System.out.println("The roots of the Quadratic Equation are x = "+root1+" and  x = "+root2);
 
    }
}