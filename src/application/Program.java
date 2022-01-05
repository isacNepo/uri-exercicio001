package application;

import java.util.Scanner;

import entities.Maior;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Digite 3 numeros:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
   
        Maior maior = new Maior(a, b, c);
        
        System.out.println("O maior é o " + maior.oMaior(a, b, c)); 
        sc.close();
	}
}
