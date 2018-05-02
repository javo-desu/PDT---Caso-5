/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JAVO-KUN
 */
public class Conexion {
        ResultSet resultado = null;
        Connection connection = null;
    public static Connection getConexion() {
        ResultSet resultado = null;
        Connection connection = null;
        try {
            String driverClassName = "oracle.jdbc.driver.OracleDriver";
            String driverUrl = "jdbc:oracle:thin:@localhost:1521:XE [lindas on LINDAS]";
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(driverUrl, "lindas", "123");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void cerrarConexion() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void ejecutarConsulta(String consulta) {
        try {
            resultado = connection.createStatement().executeQuery(consulta);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int actualizarConsulta(String consulta) {
        try {
            connection.createStatement().executeUpdate(consulta);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public ResultSet getResultado() {
        return resultado;
    }

}
