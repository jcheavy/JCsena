package testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import dao.ResultadoDAO;
import entities.Resultado;

public class Programm {
	

public static void main(String[] args) throws ParseException {
		
		
		Locale.setDefault(Locale.US);		
		Scanner sc  = new Scanner(System.in);
		List<Resultado> lines = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite o concurso :");
		Integer concurso = sc.nextInt();
		System.out.print("Digite a data(DD/MM/YYYY)");
		Date data = sdf.parse(sc.next());
		System.out.print("Digite a bola1 :");
	    Integer bola1  = sc.nextInt();
	    System.out.print("Digite a bola2 :");
	    Integer bola2  = sc.nextInt();
	    System.out.print("Digite a bola3 :");
	    Integer bola3  = sc.nextInt();
	    System.out.print("Digite a bola4 :");
	    Integer bola4  = sc.nextInt();
	    System.out.print("Digite a bola5 :");
	    Integer bola5  = sc.nextInt();
	    System.out.print("Digite a bola6 :");
	    Integer bola6  = sc.nextInt();		
        Resultado resultado = new Resultado(null, concurso, data, bola1, bola2, bola3, bola4, bola5, bola6);
        ResultadoDAO dao  = new ResultadoDAO();
        dao.save(resultado);
        System.out.println(resultado);
          
	}

}
