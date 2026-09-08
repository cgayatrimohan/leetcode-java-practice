package coddy;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        for(int i = 0; i < num; i++) {
            System.out.print(fibo(i) + " ");
        }    
    }

    public static int fibo(int num) {
        if(num == 0) return 0;
        if(num == 1) return 1;
        return fibo(num - 1) + fibo(num - 2);
    }
}

/**
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int x1 = 1, x2 = 1, x3 = 2;
	System.out.print(x1 + " " + x2 + " ");
	while (x3 <= n) {
    	System.out.print(x3 + " ");
    	x1 = x2;
    	x2 = x3;
    	x3 = x1 + x2;
	}
}
*/