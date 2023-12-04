package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Perro p1= new Perro ("Mani",4);
		
		Perro.funcionX();
		Main.funcionX2();
		
		p1.mostrarDatos();

		Perro p2= new Perro ("Igor",3);
		
		p2.mostrarDatos();
		
		p1.funcionX();
		//p2.funcionX();
		
		p1.mostrarDatos();
		p2.mostrarDatos();
		
		
		
	}
	
	public static void funcionX2() {
		
	}

}
