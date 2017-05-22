package jpo;

public class PMaterial {

	
	private float m;
	public PMaterial(){ // konstruktor domyslny
		m=3;
	}
	
public PMaterial(float a){ // konstruktor z parametrem
	if(a>0){
	m=a;
	}
	else{
		System.out.println("masa musi byc wieksza od 0");
	}
}
public void setMasa(float m){
 this.m=m;
	
}
public float getMasa(){ // akcesor
	return m;
	}
public float zmienMase(int b){
	m=b;
	return m;
	}
public int MomBezwl(){ 
	int i=0;
return i;
	}
public float TwStein(int h){ 
float	ih=MomBezwl()+m*h*h;
return ih;
	}

public void opis(){
	System.out.println("kula o masie"+getMasa()+"i promieniu");
}
public float momentb(){
	return MomBezwl();
}
}
	
	


