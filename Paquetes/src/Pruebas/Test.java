package Pruebas;

import paquete1.Persona;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paquete1.Persona p = new paquete1.Persona(47,"Pepe");
		paquete2.Persona m = new paquete2.Persona(24, "Penelope", "Femenino");
//<<<<<<< HEAD
		paquete1.Persona n = new paquete1.Persona(37,"Juan");
//=======
		
		System.out.println("inicio de imprecion");	
//>>>>>>> branch 'master' of https://github.com/Parra-Garcia/Paquetes.git
		System.out.println(p.toString());
		System.out.println(m.toString());
//<<<<<<< HEAD
		System.out.println(n.toString());
//=======
		System.out.println("fin de imprecion");
//>>>>>>> branch 'master' of https://github.com/Parra-Garcia/Paquetes.git
		
	}

}
