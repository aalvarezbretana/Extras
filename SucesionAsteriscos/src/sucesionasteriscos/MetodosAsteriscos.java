/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sucesionasteriscos;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class MetodosAsteriscos {

    Scanner sc = new Scanner(System.in);
    private int contador;
    private int sucesion;
    private String acumulador = "";
    private final String asterisco = "*";

    public void asteriscos() {
        System.out.println("Cuantas sucesiones de asteriscos quieres?");
        sucesion = sc.nextInt();
        for (contador = 0; contador < sucesion; contador++) {
            acumulador = acumulador + asterisco;
            System.out.println(acumulador);
        }
    }
}
