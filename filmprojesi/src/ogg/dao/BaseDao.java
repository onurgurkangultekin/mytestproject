package ogg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import ogg.db.DbConnectionInfo;

public class BaseDao {

	Connection connection;

	public BaseDao() {
		try {

			Class.forName(DbConnectionInfo.DRIVER);
			connection = DriverManager.getConnection(
					DbConnectionInfo.CONNECTION, DbConnectionInfo.USER,
					DbConnectionInfo.PASSWORD);
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
