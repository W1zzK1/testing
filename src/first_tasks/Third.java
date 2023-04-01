package first_tasks;

public class Third {
    public static void main(String[] args) {
        double a = 9.12;
        double b = 5.7;
        double c = 2.1;

        if ((c > b & b > a) ^ (a > b & b > c)){
            a *= 2;
            b *= 2;
            c *= 2;
            System.out.println("Удвоенные числа a : " + a + ", b : " + b + ", c : " + c);
        } else {
            a = -a;
            b = -b;
            c = -c;
            System.out.println("Противоположные значения чисел a : " + a + ", b : " + b + ", c : " + c);
        }
    }
}
