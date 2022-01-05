package test;

import java.util.Locale;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int a;
        int b;
        int c;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if (a>b && a>c) {
        	System.out.println("O maior é o " + a);
        }
        else if(b>a && b>c) {
        	System.out.println("O maior é o " + b);
        }
        else {
        	System.out.println("O maior é o " + c);
        }
        
        sc.close();
	}

}
