package views;

import java.awt.Container;
import java.awt.Font;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import controllers.ResultadoController;
import entities.Resultado;
import util.Utils;

public class TelaPrincipal extends JFrame {

	private JLabel ldata;
	private JLabel lconcurso;
	private JLabel ldataconcurso;
	
	private Date datasql;
	
	private JButton btsalvar;
	private JButton teste;
	
	private JLabel lbola1;
	private JLabel lbola2;
	private JLabel lbola3;
	private JLabel lbola4;
	private JLabel lbola5;
	private JLabel lbola6;
	
	private JTextField tfbola1;
	private JTextField tfbola2;
	private JTextField tfbola3;
	private JTextField tfbola4;
	private JTextField tfbola5;
	private JTextField tfbola6;
	
	private JTextField tfconcurso;
	private JTextField tfdataconcurso;
	
	
	Font fonte1 = new Font("Taoma", Font.PLAIN, 14);
	Font font2 = new Font("Jokerman", Font.PLAIN, 20);
	
	Resultado resultado = new Resultado();

	
	public void salvar() throws ParseException {
		
		String tsDate = "";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
				
		resultado.setConcurso(Integer.parseInt(tfconcurso.getText()));
  
		resultado.setData(sdf.parse(tfdataconcurso.getText()));
		
		resultado.setBola1(Integer.parseInt(tfbola1.getText()));
		resultado.setBola2(Integer.parseInt(tfbola2.getText()));
		resultado.setBola3(Integer.parseInt(tfbola3.getText()));
		resultado.setBola4(Integer.parseInt(tfbola4.getText()));
		resultado.setBola5(Integer.parseInt(tfbola5.getText()));
		resultado.setBola6(Integer.parseInt(tfbola6.getText()));

	}

	public TelaPrincipal() {

		Container telaPrincipal = getContentPane();
		setSize(800, 700);
		setLayout(null);

		Date data = new Date();
		DateFormat dataFormatada = DateFormat.getDateInstance(DateFormat.SHORT);

		ldata = new JLabel();
		ldata.setText(dataFormatada.format(data));
		ldata.setFont(Utils.gramond_30);

		ldata.setBounds(600, 15, 200, 20);
		telaPrincipal.add(ldata);
		
		lconcurso = new JLabel("Concurso");
		lconcurso.setFont(Utils.gramond_15);
		lconcurso.setBounds(30,30,80,20);
		telaPrincipal.add(lconcurso);
		
		tfconcurso = new JTextField();
		tfconcurso.setFont(Utils.gramond_15);
		tfconcurso.setBounds(30,55,50,20);
		telaPrincipal.add(tfconcurso);
		
		ldataconcurso = new JLabel("Data");
		ldataconcurso.setFont(Utils.gramond_15);
		ldataconcurso.setBounds(110,30,80,20);
		telaPrincipal.add(ldataconcurso);
		
		tfdataconcurso = new JTextField();
		tfdataconcurso.setFont(Utils.gramond_15);
		tfdataconcurso.setBounds(110,55,80,20);
		telaPrincipal.add(tfdataconcurso);
		
		
		lbola1 = new JLabel("Bola-1");
		lbola1.setFont(Utils.gramond_15);
		lbola1.setBounds(210,30,40,20);
		telaPrincipal.add(lbola1);
		
		tfbola1 = new JTextField();
		tfbola1.setFont(Utils.gramond_15);
		tfbola1.setBounds(210,55,40,20);
		telaPrincipal.add(tfbola1);
		
		lbola2 = new JLabel("Bola-2");
		lbola2.setFont(Utils.gramond_15);
		lbola2.setBounds(260,30,50,20);
		telaPrincipal.add(lbola2);
		
		tfbola2 = new JTextField();
		tfbola2.setFont(Utils.gramond_15);
		tfbola2.setBounds(260,55,40,20);
		telaPrincipal.add(tfbola2);					
		
		lbola3 = new JLabel("Bola-3");
		lbola3.setFont(Utils.gramond_15);
		lbola3.setBounds(310,30,50,20);
		telaPrincipal.add(lbola3);
		
		tfbola3 = new JTextField();
		tfbola3.setFont(Utils.gramond_15);
		tfbola3.setBounds(310,55,40,20);
		telaPrincipal.add(tfbola3);
	
		lbola4 = new JLabel("Bola-4");
		lbola4.setFont(Utils.gramond_15);
		lbola4.setBounds(360,30,50,20);
		telaPrincipal.add(lbola4);
		
		tfbola4 = new JTextField();
		tfbola4.setFont(Utils.gramond_15);
		tfbola4.setBounds(360,55,40,20);
		telaPrincipal.add(tfbola4);
		
		lbola5 = new JLabel("Bola-5");
		lbola5.setFont(Utils.gramond_15);
		lbola5.setBounds(410,30,50,20);
		telaPrincipal.add(lbola5);
		
		tfbola5 = new JTextField();
		tfbola5.setFont(Utils.gramond_15);
		tfbola5.setBounds(410,55,40,20);
		telaPrincipal.add(tfbola5);
		
		lbola6 = new JLabel("Bola-6");
		lbola6.setFont(Utils.gramond_15);
		lbola6.setBounds(460,30,50,20);
		telaPrincipal.add(lbola6);
		
		tfbola6 = new JTextField();
		tfbola6.setFont(Utils.gramond_15);
		tfbola6.setBounds(460,55,40,20);
		telaPrincipal.add(tfbola6);
		
		btsalvar = new JButton("Salvar");
		btsalvar.setBounds(600,55,80,20);
		telaPrincipal.add(btsalvar);
		
		btsalvar.addActionListener(e ->{
		  ResultadoController controller = new ResultadoController(this);
		  try {
			controller.salvar();
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		});
		
		teste = new JButton("01");
		teste.setBounds(600,85,50,50);
		telaPrincipal.add(teste);
			

		setVisible(true);

	}

	public JTextField getTfbola1() {
		return tfbola1;
	}

	public void setTfbola1(JTextField tfbola1) {
		this.tfbola1 = tfbola1;
	}

	public JTextField getTfbola2() {
		return tfbola2;
	}

	public void setTfbola2(JTextField tfbola2) {
		this.tfbola2 = tfbola2;
	}

	public JTextField getTfbola3() {
		return tfbola3;
	}

	public void setTfbola3(JTextField tfbola3) {
		this.tfbola3 = tfbola3;
	}

	public JTextField getTfbola4() {
		return tfbola4;
	}

	public void setTfbola4(JTextField tfbola4) {
		this.tfbola4 = tfbola4;
	}

	public JTextField getTfbola5() {
		return tfbola5;
	}

	public void setTfbola5(JTextField tfbola5) {
		this.tfbola5 = tfbola5;
	}

	public JTextField getTfbola6() {
		return tfbola6;
	}

	public void setTfbola6(JTextField tfbola6) {
		this.tfbola6 = tfbola6;
	}

	public JTextField getTfconcurso() {
		return tfconcurso;
	}

	public void setTfconcurso(JTextField tfconcurso) {
		this.tfconcurso = tfconcurso;
	}

	public JTextField getTfdataconcurso() {
		return tfdataconcurso;
	}

	public void setTfdataconcurso(JTextField tfdataconcurso) {
		this.tfdataconcurso = tfdataconcurso;
	}

	public static void main(String[] args) {
 
	//	TelaPrincipal telap = new TelaPrincipal();
	//	telap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		  // set look and feel to the system look and feel
		
		
	       try {
	           UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
	       } catch (Exception ex) {
	           ex.printStackTrace();
	       }
	        
	       SwingUtilities.invokeLater(new Runnable() {
	           @Override
	           public void run() {
	               new TelaPrincipal().setVisible(true);
	           }
	       });
	}

}
