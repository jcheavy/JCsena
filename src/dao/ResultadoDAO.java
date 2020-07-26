package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;

import entities.Resultado;
import views.ConnectFactory;

public class ResultadoDAO implements GenericDao<Resultado> {

	@Override
	public void inserir(Resultado resultado) {
		
		Connection conection;
		conection = new ConnectFactory().getConnection();
		String sqlInserir = "INSERT INTO jcsena(concurso, data, bola1, bola2, bola3, bola4, bola5, bola6) VALUES(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pstm = conection.prepareStatement(sqlInserir);
			pstm.setInt(1, resultado.getConcurso());
			pstm.setDate(2, (Date) resultado.getData());
			pstm.setInt(3, resultado.getBola1());
			pstm.setInt(4, resultado.getBola2());
			pstm.setInt(5, resultado.getBola3());
			pstm.setInt(6, resultado.getBola4());
			pstm.setInt(7, resultado.getBola5());
			pstm.setInt(8, resultado.getBola6());
			
			pstm.execute();
			pstm.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void alterar(Resultado resultado) {
		
		
	}

	@Override
	public void excluir(Integer concurso) {
		
		
	}

	@Override
	public Resultado buscar(Integer concurso) {
		
		return null;
	}

	@Override
	public List<Resultado> listResultado() {
		
		return null;
	}

}
