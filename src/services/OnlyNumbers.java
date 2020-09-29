package services;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class OnlyNumbers extends PlainDocument {

	private static final long serialVersionUID = 1L;
	
	private int maxlength;

	public OnlyNumbers() {
	}

	public OnlyNumbers(int maxlength) {
		super();
		this.maxlength = maxlength;
	}

	public void insertString(int offs, String str, AttributeSet a) {
		try {
			Integer.parseInt(str);
		} catch (NumberFormatException ex) {
			str = "";
		}
		try {
			boolean fixedLengh = (!((getLength() + str.length()) > maxlength));
			if (maxlength == 0 || fixedLengh)
				super.insertString(offs, str, a);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

}