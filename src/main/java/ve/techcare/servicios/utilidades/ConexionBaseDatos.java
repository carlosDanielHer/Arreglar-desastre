package ve.techcare.servicios.utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *  Esta clase es la encargada de establecer las conexion a la base de datos
 * 
 * @author Carlos Hernandez
 */
public class ConexionBaseDatos {

    public static Connection conectar() {
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:src/main/resources/base_de_datos/tech_care.db");
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e);
        }
        return conexion;
    }
}
