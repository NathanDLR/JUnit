/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natan
 */
public class DAOEmpresa {
    
    // Variables to connect to Database
    static Connection connection = null;
    static Statement st = null;
    static ResultSet rs = null;
    static String db = "empresa";
    static String login = "root";
    static String pwd = "root";
    static String url = "jdbc:mariadb://localhost:3308/" + db;
    protected ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    
    // Constructor
    public DAOEmpresa(){
        // Connect to db
        try{
            Class.forName("org.mariadb.jdbc.Driver");
        }
        catch(ClassNotFoundException ex){
            System.out.println(ex);
        }
        
        try{
            // Connect to db
            connection = DriverManager.getConnection(url, login, pwd);
            System.out.println("Succesful connection to " + db);

            // Query 
            st = connection.createStatement();
            rs = st.executeQuery("select * from empleado");
            
            // Fill arraylist with data from database
            while(rs.next()){
                empleados.add(new Empleado( rs.getInt("idEmpleado"), rs.getString("nameEmpleado"), rs.getString("lastname"), rs.getInt("idDepartamento"), rs.getInt("idTipoEmpleado"))); 
            }
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
        
    }
    
    // Delete Empleado
    public Boolean deleteEmpleado(Empleado empleado){
        Boolean deleted = false;
        
        return deleted;
    }
    
    // Delete empleado by id
    public void deleteEmpleado(String idEmpleado){
        
        try{
            st = connection.createStatement();
            rs = st.executeQuery("delete from empleado where idEmpleado = " + idEmpleado);
            System.out.println("Success deleting data");
            
        }
        catch(SQLException  ex){
            System.out.println("There was an error");
        }
        
    }
    
    // Create new Empleado
    public void createEmpleado(String idEmpleado, String name, String lastname, String idDepartamento, String idTipoEmpleado){
        try{
            st = connection.createStatement();
            rs = st.executeQuery("insert into empleado(idEmpleado, nameEmpleado, lastname, idTipoEmpleado, idDepartamento) values(" + idEmpleado 
                    + ", '" + name + "', '" + lastname + "', " + idTipoEmpleado + ", " + idDepartamento + ")");
            System.out.println("Success introducing data");
        }
        catch(SQLException ex){
            System.out.println("There was an error creating the new Empleado");
        }
    }
    
    // Update data 
    public void updateData(String idEmpleado, String name, String lastname, String idDepartamento, String idTipoEmpleado){
        try{
            st = connection.createStatement();
            rs = st.executeQuery("update empleado set nameEmpleado = '" + name + "', lastname = '" + lastname 
                    + "', idDepartamento = " + idDepartamento + ", idTipoEmpleado = " + idTipoEmpleado + " where idEmpleado = " + idEmpleado);
            System.out.println("Successfully updated data");
        }
        catch(SQLException ex){
            System.out.println("There was an error updating the data\n" + ex);        
        }
    }
    
}

