import java.util.Scanner;
class Expression{
    double x, a, b;
    Expression(double x, double a, double b){
        this.x = x;
        this.a = a;
        this.b = b;
    }

    public double firstExpression(){
        return 3 * x + 5;
    }
    public double secondExpression(){
        return (a + b) / (a - b);
    }

    public double thirdExpression(){
        double res = 1;
        double n = a * x / b;
        for (int i = 1; i <= n; i++){
            res *= i;
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args){
        Expression exp1 = new Expression(1, 2, 3);
        Expression exp2 = new Expression(4.2, 3, 3.5);
        Expression exp3 = new Expression(7.8, 2, 3.9);

        double y1 = exp1.firstExpression();
        double y2 = exp2.secondExpression();
        double y3 = exp3.thirdExpression();

        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
    }
}