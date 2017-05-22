package jpo;

public class test {
	
	public static void main(String args[]){
		walec walec = new walec(1, 10);
		kula kula = new kula(7,9);
		pret pret = new pret(4, 7);
		walec.opis();
		walec.momentb();
		kula.opis();
		kula.momentb();
		pret.opis();
		pret.momentb();
		
		PMaterial tablica[] = new PMaterial[3];
		tablica[0]= new walec(5,5);
		tablica[1]= new kula(2,8);
		tablica[2]= new pret(5,5);
		for(int x=0; x<3; x++){
			tablica[x].opis();
			tablica[x].momentb();
		}
		
	}
	
}
