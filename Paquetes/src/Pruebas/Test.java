package Pruebas;

import paquete1.Persona;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paquete1.Persona p = new paquete1.Persona(47,"Pepe");
		paquete2.Persona m = new paquete2.Persona(24, "Penelope", "Femenino");
		paquete1.Persona n = new paquete1.Persona(37,"Juan");
		System.out.println(p.toString());
		System.out.println(m.toString());
		System.out.println(n.toString());
		
	}

}
