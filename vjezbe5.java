import java.util.Scanner;

public class vjezbe5 {

	public static int brojRijeci(String s) {
		String rijeci[] = s.split(" ");
		return rijeci.length;
	}
	
	public static boolean jePalindrom(String s) {
		
		s = s.replace(" ", "");
		s = s.toLowerCase();
	
		String obrnuti = new StringBuilder(s).reverse().toString();
		
		if(obrnuti.equals (s)) {
			return true;
		}else {
			return false;
		}
	}
	public static int brojTransakcije(String ulaz) {
		String rijeci[] = ulaz.split(" ");
		
		int suma = 0;
		
		for (int i = 0; i<rijeci.length; i++) {
			String vrijednost = rijeci[i].substring(1);
			
			if (rijeci[i].charAt(0) == 'S') {
				suma += Integer.parseInt(vrijednost);
			}else {
				suma -= Integer.parseInt(vrijednost);
			}
		}
		return suma;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite recenicu: ");
		String recenica = sc.nextLine().trim();
		
		//System.out.println("Broj rijeci: " + brojRijeci(recenica));
		//System.out.println("Recenica je: " + jePalindrom(recenica));
		
		
		

	}

}
