package esInterfacce;
public class Licantropo extends Personaggi implements Umano,Mostro{
	private boolean Maledizione;
	public Licantropo(int x) {
		super(x);
		if(x==15)
		Maledizione=true;
		else if(x==10) Maledizione=false;
	}
	public void combatti(){
		if (Maledizione) System.out.println("Errore: non c'è la luna piena!");
		else forzaFisica-=3;
	}
	public void azzanna() {
		if(!Maledizione) System.out.println("Errore: c'è la luna piena");
		else forzaFisica-=2;
	}
}
