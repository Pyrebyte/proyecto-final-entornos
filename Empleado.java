package inmobiliaria;

import java.util.*;

public class Empleado extends Persona {

	String codEmp;

	public Empleado(String dni, String nombre, String apellidos, String fechaNac,String telefono, String direccionP, String codEmp) {
		super(dni, nombre, apellidos, fechaNac, telefono, direccionP);
		this.codEmp = codEmp;
	}
	
	public String getCodEmp() {
		return codEmp;
	}

	public void setCodEmp(String codEmp) {
		this.codEmp = codEmp;
	}
	
	public String toString(){
		return super.toString()
				+ "\nCodigo de empleado: " + codEmp				 
				+ "\n";	
	}
}
