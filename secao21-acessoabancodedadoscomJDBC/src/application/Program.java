/*
 * Allan Alves Amancio
 * Curso do Hélio Alves da Udemy - Programa para acessar dados
 * 06/10/2023
 */
package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {
	public static void main(String [] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DB.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("Select * from department");
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + " - " + rs.getString("Name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
