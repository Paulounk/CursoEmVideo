package Aulas;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
			Scanner leia = new Scanner (System.in);
			
			int num =0;
			
			System.out.print("Digite um numero: ");
			num = leia.nextInt();
			
			System.out.println("Resto da divisão por 2: " + (num%2));
			System.out.println("Elevado ao cubo: " + Math.pow(num,3));
			System.out.printf("Raiz Quadrada: %.2f\n", Math.sqrt(num));
			System.out.printf("Raiz cubica: %.2f\n", Math.cbrt(num));
			System.out.println("Valor absoluto: " + Math.abs(num));
	}

}
