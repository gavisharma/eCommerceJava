/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseServices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author GOVINDA SHARMA
 */
public class DBConnect {
    public static Connection connection;
    public static Statement statement;
    public static ResultSet resultSet;
    
    public static Connection getConnection(){
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            connection = DriverManager.getConnection("jdbc:odbc:OnlineShopping","shoppers","world");
            statement = connection.createStatement();
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return connection;
    }
    
    public static Statement getStatement(){
        try{
            statement = DBConnect.getConnection().createStatement();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return statement;
    }
    
    public static ResultSet getResultSetForQuery(String query){
        try{
            resultSet = DBConnect.getStatement().executeQuery(query);
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return resultSet;
    }
}
