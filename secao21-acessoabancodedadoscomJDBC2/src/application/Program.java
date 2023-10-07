/*
 * Allan Alves Amancio
 * Curso do Hélio Alves da Udemy - Programa para inserir dados
 * 06/10/2023
 */
package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {
	public static void main(String [] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement pt = null;
		
		try {
			conn = DB.getConnection();
			pt = conn.prepareStatement("INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)");
			pt.setString(1, "Carl Purple");
			pt.setString(2, "carl@gmail.com");
			pt.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			pt.setDouble(4, 3000.0);
			pt.setInt(5, 4);
			
			int rowsAffected = pt.executeUpdate();
			
			System.out.println("Done! Rows affected: "+rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();			
		} finally {
			DB.closeStatement(pt);
			DB.closeConnection();
		}
	}
}
