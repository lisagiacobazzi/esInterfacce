package esInterfacce;
public class MainClass{
	public static void main(String[] args) {
		Eroe eroe=new Eroe();
		Vampiro vampiro=new Vampiro();
		int x=15;
		Licantropo licantropo=new Licantropo(x);
		
		eroe.combatti();
		eroe.combatti();
		eroe.combatti();
		vampiro.azzanna();
		licantropo.azzanna();
		licantropo.azzanna();
		
		System.out.println("Forza fisica Eroe: " +eroe.forzaFisica);
		System.out.println("Forza fisica Vampiro: " +vampiro.forzaFisica);
		System.out.println("Forza fisica Licantropo: " +licantropo.forzaFisica);
		
	}
}
