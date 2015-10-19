package prueba;

import java.util.Scanner;


public class Prueba {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Lado?");
        float lado = sc.nextFloat(); 
        float area = lado*lado;
        System.out.println("El area es:\n"+ area);
    }
    
}
