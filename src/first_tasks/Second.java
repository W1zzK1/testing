package first_tasks;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a == b ^ b == c ^ a == c){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
