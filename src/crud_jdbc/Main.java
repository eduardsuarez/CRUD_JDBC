package crud_jdbc;

import java.sql.*;

/**
 *
 * @author eduardsuarez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        try ( Connection connection = DBConnection.getConnection()) {

            if (connection != null) {
                System.out.println("Conectado con la BD!");
            }

            // Create
            //FabricaJDBC.insert(connection, 13, 10, "Argentina", "Luisa");

            // Read or Retrieve
            FabricaJDBC.getAll(connection);

            // Update
            FabricaJDBC.update(connection, 1, 33, "Colombia", "Claudia");

            // Delete
            //Fabrica.delete(connection, 4);
            //FabricaJDBC.get(connection, 3);

            System.out.println("Fin!");

        } catch (SQLException e) {
            System.err.print(e);

        } finally {

        }

    }
}
