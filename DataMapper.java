import java.sql.*;

public class DataMapper {
    private final Connection connection;
    private static Statement statement;
    private static PreparedStatement ps;

    public DataMapper(Connection connection) {
        this.connection = connection;
    }

    public Product findById (Long idProduct) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT IDPRODUCT, EXPIRATION FROM PRODUCTS WHERE IDPRODUCT = ?");
        statement.setLong(1, idProduct);
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Product product = new Product(resultSet.getString(1), resultSet.getDate(2));
                return product;
            }

        }
        throw new SQLException(String.valueOf(idProduct));
    }
    public void insert(Product product) throws SQLException {
        statement.executeUpdate("INSERT INTO products (date) VALUES ("+product.expiration+");");
    }
}
