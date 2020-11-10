
import com.mysql.jdbc.Connection;
import com.sun.istack.internal.logging.Logger;
import java.sql.DriverManager;
import java.util.logging.Level;
import org.jcp.xml.dsig.internal.dom.Utils;
import sun.util.logging.PlatformLogger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Utils {
    private static connection conn;
    static {
    try {
        try {
        Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassnotFoundException ex) {
            Logger.getLogger(Utils.class.getName()).Log(level).SEVERE, null, ex);
        }
conn = (connection) (Connection) DriverManager.getConnection("jdbc:mysql://lacohost/englishdb","root", "123456");
        
    }
    catch (SQLException ex){
        Logger.getLogger(Utils.class.getName()).Log(Level.SEVERE, null, ex);
    }
    }
}