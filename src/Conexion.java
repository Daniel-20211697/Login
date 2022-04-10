

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {
    public static Connection conexion;
    /*
    public static Connection getConnection(){
        
        try{
            Runtime.getRuntime().addShutdownHook(new getClose);
            if(conexion== null){
                Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/tarea4","root","");
                
            }
          
            return conexion;
        }catch(ClassNotFoundException | SQLException e){
            throw new RuntimeException("Conexion Establecida",e);
            
        }
    }
    static class getClose extends Thread(){
       
        @Override
        public void run(){
            try{
                
                Connection conn= Conexion.getConnection();
                conn.close();
            }catch(SQLException ex){
                throw new RuntimeException(ex)
                
            }
        }

    }
*/
}

