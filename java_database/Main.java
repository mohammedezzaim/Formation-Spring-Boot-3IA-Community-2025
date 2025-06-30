import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Ezzaim Mohammed
 **/

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tia_community";
        String username = "root";
        String password = "";

        try {

            Connection connection = DriverManager.getConnection(url, username, password);

            String create_table_sql = "CREATE TABLE PRODUIT ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT, "
                    + "nom VARCHAR(20), "
                    + "prix DECIMAL(10,2), "
                    + "quantite INT"
                    + ")";

            Statement createTableStatement = connection.createStatement();
            createTableStatement.execute(create_table_sql);

            String insert_sql = "INSERT INTO PRODUIT (nom, prix, quantite) " +
                    "VALUES ('Souris', 79.99, 20)";

            Statement insertStatement = connection.createStatement();
            insertStatement.executeUpdate(insert_sql);


            String sql = "INSERT INTO PRODUIT (nom, prix, quantite) " +
                    "VALUES ('Clavier', 100.99, 10)";

            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);


            Statement selectStatement = connection.createStatement();
            String select_sql = "SELECT * FROM PRODUIT";

            ResultSet resultSet = statement.executeQuery(select_sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nom = resultSet.getString("nom");
                Double prix = resultSet.getDouble("prix");
                int quantite = resultSet.getInt("quantite");

                System.out.println(id + " | " + nom + " | " + prix + "DH | Qte: " + quantite);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
