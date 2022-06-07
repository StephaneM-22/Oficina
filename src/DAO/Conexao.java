/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author vini2
 */
public class Conexao {
    
   
    public static Connection getConnection() throws SQLException{
        Connection conexão = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Oficina","postgres","98476725");
        return conexão;
    }
    
}
