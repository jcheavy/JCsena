package entities;

import java.util.Date;

public class Resultado {

	

	private Integer concurso;
	private Date data;
	private Integer bola1;
	private Integer bola2;
	private Integer bola3;
	private Integer bola4;
	private Integer bola5;
	private Integer bola6;
	
	public Resultado() {
		
	}

	public Resultado(Integer concurso, Date data, Integer bola1, Integer bola2, Integer bola3, Integer bola4,
			Integer bola5, Integer bola6) {
		super();
		this.concurso = concurso;
		this.data = data;
		this.bola1 = bola1;
		this.bola2 = bola2;
		this.bola3 = bola3;
		this.bola4 = bola4;
		this.bola5 = bola5;
		this.bola6 = bola6;
	}

	public Integer getConcurso() {
		return concurso;
	}

	public void setConcurso(Integer concurso) {
		this.concurso = concurso;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Integer getBola1() {
		return bola1;
	}

	public void setBola1(Integer bola1) {
		this.bola1 = bola1;
	}

	public Integer getBola2() {
		return bola2;
	}

	public void setBola2(Integer bola2) {
		this.bola2 = bola2;
	}

	public Integer getBola3() {
		return bola3;
	}

	public void setBola3(Integer bola3) {
		this.bola3 = bola3;
	}

	public Integer getBola4() {
		return bola4;
	}

	public void setBola4(Integer bola4) {
		this.bola4 = bola4;
	}

	public Integer getBola5() {
		return bola5;
	}

	public void setBola5(Integer bola5) {
		this.bola5 = bola5;
	}

	public Integer getBola6() {
		return bola6;
	}

	public void setBola6(Integer bola6) {
		this.bola6 = bola6;
	}

	@Override
	public String toString() {
		return "Resultado [concurso=" + concurso + ", data=" + data + ", bola1=" + bola1 + ", bola2=" + bola2
				+ ", bola3=" + bola3 + ", bola4=" + bola4 + ", bola5=" + bola5 + ", bola6=" + bola6 + "]";
	}
	
}
