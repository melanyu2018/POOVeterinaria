package main;

public class Perro {
	
	//Atributos
	public String nombrePerro;
	public static int edadP;
	
	//Constructores
	
	public Perro (String nombrePerro, int edad){
		this.nombrePerro=nombrePerro;
		edadP=edad;
	}
	
	//Metodos
	
	public Perro(String nombrePerro2) {
		// TODO Auto-generated constructor stub
	}

	public void ladrar(){
		// ladrar
	}
	
	public void mostrarDatos() {
		System.out.println("El nombre es : "+ this.nombrePerro);
		System.out.println("El nombre es : "+ this.edadP);
	}
	
	public static void funcionX() {
		System.out.println("Funcion static");
		edadP=2;
	}

}
