package views;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Resultado;

public class Programm {
	
public static void main(String[] args) throws ParseException {
		
		
		Locale.setDefault(Locale.US);		
		Scanner sc  = new Scanner(System.in);
		List<Resultado> lines = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite o concurso :");
		Integer concurso = sc.nextInt();
		System.out.println("Digite a data(DD/MM/YYYY)");
		Date data = sdf.parse(sc.next());
		System.out.println("Digite a bola1 :");
	    Integer bola1  = sc.nextInt();
	    System.out.println("Digite a bola2 :");
	    Integer bola2  = sc.nextInt();
	    System.out.println("Digite a bola3 :");
	    Integer bola3  = sc.nextInt();
	    System.out.println("Digite a bola4 :");
	    Integer bola4  = sc.nextInt();
	    System.out.println("Digite a bola5 :");
	    Integer bola5  = sc.nextInt();
	    System.out.println("Digite a bola6 :");
	    Integer bola6  = sc.nextInt();		
        Resultado resultado = new Resultado(concurso, data, bola1, bola2, bola3, bola4, bola5, bola6);
        
      
       
		String path = "/home/jean/Documentos/BD_Resultado.csv";
		
	try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			
			for(Resultado line : lines ) {
				bw.write(line.getConcurso()+"-"+line.getData()+"-"+line.getBola1()+"-"+line.getBola2()+"-"+line.getBola3()
				+"-"+line.getBola4()+"-"+line.getBola5()+"-"+line.getBola6());
				bw.newLine();
			}
		}catch(IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}
	  sc.close();
	}

}
