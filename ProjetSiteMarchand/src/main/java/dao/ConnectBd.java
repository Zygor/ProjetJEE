package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectBd {
    static Connection connect = null; // dp facade
    static ConnectBd conn = null; // dp singleton

    static Connection getConnect() {
	conn = ConnectBd.getInstance();
	return connect;
    }

    private ConnectBd() {
	try {
	    Class.forName("com.mysql.jdbc.Driver");
	    connect = DriverManager.getConnection("jdbc:mysql://localhost/tp1", "root", "");
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }

    public static ConnectBd getInstance() {
	if (conn == null) {
	    conn = new ConnectBd();
	}
	return null;
    }

}
