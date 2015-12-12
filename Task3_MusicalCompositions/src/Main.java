
public class Main {

	public static void main(String[] args) {

		CompactDisc discotekaDevyanostih = new CompactDisc("Discoteka Devyanostih");
		
		Genre rock = new Genre("Rock");
		
		Artist curtCobain = new Artist("Curt","Cobain","Nirvana","Washington");
		Artist brainMay = new Artist("Brian","May","Queen","Great Britain");
		Artist rogerTaylor = new Artist("Roger","Taylor","Queen","Great Britain");
		Artist amyLynn = new Artist("Amy","Lynn","Evanescence","USA");
		
		Composition composition1 = new Composition("Smells Like Teen Spirit",1991,277,rock);
		Composition composition2 = new Composition("We will rock you",1977,291,rock);
		Composition composition3 = new Composition("Bring Me To Life",2003,252,rock);
		
		rock.addCompositions(composition1);
		composition1.addArtists(curtCobain);
		curtCobain.addCompositions(composition1);
		
		rock.addCompositions(composition2);
		composition2.addArtists(brainMay);
		composition2.addArtists(rogerTaylor);
		brainMay.addCompositions(composition2);
		rogerTaylor.addCompositions(composition2);
		
		rock.addCompositions(composition3);
		composition3.addArtists(amyLynn);
		amyLynn.addCompositions(composition3);
		
		
		discotekaDevyanostih.addCompositions(composition1);
		discotekaDevyanostih.addCompositions(composition2);
		discotekaDevyanostih.addCompositions(composition3);
		
		discotekaDevyanostih.totalDuration();
		discotekaDevyanostih.generalGenre();
		
		
	}

}

