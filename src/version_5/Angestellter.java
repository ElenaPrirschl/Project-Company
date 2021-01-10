package version_5;

public class Angestellter extends Mitarbeiter {

	//Attributes
	protected double grundgehalt;
	protected double zulage;
	//Tax in percentage
	protected double TAX_ANG = 20;
	//counter for all the angesteller
	protected static int counter= 0;
	

	
	public Angestellter() {
		
	}
	
	public Angestellter(int id, String name, int grundgehalt, int zulage) {
		super(id, name);
		this.grundgehalt = grundgehalt;
		this.zulage = zulage;
		
		counter++;
		
	}
	
//	@Override
//	public int compareTo(Mitarbeiter o) {
//		
//		return super.compareTo(o);
//	}
	
	@Override
	public String toString() {
		
		return super.toString()+ 
				", Grundgehalt: " + getGrundgehalt() + 
				", Zulage: " + getZulage()+
				", Bruttogehalt: " + String.format("%1.2f €",berechneBrutto()) + 
				", Netto: " +  String.format("%1.2f €", berechneNetto());
	}

	public double getGrundgehalt() {
		return grundgehalt;
	}

	public void setGrundgehalt(int grundgehalt) {
		this.grundgehalt = grundgehalt;
	}

	public double getZulage() {
		return zulage;
	}

	public void setZulage(int zulage) {
		this.zulage = zulage;
	}
	
	//calculation of the brutto salary
	@Override
	double berechneBrutto() {
		
		double brutto = this.grundgehalt + this.getZulage();
		setBrutto(brutto);
		return getBrutto();
	}

	//calculaction of the netto salary
	@Override
	double berechneNetto() {
	
		return  (berechneBrutto()* ((100-TAX_ANG)/100));
	}

	
}
