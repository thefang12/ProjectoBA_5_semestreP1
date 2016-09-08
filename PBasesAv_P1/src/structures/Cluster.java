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
public class Cluster {

    int id;
    int idOficina;
    String nombre;
    String descripcion;

    public Cluster(int id, int idOficina, String nombre, String descripcion) {
        this.id = id;
        this.idOficina = idOficina;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public int getIdOficina() {
        return idOficina;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
