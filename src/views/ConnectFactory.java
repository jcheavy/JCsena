package views;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import util.Constantes;

public class ConnectFactory {

	public Connection getConnection() {
		
		try {
			return DriverManager.getConnection(Constantes.URL_BANCO, Constantes.USUARIO, Constantes.SENHA);
			
		} catch (SQLException sqlExecpiton) {
			JOptionPane.showMessageDialog(null,"Erro ao conecatar com o banco de dados \n"+ sqlExecpiton.getMessage());
			System.exit(1);
			throw new RuntimeException(sqlExecpiton);
		}
		
	}
}
