package org.csystem.organizationapp.dao;

import org.csystem.organizationapp.entity.ParticipiantInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

//Crud Anlaşmalarına uymak için
public enum ParticipiantDao {
    //CRUD İŞLEMLERİ -> participiants diye bir tablo vardı ya hani onun işlerini halledecek.
    INSTANCE;

    //Connect database
    public static final String URL = "jdbc:postgresql://localhost:5432/organizationdb";
    public static final String USER = "postgres";
    public static final String PASSWORD = "12345";

    //insert ver bana bir katılımcı onu veritabanına eklim
    public boolean insert(ParticipiantInfo pi)
    {
        var sqlCmd = "insert into participiants (name, email, will_attend, join_time) values (?, ?, ?, ?)";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = con.prepareStatement(sqlCmd)){

            stmt.setString(1, pi.getName());
            stmt.setString(2, pi.getEmail());
            stmt.setBoolean(3, pi.willAttend());
            stmt.setTimestamp(4, Timestamp.valueOf(pi.getRegisterTime()));

            return stmt.execute();
        }
        catch (Throwable ex) {
            //burada dao exception fırlatacağız. Veritabanı değişirse diye.
        }
        return true;
    }
}
