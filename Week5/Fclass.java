// GRPA-1

import java.util.*;
//Add your code for ComplexNum here
class ComplexNum<T extends Number> {
    private T r;
    private T i;
    
    public ComplexNum(T real, T img) {
        this.r = real;
        this.i = img;
    }
    
    public ComplexNum<Double> add(ComplexNum<? extends Number> p) {
        ComplexNum<Double> val = new ComplexNum<Double>(0.0, 0.0);
        val.r = this.r.doubleValue() + p.r.doubleValue();
        val.i = this.i.doubleValue() + p.i.doubleValue();
        
        return val;
    }
   	
	 	@Override 	
    public String toString() {
			return String.format("%.2f + %.2fi", r.doubleValue(), i.doubleValue());
    }
}

class Fclass{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        double d1, d2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();
        ComplexNum<Integer> c1 = new ComplexNum<Integer>(n1, n2);
        ComplexNum<Double> c2 = new ComplexNum<Double>(d1, d2);
        ComplexNum<Double> c3 = c1.add(c2);
        System.out.println(c1 + " + " + c2 + " = " + c3);
    }
}
