import java.sql.*;

/**
 * @author Ezzaim Mohammed
 **/
public class Main2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/orm_exemple";
        String username = "root";
        String password = "";

        try {

            Connection connection = DriverManager.getConnection(url, username, password);
            Statement selectStatement = connection.createStatement();
            String select_sql = "SELECT * FROM PRODUIT";

            ResultSet resultSet = selectStatement.executeQuery(select_sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nom = resultSet.getString("nom");
                Double prix = resultSet.getDouble("prix");
                int quantite = resultSet.getInt("quantite");

//                Produit produit = orm_lineToObject(connection,id, nom, prix, quantite);
//                System.out.println(produit.toString());


                Produit nvProduit = new Produit("Lenovo", 10000.0, 1);
                orm_objectToLine(connection, nvProduit);

            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }


    public static Produit orm_lineToObject(Connection connection, int id, String nom, Double prix, int quantite){
        Produit produit = new Produit(id, nom,prix,quantite);
        return produit;
    }

    public static void orm_objectToLine(Connection connection, Produit produit) throws SQLException {
        Statement statement = connection.createStatement();

        String sql = "INSERT INTO PRODUIT (nom, prix, quantite) VALUES ('"+
                produit.getNom()+ "',"
                +produit.getPrix()+" ,"
                +produit.getQuantite()
                +")";

        statement.executeUpdate(sql);
    }
}
