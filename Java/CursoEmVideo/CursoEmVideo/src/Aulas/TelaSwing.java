package Aulas;

import javax.swing.JOptionPane;

public class TelaSwing {

	public static void main(String[] args) {
		
		int num = 0, soma = 0, par = 0, impar = 0, media = 0, contador = 0, num100 = 0;;
		
		do {
			contador++;
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: "));
			soma += num;
			media = soma / contador;
			
			if(num > 100) {
				num100++;
			}			
			if(num % 2 ==0) {
				par++;
			}else {
				impar++;
			}
			
		}while(num!=0);
		
		JOptionPane.showMessageDialog(null,"Total dos valores: " + soma 
				+ "\nTotal de pares: " + par 
				+ "\nTotal de impares: " + impar
				+ "\nAcima de 100: " + num100
				+ "\nMédia dos valores: " + media);
		 
	}

}
