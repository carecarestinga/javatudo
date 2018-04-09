package com.caretronics.estruturasdecontrole;

public class TipoTriangulo {

	public static void main(String[] args) {

		int lado1 = 0, lado2 = 0, lado3 = 0;
		
		
		//    NÃO É UM TRIANGULO
		
		lado1 = 8; lado2 = 2; lado3 = 1;
		
		if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
			if ((lado1 == lado2) && (lado2 == lado3)) {
				System.out.println(" Triangulo Equilatero, pois " 
						+ "lado1 = " + lado1 + ", lado2 = " + lado2 + ", lado3 = " + lado3 );
			} else if ((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3)) {
				System.out.println(" Triangulo Escaleno, pois " 
						+ "lado1 = " + lado1 + ", lado2 = " + lado2 + ", lado3 = " + lado3 );
			} else {
				System.out.println(" Triangulo Isoceles, pois "
						+ "lado1 = " + lado1 + ", lado2 = " + lado2 + ", lado3 = " + lado3 );
			}
		} else {
			System.out.println(" Não é Um Triangulo, pois "
					+ "lado1 = " + lado1 + ", lado2 = " + lado2 + ", lado3 = " + lado3 );
		}

		//     TRIANGULO EQUILÁTERO
		
		lado1 = 8; lado2 = 8; lado3 = 8;

		if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
			if ((lado1 == lado2) && (lado2 == lado3)) {
				System.out.println(" Triangulo Equilatero, pois "
						+ "lado1 = " + lado1 + ", lado2 = " + lado2 + ", lado3 = " + lado3 );
			} else if ((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3)) {
				System.out.println(" Triangulo Escaleno, pois "
						+ "lado1 = " + lado1 + ", lado2 = " + lado2 + ", lado3 = " + lado3 );
			} else {
				System.out.println(" Triangulo Isoceles, pois "
						+ "lado1 = " + lado1 + ", lado2 = " + lado2 + ", lado3 = " + lado3 );
			}
		} else {
			System.out.println("Não é Um Triangulo, pois "
					+ "lado1 = " + lado1 + ", lado2 = " + lado2 + ", lado3 = " + lado3 );
		}

		//     TRIANGULO ESCALENO
		
		lado1 = 8; lado2 = 6; lado3 = 4;


		if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
			if ((lado1 == lado2) && (lado2 == lado3)) {
				System.out.println(" Triangulo Equilatero, pois "
						+ "lado1 = " + lado1 + ", lado2 = " + lado2 + ", lado3 = " + lado3 );
			} else if ((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3)) {
				System.out.println(" Triangulo Escaleno, pois "
						+ "lado1 = " + lado1 + ", lado2 = " + lado2 + ", lado3 = " + lado3 );
			} else {
				System.out.println(" Triangulo Isoceles, pois"
						+ "lado1 = " + lado1 + ", lado2 = " + lado2 + ", lado3 = " + lado3 );
						
			}
		} else {
			System.out.println("Não é Um Triangulo, pois "
					+ "lado1 = " + lado1 + ", lado2 = " + lado2 + ", lado3 = " + lado3 );
		}

		//     TRIANGULO ISOCELES
		
		lado1 = 8; lado2 = 8; lado3 = 4;


		if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
			if ((lado1 == lado2) && (lado2 == lado3)) {
				System.out.println(" Triangulo Equilatero, pois "
						+ "lado1 = " + lado1 + ", lado2 = " + lado2 + ", lado3 = " + lado3 );
			} else if ((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3)) {
				System.out.println(" Triangulo Escaleno, pois "
						+ "lado1 = " + lado1 + ", lado2 = " + lado2 + ", lado3 = " + lado3 );
			} else {
				System.out.println(" Triangulo Isoceles, pois "
						+ "lado1 = " + lado1 + ", lado2 = " + lado2 + ", lado3 = " + lado3 );
			}
		} else {
			System.out.println("Não é Um Triangulo, pois "
					+ "lado1 = " + lado1 + ", lado2 = " + lado2 + ", lado3 = " + lado3 );
		}

	}

}
