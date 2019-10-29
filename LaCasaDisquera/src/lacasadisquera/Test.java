/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacasadisquera;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cantante, disco;
        listaCantantesFamosos listacantate = new listaCantantesFamosos();
        listaCantantesFamosos entrada = new listaCantantesFamosos();

        System.out.println("La lista contiene los siguientes datos: ");
        listacantate.listarCantanteFamoso();
        String continuar = new String();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nombre del cantante: ");
            cantante = entrada.AgregarCantante();
            System.out.println("Disco más vendido: ");
            disco = entrada.AgregarCantante();
            listacantate.AgregarCantanteFamoso(new CantanteFamoso(cantante, disco));
            System.out.println("Se presenta la siguiente lista de los cantantes con su disco más vendido: ");
            listacantate.listarCantanteFamoso();
            System.out.println("¿Deseas agregar otro cantante y su disco (S/N)?");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

    }

}
