class quadraticsolving
{
    public static void main(String[] args)
    {
        int coeff1 = 2;
        int coeff2 = 6;
        int coeff3 = 4;

        double temp1 = Math.sqrt(coeff2 * coeff2 - 4 * coeff1 * coeff3);
 
        double root1 = (-coeff2 +  temp1) / (2*coeff1) ;
        double root2 = (-coeff2 -  temp1) / (2*coeff1) ;
 
        System.out.println("The roots of the Quadratic Equation \"2x^2 + 6x + 4 = 0\" are x = "+root1+" and  x = "+root2);
 
    }
}