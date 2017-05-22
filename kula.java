package jpo;

public class kula extends PMaterial {
	float promien;
	float mombezw;
	void setpromien(float promien){
		this.promien=promien;
	}
	float getpromien(){
		return promien;
	}
	void setmombezw(float mombezw){
		this.mombezw=mombezw;
	}
	float getmombezw(){
		return mombezw;
	}
	public kula(float m, float r){
		setMasa(m);
		setpromien(r);
	}
	public float momentb(){
		setmombezw(2*getMasa()*getpromien()*getpromien()/5);
		System.out.println("Moment bezwladnosci kuli to: "+getmombezw());
		return mombezw;
	}
	public void opis(){
		System.out.println("kula o masie "+getMasa()+" i promieniu "+getpromien());	
	}	
}
