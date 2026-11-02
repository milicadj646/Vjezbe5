import java.util.ArrayList;

public class TestnaKlasa {
	
	public static ArrayList<Destinacija> filtriraj(ArrayList<Destinacija> destinacije){
		ArrayList<Destinacija> rezultat = new ArrayList<Destinacija>();
		
		//for (int i = 0; i< destinacije.size();i++) {
			//if(destinacije.get(i).getOcjena() >= 8 && destinacije.get(i).getUdaljenostKm()<1000) {
				//rezultat.add(destinacije.get(i));
			//}
		//}
		
		for(Destinacija a: destinacije) {
			if(a.getOcjena() >= 8 && a.getUdaljenostKm()<1000) {
				rezultat.add(a);
			}
		}
		return destinacije;
	}
	
	public static Destinacija najvisePosjeta(ArrayList<Destinacija>destinacije){
		Destinacija max = destinacije.get(0);
		for(int i=1; i<destinacije.size(); i++) {
			if(destinacije.get(i).getBrojPosjeta()>max.getBrojPosjeta()) {
				max = destinacije.get(i);
			}
		}return max;
		
	}
	public static void sortiranje(ArrayList<Destinacija>destinacije){
		destinacije.sort((d1,d2) -> Integer.compare(d2.getOcjena(), d1.getOcjena()));
	}
	

	public static void main(String[] args) {
		ArrayList<Destinacija> destinacije = new ArrayList<Destinacija>();
		Destinacija d1 = new Destinacija("Barcelona","Spanija",10,2500,2000000);
		Destinacija d2 = new Destinacija("Pariz","Francuska",9,1800,20001000);
		Destinacija d3 = new Destinacija();
		
		destinacije.add(d1);
		destinacije.add(d2);
		destinacije.add(d3);
		
		d3.setOcjena(9);
		d3.setUdaljenostKm(500);
		d3.setBrojPosjeta(100000);
		d3.setNaziv("Budimpesta");
		
		ArrayList<Destinacija> rez = new ArrayList <Destinacija>();
		
		rez = filtriraj(destinacije);
		
		for(Destinacija a : rez) {
			//System.out.println(a.getNaziv());
		}
		//System.out.println(najvisePosjeta(destinacije).getNaziv());
		
		sortiranje(destinacije);
		System.out.println();
	}

}
