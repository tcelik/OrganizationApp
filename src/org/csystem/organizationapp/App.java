package org.csystem.organizationapp;

import org.csystem.organizationapp.dao.ParticipiantDao;
import org.csystem.organizationapp.entity.ParticipiantInfo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class App {
    //enum
    public static void main(String[] args)
    {
        try {
            ParticipiantDao.INSTANCE.insert(new ParticipiantInfo("a", "a",true, LocalDateTime.now()));
        }
        catch (Throwable ex) {
            ex.printStackTrace();
        }

    }
}

