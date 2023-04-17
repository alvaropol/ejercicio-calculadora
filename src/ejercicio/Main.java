package ejercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1, num2, result, suma;
		int menu = 0;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("1-Sumar\n" + "2-Restar\n" + "3-Multiplicar\n" + "4-Dividir\n"
					+ "5-Resto de una operación\n" + "0-SALIR");
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) {

			case 1 -> {
				System.out.println("Introduzca el primer número:");
				num1 = Double.parseDouble(sc.nextLine());
				System.out.println("Introduzca el segundo número");
				num2 = Double.parseDouble(sc.nextLine());
				System.out.println("Resultado: " +(num1+num2));
				}
			
			case 2 -> {
				System.out.println("Introduzca el primer número:");
				num1 = Double.parseDouble(sc.nextLine());
				System.out.println("Introduzca el segundo número");
				num2 = Double.parseDouble(sc.nextLine());
				System.out.println("Resultado: " +(num1-num2));
				}
			
			case 3 -> {
				System.out.println("Introduzca el primer número:");
				num1 = Double.parseDouble(sc.nextLine());
				System.out.println("Introduzca el segundo número");
				num2 = Double.parseDouble(sc.nextLine());
				System.out.println("Resultado: " +(num1*num2));
				}
			
			case 4 -> {
				System.out.println("Introduzca el primer número:");
				num1 = Double.parseDouble(sc.nextLine());
				System.out.println("Introduzca el segundo número");
				num2 = Double.parseDouble(sc.nextLine());
				System.out.println("Resultado: " +(num1/num2));
				
			}
		
			case 5 -> {
				System.out.println("Introduzca el primer número:");
				num1 = Double.parseDouble(sc.nextLine());
				System.out.println("Introduzca el segundo número");
				num2 = Double.parseDouble(sc.nextLine());
				System.out.println("Resto: " +(num1%num2));
				
			}
		
		

			}

		} while (menu != 0);
	}

}
