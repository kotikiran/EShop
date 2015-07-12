package com.eshop.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBCon {

	static Connection con;

	public static Connection getCon() {
		try {
			System.out.println("Loading Driver ... ");
			Class.forName("com.mysql.jdbc.Driver");
			// String url="jdbc:odbc:eshop";

			System.out.println("Getting Connection... ");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/ecart", "root", "");

			System.out.println("connection:" + con);
		} catch (Exception e) {
			System.out.println("exc:" + e);
		}
		return con;
	}

}
