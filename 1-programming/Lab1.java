public class Lab1{
    public static void main (String[] args) {
        // 1. array c. odd numbers from 3-21
        long[] c = new long [10];
        long value = 3;
        for (int i=0; i<c.length; i++){
            c[i]= value;
            value +=2;
        }
        // 2. array x. 17 random number between -15.0 to 13.00
        // formula minimum + Math.random() * (maximum-minimum)
        double[] x = new double [17];
        for (int i=0; i<x.length; i++){
            x[i]= -15.0 + Math.random() *28.0;
        }
        // 3. Matrix b 10*17
        // seperatestaticmetod
        double [][] b = new double [10][17];
        for (int i=0; i<c.length; i++){
            for (int j=0; j<x.length; j++){
                b[i][j]=method(c[i],x[j]);
            }
        }
        printMatrix(b);
    }
///method
/// formulas Math.pow(any, any), used for to the power
    public static double method(long cValue, double xValue) {
        if (cValue == 9) {
        return Math.tan(Math.sin(xValue /3.0));
        }
        else if (cValue ==3 || cValue ==5 || cValue ==15 || cValue ==19 || cValue ==21) {
            double base = ((1.0 - Math.atan((xValue-1.0)/28.0))/0.5);
            double exponent = Math.cbrt((3.0 / 4.0)*(xValue-1.0));
        return Math.pow(base, exponent);
        }
        else {
            double inner = (2.0/3.0) * (Math.cbrt(xValue) -1.0);
            double exponent = Math.pow (inner, 3.0);
        return Math.cos(Math.exp(exponent));
        }
    }
/// printing
    public static void printMatrix(double [][] matrix) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j< matrix[i].length; j++){
            System.out.printf("%10.5f ", matrix [i][j]);
            }
        System.out.println();
        }
    }
}
