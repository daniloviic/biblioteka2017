package biblioteka.interfejs;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Knjiga;

public interface Bibliotekainterfejs {

	
	public void dodajKnjigu(Knjiga k);
	public void obirisKnjigu(Knjiga k);
	public LinkedList<Knjiga> vratiSveKnjige();
	public LinkedList<Knjiga> pronadjiKnjigu(Autor a, long isbn, String naslov, String izdavac);
		
}
