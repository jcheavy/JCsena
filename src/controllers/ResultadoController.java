package controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dao.ResultadoDAO;
import entities.Resultado;
import views.TelaPrincipal;

public class ResultadoController {

	TelaPrincipal telaPrincipal;
	ResultadoDAO resuldao;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public ResultadoController(TelaPrincipal telaPrincipal) {
		this.telaPrincipal = telaPrincipal;
	}

	public void salvar() throws ParseException {
		
		int concurso = Integer.parseInt(telaPrincipal.getTfconcurso().getText());

		Date dataConcurso = sdf.parse(telaPrincipal.getTfdataconcurso().getText());
		int bola1 = Integer.parseInt(telaPrincipal.getTfbola1().getText());
		int bola2 = Integer.parseInt(telaPrincipal.getTfbola2().getText());
		int bola3 = Integer.parseInt(telaPrincipal.getTfbola3().getText());
		int bola4 = Integer.parseInt(telaPrincipal.getTfbola4().getText());
		int bola5 = Integer.parseInt(telaPrincipal.getTfbola5().getText());
		int bola6 = Integer.parseInt(telaPrincipal.getTfbola6().getText());
		Resultado resultadocontrol = new Resultado(null, concurso, dataConcurso, bola1, bola2, bola3, bola4, bola5, bola6);
		
		resuldao = new ResultadoDAO();
	    resuldao.save(resultadocontrol);
	    telaPrincipal.limpar();
	    
		}
	    
	 
	

}
