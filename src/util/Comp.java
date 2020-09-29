package util;

import javax.swing.JTextField;

import services.OnlyNumbers;

public class Comp {
	
	public static JTextField txtfield() {
		JTextField txf = new JTextField();
		txf.setDocument(new OnlyNumbers());
		txf.setFont(Utils.gramond_15);
		return txf;
	}

}
