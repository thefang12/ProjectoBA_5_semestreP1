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
public class Oficina {

    int id;
    String nombre;
    int idDireccion;
    int idInsititucion;

    public Oficina(int id, int idDireccion, int idInsititucion, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.idDireccion = idDireccion;
        this.idInsititucion = idInsititucion;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public int getIdInsititucion() {
        return idInsititucion;
    }
}
