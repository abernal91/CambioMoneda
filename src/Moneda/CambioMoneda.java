package Moneda;

import java.util.Scanner;

public class CambioMoneda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);

	        // Definir las tasas de cambio
	        final double TASA_EURO_A_DOLAR = 1.1; // Ejemplo: 1 Euro = 1.12 Dólares
	        final double TASA_DOLAR_A_EURO = 0.91; // Ejemplo: 1 Dólar = 0.90 Euros

	        System.out.println("Bienvenido a la aplicación de cambio de moneda");
	        System.out.println("Seleccione la moneda de origen y moneda de destino:");
	        System.out.println("1. Convertir de Euros a Dólares");
	        System.out.println("2. Convertir de Dólares a Euros");

	        int opcion = scanner.nextInt();
	        double cantidad;

	        switch (opcion) {
	            case 1:
	                System.out.print("Ingrese la cantidad en Euros: ");
	                cantidad = scanner.nextDouble();
	                double dolares = cantidad * TASA_EURO_A_DOLAR;
	                System.out.printf("%.2f Euros son %.2f Dólares.%n", cantidad, dolares);
	                break;

	            case 2:
	                System.out.print("Ingrese la cantidad en Dólares: ");
	                cantidad = scanner.nextDouble();
	                double euros = cantidad * TASA_DOLAR_A_EURO;
	                System.out.printf("%.2f Dólares son %.2f Euros.%n", cantidad, euros);
	                System.out.println("El tipo de cambio utilizado ha sido: " + TASA_DOLAR_A_EURO);
	                break;

	            default:
	                System.out.println("Opción no válida. Por favor, seleccione 1 o 2.");
	        }

	        scanner.close();
	}

}
