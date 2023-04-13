package DAO;

import java.sql.*;

public class TestConnection {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl"; // URL kết nối
        String user = "ConvinienceStore"; // Tên người dùng
        String password = "conviniencestore"; // Mật khẩu

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("SQl Developer not found driveTest");
        }

        try {

            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM NHANVIEN");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("column1"));
                System.out.println(resultSet.getInt("column2"));

                // Thực hiện các thao tác khác với dữ liệu
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("Loi ket noi!");
            e.printStackTrace();
        }

    }
}
