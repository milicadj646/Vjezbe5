
public class Destinacija {
	private String naziv, drzava;
	private int ocjena, udaljenostKm, brojPosjeta;
	
	
	public Destinacija(String naziv, String drzava, int ocjena, int udaljenostKm, int brojPosjeta) {
		super();
		this.naziv = naziv;
		this.drzava = drzava;
		this.ocjena = ocjena;
		this.udaljenostKm = udaljenostKm;
		this.brojPosjeta = brojPosjeta;
	}
	public Destinacija() {
		
	}


	public String getNaziv() {
		return naziv;
	}


	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}


	public String getDrzava() {
		return drzava;
	}


	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}


	public int getOcjena() {
		return ocjena;
	}


	public void setOcjena(int ocjena) {
		this.ocjena = ocjena;
	}


	public int getUdaljenostKm() {
		return udaljenostKm;
	}


	public void setUdaljenostKm(int udaljenostKm) {
		this.udaljenostKm = udaljenostKm;
	}


	public int getBrojPosjeta() {
		return brojPosjeta;
	}


	public void setBrojPosjeta(int brojPosjeta) {
		this.brojPosjeta = brojPosjeta;
	}

	public static void main(String[] args) {
		
		

	}

}
