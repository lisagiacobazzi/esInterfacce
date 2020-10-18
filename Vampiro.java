package esInterfacce;
public class Vampiro extends Personaggi implements Mostro{
	public Vampiro() {
		super(15);
	}
	public void azzanna(){
		forzaFisica-=2;
	}
}
