package es.studium.Dividir;

import java.util.Scanner;

public class Dividir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numerador, denominador;
		double resultado;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame el numerador ");
		numerador = teclado.nextInt();
		System.out.println("Dame el denominador ");
		denominador = teclado.nextInt();
		teclado.close();
				{
			resultado=numerador/denominador;
		}
		System.out.println("El resultado es "+ resultado);
			}
}

/*PROGRAMA Dividir 
 *VARIABLES
 * ENTERO numerador, denominador
 * REAL resultado 
 * INICIO
 *  ESCRIBIR “Indicar el numerador:” 
 *  LEER numerador 
 *  ESCRIBIR “Indicar el denominador:” 
 *  LEER denominador
 *   resultado=dividir(numerador, denominador) 
 *  ESCRIBIR resultado
 *  FIN 
 *  FUNCION dividir (ENTERO a, ENTERO b) DEVUELVE REAL 
 *  VARIABLES 
 *  	REAL resultado 
 *  INICIO resultado=a/b 
 *  DEVOLVER resultado 
 *  FIN
 * 
 */
