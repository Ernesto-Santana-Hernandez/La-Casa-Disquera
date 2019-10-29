/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacasadisquera;


/**
 *
 * @author Lenovo
 */
public class CantanteFamoso {
    private String nombre;
    private String discoconMasVendido;

    public CantanteFamoso() {
        nombre = "";
        discoconMasVendido = "";
    }

    public CantanteFamoso(String nombre, String discoMasVendido) {
        this.nombre = nombre;
        this.discoconMasVendido = discoMasVendido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoconMasVendido() {
        return discoconMasVendido;
    }

    public void setDiscoconMasVendido(String discoconMasVendido) {
        this.discoconMasVendido = discoconMasVendido;
    }   
}
