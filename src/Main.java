public class Main {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int count = 0;
        if (a) {
            count++;
        }
        if (b) {
            count++;
        }
        if (c) {
            count++;
        }
        if (d) {
            count++;
        }
        return count == 2;
    }
    public static void main(String args[]){
        boolean a = booleanExpression(true, false, false, false);
        System.out.println(a);
    }
}