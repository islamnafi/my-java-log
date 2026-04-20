package basics;

import java.util.Scanner;

public class variables {

    public static void main(String[] args) {

        int a = 56;
        int b = 44;
        double c = 9.9;
        double d = 10.1;
        float e = 12.3f;
        float f = 7.7f;
        String s = "Hello World";

        System.out.printf("%s, I know you want to know the values of a and b so here are they a = %d and b = %d. \n", s, a, b);

        int m, n;

        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();

        System.out.printf("Here are the two stupid integers that you passed in - %d and %d", m, n);

    }

}
