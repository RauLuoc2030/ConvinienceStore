package src.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
    public static void main(String[] args) {
        SQLConnection conn = new SQLConnection("ConvinienceStore", "conviniencestore", "orcl");
        try {
            Statement statement = conn.getConnect().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM NHANVIEN");
            while (resultSet.next()){
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " 
                                 + resultSet.getString(3) + " " + resultSet.getString(4));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // SQLConnectUnit connectUnit = new SQLConnectUnit();
        // try {
        // ResultSet resultSet= connectUnit.Select("NHANVIEN");

        // while (resultSet.next()) {
        // System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + "
        // " + resultSet.getString(3) + " " + resultSet.getString(4));
        // }
        // connectUnit.Close();
        // } catch (Exception e) {
        // // TODO: handle exception
        // }
    }
}
