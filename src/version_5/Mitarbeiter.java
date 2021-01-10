package version_5;

import java.io.Serializable;

abstract class Mitarbeiter implements Serializable{

	protected String name;
	protected int id;
	protected double brutto;
	
	abstract double berechneBrutto();
	abstract double berechneNetto();

	
	public Mitarbeiter() {

	}

	public Mitarbeiter(int id) {

	}

	public Mitarbeiter(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	
	
	
//	@Override
//	public int compareTo(Mitarbeiter o) {
//		return this.getName().compareToIgnoreCase(o.getName());
//	}
	
	@Override
	public String toString() {
		
		return getClass().getSimpleName() + ", ID: " + getId() + ", Name: " + getName();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public double getBrutto() {
		return brutto;
	}
	public void setBrutto(double brutto) {
		this.brutto = brutto;
	}
	
	
	
}
