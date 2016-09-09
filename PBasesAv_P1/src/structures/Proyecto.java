/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pbasesav_p1.Conexion;
/**
 *
 * @author fangi
 */
public class Proyecto {

    int id;
    int idCluster;
    String nombre;
    String descripcion;
    String estatus;
    String ventajas;
    String antecedentes;
    String aplicaciones;
    int[] idInvestigadores;

    public Proyecto(int id, int idCluster, String nombre, String descripcion, String estatus, String ventajas, String antecedentes, String aplicaciones, int [] idInvestigadores) {
        this.id = id;
        this.idCluster = idCluster;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estatus = estatus;
        this.ventajas = ventajas;
        this.antecedentes = antecedentes;
        this.aplicaciones = aplicaciones;
        this.idInvestigadores=idInvestigadores;
    }

  
    

    @Override
    public String toString() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstatus() {
        return estatus;
    }

    public String getVentajas() {
        return ventajas;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public int[] getIdInvestigadores() {
        return idInvestigadores;
            
    }
    

}
