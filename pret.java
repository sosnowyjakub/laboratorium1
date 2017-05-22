package jpo;

public class pret extends PMaterial{ //klasa pret dziedziczaca klase PMaterial
	float dlugosc;   //inicjalizacja zmiennych
	float mombezw;
	float getdlugosc(){ // akcesory zmiennych dlugosc i mombezw
		return dlugosc;
	}
	void setdlugosc(float l){  
		dlugosc=l;
	}
	float getmombezw(){
		return mombezw;
	}
	void setmombezw(float I){
		mombezw=I;
	}
	public pret(float m, float l){  //konstruktor z parametrami ktory korzysta z klasy PMaterial
		setMasa(m);
		setdlugosc(l);
	}
	public float momentb(){   //metoda króra liczy moment bezwladnosci
		setmombezw(getMasa()*getdlugosc()*getdlugosc()/12);
		System.out.println("moment bezwladnosci preta to: "+getmombezw());
		return mombezw;
	}
	public void opis(){  //metoda podajaca dane walca
		System.out.println("pret o masie "+getMasa()+" i dlugosci "+getdlugosc());
	}

}
