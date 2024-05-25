
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harvous
 */
public class DB {
    private Connection connection;

    public DB() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:sqlite.db");
            createSQL(); // Gọi phương thức để tạo bảng và thêm dữ liệu mẫu
        
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
    
    public Connection getConnection()
    {
        return this.connection;
    }
    public final void createSQL() {
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate("create table if not exists products (id integer primary key autoincrement, name text, price real, create_at datetime)");
            statement.executeUpdate("create table if not exists users(name text not null,password not null)");
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }
    }
    public void addUser(String name,String pass)
    {
        String sql = "INSERT INTO users(name, password) VALUES(?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, pass);
            ps.execute();
            System.out.println("added");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void createProduct(String name, BigDecimal price) {
        String sql = "INSERT INTO products (name, price, create_at) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, name);
            preparedStatement.setBigDecimal(2, price);

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = now.format(formatter);

            preparedStatement.setString(3, formattedDateTime);


            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }
    }

    public List<Object[]> queryData(String query) {
        String sql = "select * from " + query + " ORDER by create_at DESC";
        try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {
            List<Object[]> data = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                BigDecimal price = resultSet.getBigDecimal("price");
                System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);
                data.add(new Object[]{false, id, name, price});
            }
            return data;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void deleteRecordById(String tableName, int id) {
        String sql = "DELETE FROM " + tableName + " WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id);
            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Record with id " + id + " deleted successfully.");
            } else {
                System.out.println("No record found with id " + id + ".");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
    }
}
