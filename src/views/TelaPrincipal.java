package views;

import java.awt.Container;
import java.awt.Font;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

import util.Utils;

public class TelaPrincipal extends JFrame {

	JLabel ldata;
	Font fonte1 = new Font("Taoma", Font.PLAIN, 14);
	Font font2 = new Font("Jokerman", Font.PLAIN, 20);

	public TelaPrincipal() {

		Container telaPrincipal = getContentPane();
		setSize(800, 700);
		setLayout(null);

		Date data = new Date();
		DateFormat dataFormatada = DateFormat.getDateInstance(DateFormat.SHORT);

		ldata = new JLabel();
		ldata.setText(dataFormatada.format(data));
		ldata.setFont(Utils.font3);

		ldata.setBounds(600, 10, 200, 20);
		telaPrincipal.add(ldata);

		setVisible(true);

	}

	public static void main(String[] args) {

		TelaPrincipal telap = new TelaPrincipal();
		telap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
