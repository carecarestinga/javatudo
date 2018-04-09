package com.caretronics.estruturasdecontrole;

import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class ImpostoDeRenda {

	public static void main(String[] args) {
		
		float salarioBruto, salarioLiquido, ir = 0;
		String nome;
		int numDependentes;
		
		nome = JOptionPane.showInputDialog("Digite o Nome : ");
		numDependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o no. de Dependentes : "));
		salarioBruto = Float.parseFloat(JOptionPane.showInputDialog("Digite o Salario bruto : "));
		
		salarioLiquido = salarioBruto - 600 * numDependentes ;
		
		if ( salarioLiquido <= 10000 ) {
			ir = 0;
		}else if ( (salarioLiquido > 10000) && ( salarioLiquido <= 30000 ) ) {
			ir = salarioLiquido * 0.05f;
		}else if (( salarioLiquido > 30000) && (salarioLiquido <= 60000 )) {
			ir = salarioLiquido * 0.10f;
		}else if (( salarioLiquido > 60000 ) ) {
			ir = salarioLiquido * 0.15f;
		}
		
		JOptionPane.showMessageDialog(null, "Nome : " + nome + 
											"\n No. Dependentes : " + numDependentes +
											"\n Salario bruto : " + salarioBruto +
											"\n Imposto de Renda : " +  ir  +
											"\n\n Salario Liquido : " + salarioLiquido );
		
		
	}
	
}
