
public class Main {

	public static void main(String[] args) {

		CompactDisc discotekaDevyanostih = new CompactDisc("Discoteka Devyanostih");
				
		Artist curtCobain = new Artist("Curt","Cobain","Nirvana","Washington");
		Artist brainMay = new Artist("Brian","May","Queen","Great Britain");
		Artist amyLynn = new Artist("Amy","Lynn","Evanescence","USA");
		
		Composition composition1 = new Composition(curtCobain,"Smells Like Teen Spirit",1991,277,"Rock");
		Composition composition2 = new Composition(brainMay,"We will rock you",1977,291,"Rock");
		Composition composition3 = new Composition(amyLynn,"Bring Me To Life",2003,252,"Rock");
		
		discotekaDevyanostih.addCompositions(composition1);
		discotekaDevyanostih.addCompositions(composition2);
		discotekaDevyanostih.addCompositions(composition3);
		
		discotekaDevyanostih.totalDuration();
		discotekaDevyanostih.generalGenre();
		
		
	}

}

