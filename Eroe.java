package esInterfacce;
public class Eroe extends Personaggi implements Umano{
	public Eroe() {
		super(10);
	}
	public void combatti(){
		forzaFisica-=3;
	}
}
