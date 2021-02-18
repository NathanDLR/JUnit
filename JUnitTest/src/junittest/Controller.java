/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittest;

import junittest.Frames.*;

/**
 *
 * @author natan
 */
public class Controller {
    
    // Constructor
    public Controller(){}
    
    // Connection to Database
    public void connectToDB(){
        DAOEmpresa dao = new DAOEmpresa();
    }
    
    // Open jframe crud
    public static void showMainForm(){
        Form form = new Form();
        form.show();
        
    }
    
    // Open jframe create
    public static void showCreate(){
        FormCreate form = new FormCreate();
        form.show();
    }
    
    // Open jframe read
    public static void showRead(){
        FormRead form = new FormRead();
        form.show();
    }
    
    // Open jframe update
    public static void showUpdate(){
        FormUpdate form = new FormUpdate();
        form.show();
    }
    
    // Open jframe delete
    public static void showDelete(){
        FormDelete form = new FormDelete();
        form.show();
    }
}
