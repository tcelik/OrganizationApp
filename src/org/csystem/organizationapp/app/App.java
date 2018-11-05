package org.csystem.organizationapp.app;

import org.csystem.organizationapp.dal.ParticipiantAppDAL;
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
            ParticipiantAppDAL.INSTANCE.insertParticipiant(new ParticipiantInfo("c", "C",true, LocalDateTime.now()));
        }
        catch (Throwable ex) {
            ex.printStackTrace();
        }

    }
}

