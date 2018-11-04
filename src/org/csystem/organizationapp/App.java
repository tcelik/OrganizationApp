package org.csystem.organizationapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class App {
    //Veritabanına bağlanma testi
    public static void main(String[] args)
    {
        //minimal olarak connection URL, User, Password lazım, gerisini driver manager halledecek
        String URL = "jdbc:postgresql://localhost:5432/organizationdb";
        String USER = "postgres";
        String PASSWORD = "12345";

        String sqlCmd = "insert into participiants (name, email, will_attend, join_time) values (?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(URL,USER, PASSWORD);
             PreparedStatement stmt = con.prepareStatement(sqlCmd))
        {
            stmt.setString(1, "sumeyye");
            stmt.setString(2, "sumeyye@gmail.com");
            stmt.setBoolean(3, true);
            stmt.setTimestamp(4, Timestamp.valueOf(LocalDateTime.now()));

            stmt.execute();
        }
        catch (Throwable ex) {
            ex.printStackTrace();
        }




    }
}
