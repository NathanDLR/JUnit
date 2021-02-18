package junittest;

/**
 *
 * @author natan
 */
public class JUnitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Controller ctrl = new Controller();
        
        // Connection
        ctrl.connectToDB();
        
        // Main form
        ctrl.showMainForm();
    }
    
}
