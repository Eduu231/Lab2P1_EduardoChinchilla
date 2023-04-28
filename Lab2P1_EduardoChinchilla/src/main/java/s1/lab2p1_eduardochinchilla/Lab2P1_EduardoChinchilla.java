package s1.lab2p1_eduardochinchilla;

import java.util.Scanner;

public class Lab2P1_EduardoChinchilla {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int opcion = 0;
        boolean t = true;
        while (t) {

            System.out.println("1. Clasificando numeros ");
            System.out.println("2. Aproximando PI");
            System.out.println("3. MCD ");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opcion: ");

            opcion = read.nextInt();

            switch (opcion) {
                case 1: {
                    int i = 1;
                    int cont = 0;
                    boolean f = false;
                    boolean par = false;

                    System.out.println("Ingrese un numero: ");
                    int num = read.nextInt();

                    while (num < 0) {
                        System.out.println("Ingrese un numero: ");
                        num = read.nextInt();
                    }
                    while (i <= num) {
                        if (num % i == 0) {
                            cont++;
                        }
                        i++;
                    }
                    if (cont == 2) {
                        f = true;

                    } else {
                        f = false;

                    }
                    if (num % 2 == 0) {
                        par = true;

                    } else {
                        par = false;
                    }
                    if (f == true) {
                        if (par == true) {
                            System.out.println("El numero es par y primo");
                        } else {
                            System.out.println("El numero es impar y primo");
                        }
                    } else if (f == false) {
                        if (par == true) {
                            System.out.println("El numero es par");
                        } else {
                            System.out.println("El numero es impar");
                        }
                    }

                    break;
                }
                case 2: {
                    System.out.println("Ingrese el limite de la formula: ");
                    int n = read.nextInt();
                    double resp = 1;
                    int i = 1;

                    while (i <= n) {
                        double parte1 = 4 * Math.pow(i, 2);
                        double parte2 = 4 * Math.pow(i, 2) - 1;
                        resp *= ((double) parte1 / (double) parte2);
                        i++;
                    }
                    resp = resp * 2;
                    System.out.println("PI: " + resp);
                    break;
                }
                case 3: {

                    System.out.println("Ingrese numero A: ");
                    int num1 = read.nextInt();
                    System.out.println("Ingrese numero B: ");
                    int num2 = read.nextInt();

                    int x = num1;
                    int y = num2;
                    
                    while (num1 <= 0 || num2 <= 0) {
                        System.out.println("Error, numeros ingresados deben ser mayor a 0");
                        System.out.println("Ingrese un numero: ");
                        num1 = read.nextInt();
                        System.out.println("Ingrese un numero: ");
                        num2 = read.nextInt();
                    }
                    while (num1 != num2) {
                        if (num1 > num2) {
                            num1 = num1 - num2;

                        } else {
                            num2 = num2 - num1;
                        }

                    }
                    System.out.println(" El MCD de " + x + " y " + y + " es " + num1);
                    break;
                }
                case 4: {
                    t = false;
                    System.out.println("Ha salido del menu");
                    break;
                }

                default:
                    System.out.println("Opcion ingresada no valida, vuelva a ingresar: ");
            }//fin switch
        }//fin while
    }//fin main
}//fin class 
