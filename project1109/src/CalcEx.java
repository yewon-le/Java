class Calc{
    public static int abs(int a){
        return a > 0 ?  a : -a;
    }
    public static int max(int a, int b) {
        return (a>b) ? a : b;
    }
    
    public static int min(int a, int b) {
        return (a>b) ? b : a;
    }
    
    public static int add1(int a, int b) {
    	return a+b;
    	
    }
    
    public static int add2(int a, int b, int c) {
    	return a+b+c;
    	
    }
    
    public static double add3(double a, double b) {
    	return a+b;
    	
    }
}
// --------------

public class CalcEx {
    public static void main(String[] args) {
    	System.out.println( Calc.abs(-5));
    	System.out.println( Calc.max(10, 8));
    	System.out.println( Calc.min(-3, -8));
    	System.out.println( Calc.add1(2, 3));
    	System.out.println( Calc.add2(2, 3, 4));
    	System.out.println( Calc.add3(0.1, 0.4));
    	
        
    }
}
