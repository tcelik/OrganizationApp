package org.csystem.organizationapp;

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
        A a = A.INSTANCE;
        A b = A.INSTANCE;

        if (a == b) {
            System.out.println("aynı adres");
        }
        
        Util u2 = Util.util;

    }
}

enum A {
    //default constructor çağrılır INSTANCE İLE INSTANCE() aynı
    INSTANCE;



}

class Util {
    public static final Util util = new Util();

    private Util() {}
}