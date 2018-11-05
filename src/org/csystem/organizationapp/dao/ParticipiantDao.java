package org.csystem.organizationapp.dao;

import org.csystem.dao.DaoException;
import org.csystem.dao.IDao;
import org.csystem.organizationapp.entity.ParticipiantInfo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//Crud Anlaşmalarına uymak için
public enum ParticipiantDao implements IDao<ParticipiantInfo> {
    //CRUD İŞLEMLERİ -> participiants diye bir tablo vardı ya hani onun işlerini halledecek.
    INSTANCE;

    //Connect database
    public static final String URL = "jdbc:postgresql://localhost:5432/organizationdb";
    public static final String USER = "postgres";
    public static final String PASSWORD = "12345";

    private ParticipiantInfo getParticipiant(ResultSet rs)  throws SQLException
    {
        int id = rs.getInt(1);
        String name = rs.getString(2);
        String email = rs.getString(3);
        boolean willAttend = rs.getBoolean(4);
        Timestamp joinTime = rs.getTimestamp(5);

        return  new ParticipiantInfo(id, name, email ,willAttend, joinTime.toLocalDateTime());
    }

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
            throw new DaoException("insert yaparken hata oluştur", ex);
        }

    }

    //select * from tablename, bütün tablodan bir liste veriyor. Listenin her bir elemanı katılımcılarımız userlarım.
    public List<ParticipiantInfo> getAll()
    {
        List<ParticipiantInfo> result = new ArrayList<>();
        //cümlemi oluşturuyorum
        var sqlCmd = "select * from participiants";

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement stmt = con.prepareStatement(sqlCmd)) {

            ResultSet rs = stmt.executeQuery();


            while (rs.next()) {
                result.add(getParticipiant(rs));
            }
            return result;
        }
        catch (Throwable ex) {
            throw new DaoException("getAll", ex);
        }
    }

    public List<ParticipiantInfo> getParticipiantsByAttendance(boolean willAttend)
    {
        List<ParticipiantInfo> result = new ArrayList<>();
        var sqlCmd = "select * from participiants where will_attend=" + willAttend;

        try (Connection con = DriverManager.getConnection(URL, USER,PASSWORD);
            PreparedStatement stmt = con.prepareStatement(sqlCmd)) {

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                result.add(getParticipiant(rs));
            }

            return result;
        }
        catch (Throwable ex) {
            throw new DaoException("getParticipiantsByAttendane", ex);
        }





    }

    @Override
    public boolean update(ParticipiantInfo participiantInfo)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(ParticipiantInfo participiantInfo)
    {
        throw new UnsupportedOperationException();
    }
}
