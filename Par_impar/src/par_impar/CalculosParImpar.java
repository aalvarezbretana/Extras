/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package par_impar;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class CalculosParImpar {

    Scanner sc = new Scanner(System.in);
    int contador;
    int numero;
    int acumulador;
    int posicion;

    public void calcular() {

        while (contador <= 10) {
            System.out.println("Dame números");
            numero = sc.nextInt();
            if (numero % 2 == 0) {
                acumulador = acumulador + numero;
                System.out.println("Has puesto " + numero 
                        + " asi que sumamos " + numero
                        + " + " + posicion + " = " + acumulador
                );
            } else {
                acumulador = acumulador * numero;
                System.out.println("Has puesto " + numero
                        + " asi que multiplicamos " + numero
                        + " * " + posicion + " = " + acumulador);
            }
            posicion = acumulador;
            contador++;
        }
    }
}
