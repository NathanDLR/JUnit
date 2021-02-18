/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittest;

/**
 *
 * @author natan
 */
public class Empleado {
    // Attributes & Variables
    private String name;
    private String lastname;
    private Integer idEmpleado;
    private Integer idDepartamento;
    private Integer idTipoEmpleado;

    // Constructor
    public Empleado(){
        
    }
    
    public Empleado(Integer idEmpleado, String name, String lastname, Integer idDepartamento, Integer idTipoEmpleado){
        this.idEmpleado = idEmpleado;
        this.name = name;
        this.lastname = lastname;
        this.idDepartamento = idDepartamento;      
        this.idTipoEmpleado = idTipoEmpleado;
    }
    
    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Integer getIdTipoEmpleado() {
        return idTipoEmpleado;
    }

    public void setIdTipoEmpleado(Integer idTipoEmpleado) {
        this.idTipoEmpleado = idTipoEmpleado;
    }
    
}

