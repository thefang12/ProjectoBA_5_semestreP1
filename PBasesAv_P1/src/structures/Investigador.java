/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

/**
 *
 * @author fangi
 */
public class Investigador {
 int id;
 int idInstitucion;
 String nombre;

    public Investigador(int id, int idInstitucion, String nombre) {
        this.id = id;
        this.idInstitucion = idInstitucion;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public int getIdInstitucion() {
        return idInstitucion;
    }

    public String getNombre() {
        return nombre;
    }
 
    
}
