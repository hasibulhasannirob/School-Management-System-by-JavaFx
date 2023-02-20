package sample;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class DataBaseConnection {

    public Connection dataBaseLink;
    public Connection getConnection(){
        String databaseName="new_schema";
        String databaseUser="demo";
        String databasePassword="password";
        String url="jdbc:mysql://localhost/"+databaseName;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            dataBaseLink= DriverManager.getConnection(url,databaseUser,databasePassword);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataBaseLink;
    }
}
