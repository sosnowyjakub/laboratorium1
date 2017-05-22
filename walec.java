package jpo;

public class walec extends PMaterial {
	float promien;
	float mombezw;
	
float getpromien(){
	return promien;
}
float getmombezw(){
	return mombezw;
}
void setpromien(float r){
promien=r;
}
void setmombezw(float I){
mombezw=I;
}
public walec(int m, int r){
	setMasa(m);
	setpromien(r);
}
public float momentb(){
	setmombezw(getMasa()*getpromien()*getpromien()/2);
	System.out.println("moment bezw³adnosci walca to: "+getmombezw());
	return mombezw;
}
public void opis(){
	System.out.println("walec o masie "+getMasa()+" i promieniu "+getpromien());
}
}


