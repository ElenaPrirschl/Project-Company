package version_5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FileService {

	
	public static List<String> AngestelltenNamen(Verwaltung v){
		
		List<String> list = new ArrayList<>();
		
		for (Mitarbeiter mitarbeiter : Verwaltung.mitarbeiter_liste) {
			if(mitarbeiter instanceof Angestellter) {
				list.add(mitarbeiter.getName());
			}
		}
		return list;
	}
	
	
	public static List<Mitarbeiter> getBiggestAbt(Verwaltung v) {
		List<Mitarbeiter> biggestAbt = null;
		int workerCount = 0;

		for (Abteilung abt : Verwaltung.abteilungs_liste) {
			if (abt.getMitarb_list().size() > workerCount) {
				workerCount = abt.getMitarb_list().size();
				biggestAbt = abt.getMitarb_list();
			}
		}
		return biggestAbt;
	}
	
	public static List<Mitarbeiter> sortMitarbeiter(){
		
		Verwaltung.mitarbeiter_liste.
		stream().
			sorted((Mitarbeiter m1, Mitarbeiter m2) -> m1.getName().compareTo(m2.getName()));

		return Verwaltung.mitarbeiter_liste;
		
	}
	
	
	
}
