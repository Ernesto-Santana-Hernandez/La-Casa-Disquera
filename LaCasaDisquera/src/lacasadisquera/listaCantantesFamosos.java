/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacasadisquera;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class listaCantantesFamosos {

    String Teclado;
    Scanner sc = new Scanner(System.in);
    ArrayList<CantanteFamoso> cantantes;

    public listaCantantesFamosos() {
        cantantes = new <CantanteFamoso> ArrayList();
    }

    public void AgregarCantanteFamoso(CantanteFamoso Cantante) {
        cantantes.add(Cantante);
    }

    public void listarCantanteFamoso() {
        CantanteFamoso cantante;
        Iterator<CantanteFamoso> continuar = cantantes.iterator();
        while (continuar.hasNext()) {
            cantante = continuar.next();
            System.out.print("Cantante: " + cantante.getNombre());
            System.out.println("\n Discos con más ventas: " + cantante.getDiscoconMasVendido());
        }
    }

    public String AgregarCantante() {
        Teclado = sc.nextLine();
        return Teclado;
    }

    public String getEntrada() {
        return Teclado;
    }

}
